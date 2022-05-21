## JASON : 데이터 형식(단순히 데이터를 표시하는 표현방법)
- HTML <-*JASON*-> JAVA / node.js / Python /Ruby ... <-> DB  
  - JASON : JAva Script Object Notation
    - 전송구역, 데이터포맷
    - ex) HTML에서 로그인하려고 할 때 그 데이터를 JAVA 등을 통해 DB에서 체크할 수 있게 해 주는 전송구역  

- JAVA에서의 JASON : Map

- "key" : "value"
  - 중괄호{}로 감싼다
  - key 
    - 중복 불가능
  - value 
    - 중복 가능 
    - 숫자형(int, double), 문자형(String), boolean형, 배열형(array), null


- datatype boolean : 'is' + '명사'
  - ex) isMarri, isLogin, isMeal : TRUE or FALSE

- json > data 출력 : console.log( jsontypeName.keyName )
- json > json > data 출력 : console.log( jsontypeName.jasontypeName.keyName )
---
        
## json은 위에 변수에 영향을 받지 않음
- jsonParam.uwerName = '정지유' 이렇게 json입력
- 이때 id는 중복 안되니까 key값으로 사용
1. json 선언
2. key값을 phone으로 두고 값을 입력
3. elementId를 iphone으로 두고 값을 입력
4. 결과  
```
    var jsonParam = { };    
    jsonParam.phone ='010-3434-8310';  
    var elementId = 'iphone';  
    jsonParam.elementId = 'ipone mini';  
    jsonParam = { phone : '010-3434-8310' , elementId : 'ipone mini' };  
```
- key값이 iphon이 아닌 elementId로 들어간 것으로 볼 때 json은 변수에 영향을 받지 않음

```
    var jsonParam = { };  
    jsonParam.phone ='010-3434-8310';  
    var elementId = 'iphone';  
    jsonParam[ elementId ] = 'ipone mini';  
    jsonParam = { phone : '010-3434-8310' , iphone : 'ipone mini' };  
```
- 이렇게 elementId 의 값을 key로 주고싶을 땐 이렇게 배열로 넣는다
---
### JASON 연습 : 항상 연관있는 것들끼리 묶기
- 주제 : 영화  
- 장르, 배우, 영화제목, 배급사, 상영시간을 담기  
```
    var 영화 = {  
      장르 : ['로맨스', '액션', '판타지']  
      영화제목 : ['어바웃타임', '라라랜드']  
      배우 : ['라이언고슬링', '엠마스톤']  
      }    
```
- 위 json의 문제점 : 어떤 영화에 어떤 배우가 오는지 모름  
```
    var 영화 = {  
      배급사 : 'CJ',  

      영화제목 : [{  
      name : '스파이더맨 노 웨이 홈',  
      actor : ['톰홀랜드', '젠데이아'],  
      time : 148  
      },  
      {  
      name : '인터스텔라',  
      actor : ['앤 해서웨이', '매슈 매커너히'],  
      time : 169  
      }]  
    }  
```
- 배급사는 공통, 영화는 다름  
- 영화제목 : [ { },{ } ] 이렇게 json안에 json이 가능함 
- json이 필요한 이유 : 전부 변수 하나하나로 담아서 보낼 수 없어서 json으로 만들어 보냄


---
- emp테이블을 예시로  
```
    var emp = {  
      empno : 3450,  
      ename : 'SMITH',  
      sal : 3400,  
      dname : ['개발팀', '영업팀'],  
      hiredate : '21-12-31',  
      상사이름 : ['BRIAN', 'KING']  
      }
```
---
  
- 이때 팀원 수, 부서장 까지 담기  
```
    var emp = {  
      empno : 3450,  
      ename : 'SMITH',  
      sal : 3400,  
      dname : [{  
          name : '개발팀',  
          count : 5,  
          부서장 : '홍길동'  
          },
          {
          name : '영업팀',
          count : 7,
          부서장 : '최길동'
          }],  
      hiredate : '21-12-31',  
      상사이름 : ['BRIAN', 'KING']  
      }
```
---
- 가장 많이 사용되는 회원가입  
```
    var 회원가입 = {  
      이름 : '정지유',  
      주소 : '대전광역시',  
      취미 : ['독서', '런닝', '영화보기']  
      }  
```