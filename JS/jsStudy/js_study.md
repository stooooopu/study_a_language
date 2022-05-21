## JAVASCRIPT
- JS는 데이터 타입이 없음
- TERMINAL -> new terminal -> 저장 후 출력창에 node + i + tab key
- var 하나로 통일
- ;은 안찍어도 되지만 권장함
```
      print.ln = consol.log()  
      var num1 = 10;  
      var num2 = 20;  
      var result = num1+num2;  

      console.log(result);  
        if(result==30){  
          console.log('30입니다')  
        } 가능  

      for (var i=0; i<10; i++){  
          console.log(i);  
        } 가능  
```
- 상수 표시
  - JAVA  
    final PI = 3.14
  - java script  
    const PI = 3.14

- A == B : A와 B는 같다
- A === B : A와 B는 같고 자료형도 같다
- ex)  
```
  var a = "1";  
  var a1 = 1;  
  a == a1 : true  
  a === a1 : false
```
---
## 함수 (메소드 / function)
1. 항상 함수는 작게 만들어야 한다
2. 함수는 한 가지를 해야한다  
그 한 가지를 잘 해야한다  
그 한 가지만을 해야한다  
3. 대가(Master) 프로그래머들은 시스템을 구현할 프로그램이 아니라  
풀어갈 이야기로 여긴다  
(function은 하나의 스토리, 모든게 모여서 하나의 책이 된다는 느낌)

### function 특징
1. return type 정의 x
2. 호출할 때 parameter값 optional
3. parameter에 data type 정의 x
4. parameter에 function 허용
5. return값에 function 가능(클로저)

### click했을 때 event 처리 방법
1. onclick
  - parameter로 this를 넘겨줄 때만 사용
  - 사용을 지양
2. $().on('click',익명 function)
3. $().click(익명 function)
--- 

## 객체지향 프로그래밍
- java, python, js, node, react, C++, C# ...
- this : 본인, data type : object(java:class)
- super : 부모
- 파일명에 min이 들어간 파일은 압축 된 파일로 띄어쓰기나 공백이 없음
---
## 리눅스 명령어
- pwd : 현재 경로 확인

- ls : 현재 경로에 있는 파일 및 폴더 확인
  - Desktop : 바탕화면

- cd : 폴더 접속
  - ex) cd 폴더이름 / ..(뒤로가기)

- clear : 명령어 내용 삭제
  - 해당경로에서 다시 시작 (원래 경로가 아님)

