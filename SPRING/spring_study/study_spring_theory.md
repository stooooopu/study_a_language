# Spring 
Spring이란?
- java로 다양한 어플리케이션(웹 or 앱)을 만들기 위한 틀  
 틀 = framework = platform
- spring부터 서버가 됨 이 전에 자바는 단지 결과를 보여주는 것
- spring덕분에 JAVA에서 jdbc로 어렵게 넘기던 DB가 코드 몇 줄로 넘어감

Spring종류
1. spring legasy( 일반 spring )
2. spring boot( 경량 spring )
3. spring 전자정부 프레임워크 (egov)

Spring 배우는 이유
- 검증 된 tool (다양한 프로그램들로 여러 상황에 대한 검증을 마침)  
-> 검증 되었으니 회사에서 spring을 사용  
-> 회사에서도 spring을 사용하는 개발자를 원함  
-> 교육기관에서도 spring을 베이스로 교육  
- 결론 : 수요가 많음
---
# Spring 3대 개념
1. IoC
2. DI
3. AOP
## 1. IoC
Inversion of Control  
inversion : 역전 / control : 제어  
제어가 역전 됨 (new로 인스턴스화 하지 않음)
```
기존 프로그램

1. 객체 결정 및 생성 
2. 의존성 객체 생성(클래스 내부에서 생성)
3. 의존성 객체 메소드 호출
=> 모든 작업을 사용자가 제어하는 구조
```

```
IoC

1. 객체 생성 
2. 의존성 객체 주입 (제어권을 스프링에게 위임 -> 스프링이 만들어놓은 객체 주입)
3. 의존성 객체 메소드 호출
=> 객체의 생성부터 소멸까지 스프링에서 관리
```
```
의존성 : 변경에 의해 영향을 받는 것

class A {
    public B metohdName(B b){
        return new B();
    }
}
```
## 2. DI
Dependency Injection  
dependency : 의존 / injection : 주입  
Spring에 객체(class)가 필요하다면 외부에서 가져와서 주입하는 방식  
(객체를 외부에서 가져다 쓰기때문에 new 연산자가 사라짐)  

## 3. AOP
Aspect Oriented Programming  
관점지향프로그래밍  
여러 메소드(함수)에서 중복되는 코드가 있다면, 따로 모아서 재활용 하는 것  

---
# Spring규칙

패키지 안, 패키지 안, 패키지가 기본임  
com패키지 안에 example 안에 first_spring이 있음  
```
com.example.first_spring  
이 3개의 패키지는 디폴트임
```
_www.naver.com 이런식으로 페이지가 설정되어 있음을 참고_  
암묵적인 약속으로 __패키지1__ 만들고  
그 안에 __.패키지2__ 만들고  
__.패키지3__ 을만든다  

- 첫번째 패키지 : com, io, kr등 _(www는 생략)_
- 두번째 패키지 : 회사이름, 팀 이름, 조직 이름 ...
- 세번째 패키지 : 프로젝트 명  

package com.example.first_spring안에  
package .controller  
package .service   
package .mapper 등 만들기
# Package
1. controller : url 요청을 받는 곳
- 실행 시켰을 때 controller에서 가장 먼저 url을 보고 해당 메소드를 실행
2. Service  
- 비즈니스로직 구현

---
# methodName
- Controller
    1. call_()
    2. load_()
- Service
    1. get_(), set_(), 동사표현(make, upload, download ...)
- Mapper
    1. find_(select), save_(insert, update), delete_()
    2. get_(), set_()
    3. select_(), update_(), insert_(), delete_()(query로 작명)

---
# URL of Controller
URL을 요청받는 방법
## 1. Restful 
직관적인 URLNAME  
emp/job/{job}/sal/{sal} => resource  
@PathVariable : {　}에 파라미터에 대입  
```
Restful 주소받는 규칙

 1. 동사x, 명사로 작성  
 ex) members/insert (x) 
 	members/no/{123} (o)
 2. 소문자로만 작성  
 3. 복수명사를 의미할 때는 s를 붙임
	/member (x)
	/members (o)
 4. 마지막 주소에는 /를 붙이지 않음
 5. _는 사용하지 않음
```
```
	resource간에 관계가 있는 경우

	ex)	핸드폰을 소유한 학생 번호조회
		/students/{no}/phone/
		/리소스 명/리소스 ID/관계가 있는 다른 리소스

	ex) 130번 번호를 가진 고객 주문 리스트 조회
		/customers/130/orderList
		/customers/130/order/list
		/customers/130/order-list

	ex) 20번 번호를 가진 유저의 핸드폰 고유번호는 AA123
		/users/20/phone/AA123
	
	ex) 사원번호가 7000 사원의 사수번호는 3000
		/emp/7000/mgr/3000
		/emp/empno/7000/mgr/mgrno/3000
```
## QueryString
검색(필터링)할 때 많이 사용  
게시판, 검색

---
# 계층
Client -> Controller ->Service -> Mapper  
각 계층
- 프리젠테이션계층 : controller에서 나온 결과화면  
- 비즈니스계층 : service
- 퍼시스턴스계층 : Mapper(DAO)

---
# IP접속
```
192.168.0.227:8080/index
    IP       : port번호 / url주소
```
현재 학원에서는 같은 라우터로 ip를 받고있어서  
내부 ip로 접속가능  
다른 곳에서 접속을 원하면 외부ip필요  
```
192.168.0.227:8080/index = localhost:8080/index   
localhost = 내ip  
```
만약 main을 실행 한 상태에서  
다시 실행을 하면 밑에 박스안에 있는 것처럼  
port번호 8080은 이미 실행중이라는 창이 뜸
```  
Web server failed to start. Port 8080 was already in use.
```
이때는 오른쪽 하단 모니터 아이콘 display selected consol에서  
첫 번째 실행중인 consol을 정지  
그리고 다시 실행   

---
# Other
- bean : Spring이 생성부터 소멸까지 관리해 주는 class  
- binery (bin) : 이진법  
- .gitignore : 해당 파일안에 적혀있는 폴더나 파일은 업로드할 때 건너 띔  
개인적인 파일이나 폴더를 업로드하기 싫음-> 그 폴더경로를 작성
- VO = DTO
- ctrl + shift + x : 대문자 변환
- 부등호  
```
<  :  &lt;
>  :  &gt;
<= :  &lt;=  
>= :  &gt;=
```
- Spring bookmarks  
window -> show view -> bookmarks  
원하는 메소드 왼쪽 line에 오른쪽 버튼 클릭 -> Add bockmarks