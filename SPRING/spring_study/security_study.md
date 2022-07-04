# 암호화
## 암호화 하는 방법

1. 단방향 암호
- 복호화 불가능
- 한 번 암호화 하면 다시 복구할 수 없음

2. 양방향 암호
- 복호화
- 암호화 한걸 다시 복구할 수 있음
- 양방향 복호화 방법  
 public key 를 가진 사람만 해독할 수 있음
 
## 암호화 알고리즘

1. 어떠한 수학적 알고리즘으로 암호화가 됨
- 대표적 알고리즘 : SHA256

---
## spring에서 사용하는 암호화 : spring security (보안관련 기능 패키지)
### 암호화 전 DB password
![암호화01](/SPRING/spring_study/img/%EC%95%94%ED%98%B8%ED%99%9401.JPG)  
gradle
```gradle
	//spirng security
	implementation("org.springframework.boot:spring-boot-starter-security")
```  
java
- package .conf or confi 생성
- classFile : WebSecurityConfig
```java
package com.dw.board.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration // 설정파일 어노테이션
@EnableWebSecurity // 웹보안을 가능하게
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{ // 보안관련된 기능들을 상속
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.csrf().disable()
		.formLogin().disable();
	}
}
```
```java
//service
@Transactional(rollbackFor = {Exception.class})
	public int setStudents(StudentsVO vo) {
		// 학생 비밀번호 암호화
		String password = vo.getStudentsPassword();
		password = passwordEncoder.encode(password);
		vo.setStudentsPassword(password);
		return studentsMapper.insertStudents(vo);
	}
```
### 암호화 후 DB password
![암호화02](/SPRING/spring_study/img/%EC%95%94%ED%98%B8%ED%99%9402.JPG)

---
# 로그인화면에서 받은 정보 체크
- 조회는 get이지만 password처럼 중요한 정보가 url에 노출됨  
그래서 중요한 정보가 있는 것은 post로 보냄
- post : 중요한 데이터를 서버에 전송할 때 __post를 사용해서 body에 숨긴다__
```js
    var jsonData = {
    	studentsName : userId,
    	studentsPassword : userPassword
    }
```
- studentName은 중복되지 않는다고 가정
```java
// controller
@PostMapping("/login")
		public boolean callIsLogin(@RequestBody StudentsVO vo) {
			return studentsService.isStuents(vo);
		}

// service
@Transactional(rollbackFor = {Exception.class})
	public boolean isStuents(StudentsVO vo) {
		
		StudentsVO student = studentsMapper.selectStudentsOne(vo);

		// 회원이 있는지 없는지 부터 체크
		if(student == null) { // query결과가 null로 리턴
			return false;
		}

		// HTML에 입력된 패스워드
		String inputPassword = vo.getStudentsPassword(); 
		// DB에서 가져온 진짜 패스워드
		String password = student.getStudentsPassword(); 
		
		// passwordEncoder클래스에서 사용할 수 있는 method matches
		// 괄호안에 두 값이 암호화 된 상태인데 서로 같은지를 비교해줌
		if(!passwordEncoder.matches(inputPassword, password)) { // 비밀번호 체크
			return false;
		}
		return true;
	}
```
- id와 password가 맞는다면 true, 틀리면 false이기 때문에 리턴타입은 __boolean__
```java
//mapper
	public StudentsVO selectStudentsOne(StudentsVO vo);
```
```sql
<select id="selectStudentsOne" resultType="StudentsVO">
		SELECT
			students_id AS studentsId,
			students_name AS studentsName,
			students_password AS studentsPassword,
			create_at AS createAt
		FROM students
		WHERE students_name = #{studentsName}
	</select>
```
---
## 추가내용
- packageName : .confi or .conf  
설정과 관련 된 자바파일

- Bean : spring이 관리해 주는 class  
Spring이 객체의 생성과 소멸을 관리(new역할을 대신해 줌)