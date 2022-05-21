
## 바닐라.js 에서 jQuery 넘어간 이유
- 바닐라.js(순수 자바크립트)
  - document.getElementBy( id/className/name ) : 태그를 불러옴
- 기능적 한계
- 2008 ~ 2017,8년까지 제이쿼리 많이 사용
- 2018 이후 React, Vue, 앵귤러
- 현재는 jQuery or React (tag controll)
- html --(jQuery)--> JAVA --> DB

---

## jQuery 장점
1. 비동기 통신 지원
2. 같은 동작을 짧은 코드로 구현
3. 구버전 브라우저 지원
4. 정의한 함수를 사용시 파라미터 값을 정의해주지 않아도 됨 (자유로움)  
  - java
    - x (int num) -> x(10)  
    x (int num, int num2) -> x(10, 20)
  - javaScript
    - x(int num) -> x() 

---
## 자주 사용 하는 jQuery
- $(" .className " or " #id ").css(" "," ");
  - .show(), .hide()
  - .append() : 해당tag에 다른 tag를 붙여줌
  - .children()
  - ***** .val() or .value(), .text(), .focus()  
  - ** attr()
---
## function
- function을 밑에 쓰는 이유 : 웹이 먼저 켜지고 스크립트를 실행해야 하기 때문
```
  강제로 스크립트를 실행
 
  $(function( ){ });
```
- $.ajax : 데이터 전송
  - ajax defualt value : 비동기전송
  - json으로 정의함
  - key와 value로 구성됨
```
  $.ajax (
      {
      url : API주소,
      type : HTTP method,  
      dataType : json or text,
      succes : function(response){

      },  
      error : function(request, status, error){  
          
      } 
    } 
  )
```
- url : 목적지
- type : GET, POST, DELETE, PATCH
- dataType : server응답 데이터  
요청을 하면 응답(return) 오는걸 json or text로 받음
- succes : function(변수이름) 
  - HTML에서 요청이 성공하면 익명함수 파라미터에 값을 대입
  - 서버로부터 온 데이터를 익명함수에 대입
- error : function(request, status, error) 
  - HTML에서 요청실패하면 익명함수를 실행
  - http error code 
    - 403 : 권한없음 
    - 404 : 없는주소
    - 500 : server내부결함, error
---

### jQuery함수를 변수에 선언할 수 있는 이유 
- jQuery에서 이미 정의 된 함수로 return값이 있어서 가능함
### data type
- let : 변수이름 중복 안됨
- var : 변수이름 중복 가능
### jQuery 선택자
- 전체 : $(' * ')
- 태그 : $(' h1, p ')
- Id : $(' #Id ') 
- className : $(' .className ')

```
    <body> 
      <div>
        <div>
          <p>Apple</p>
          <p>Banana</p>
          <p>Cherry</p>
        </div>
      </div>
    </body>

```
- 자손 : $('body > *')
- 후손 : $('body *')

  
---
## Closure
- 함수 + 함수가 선언된 어휘적 조합
- 클로저를 이해하려면 자바스크립트가 어떻게 변수의 유효범위를 지정하는지(Lexical scoping)를 먼저 이해해야 한다.
- 이해 후 정리 예정