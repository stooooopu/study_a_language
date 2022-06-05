## MODELLING

1. 테이블 설계
2. 정규화
3. 역정규화 여부 결정 (선택)
4. 분산 저장 여부 결정 (선택) 
- 분산이 결정되면 권한도 분산시킴
  - A컴퓨터 : SELECT / B컴퓨터 : INSERT, DELETE, UPDATE => 두 컴퓨터를 동기화 해줌 => replication(복제)
  - 어차피 같은 데이터를 똑같이 옮기는 이유
      - 비교적으로 SELECT가 컴퓨터에 부담이 덜 됨, INSERT, DELETE, UPDATE가 컴퓨터에 더 부담 됨

EMP ,DEPT로 현재 조회 연습을 했는데  
이때 만약 DEPT table이 없고 EMP하나로 합쳐졌다고 가정  
```
    empno : 100  
    ename : 정지유  
    dname : 개발팀  
    loc :  대전  
```
여기에 기획팀이 추가 됐다고 가정  
```
    empno : null  
    ename : null  
    dname : 기획팀  
    loc :  대전  

=> table에 null 데이터가 많으면 정규화(모델링)고려대상
```
- index : 목차  
   - 데이터가 많을 수록 조회하는 속도가 느려짐
   - 그래서 index(목차)를 먼저 확인하고 찾는 게 빠름

## PRIMARY KEY(PK)
- 중복 허용 안됨
- 자동으로 index가 붙음

## FOREIGN KEY(FK)
- 중복 허용 됨
    - 만약 중복 허용 안되게 하고 싶으면 : 해당 컬럼에 unique key 추가
    - 문법
```
     CREATE TABLE emp (  
        deptno int,  
        UNIQUE KEY emp(deptno))  
        CREATE TABLE emp (  
        deptno int UNIQUE KEY)  
    
이럴경우 FK가 PK처럼 활용 가능  
```
- index가 없음 -> index를 따로 생성해야 함
```  
   CREATE INDEX <>  
    ON <> (컬럼명1, 컬럼명2, ...);  
```

- 1대 n의 관계 (one to many) : DEPTNO 과 EMP TABLE의 관계  
    DEPTNO 테이블 1개에 EMP에 deptno가 겹쳐서 존재하며 n개가 가능한 관계

- 1대 1의 관계 (one to one)  
    - 사람 : 청약통장
    - 사람 : 주민등록번호
    - 군인 : 총기
    - 1대 1관계는 하나로 합칠 수 있음 : 역정규화

- n대 n의 관계(many to many)  
    - 쇼핑몰 : 회원table PK + 상품tabld PK (n대 n의 관계)  
    = NEW CREATE 구매table(n 대 n 테이블/다 대 다 테이블)  
    -> 회원이 상품을 담아야 구매테이블이 생김  
    - 작곡 + 작사 (n대 n의 관계) = 노래 (n 대 n 테이블)  
    - 교사 + 학생 (n대 n의 관계) = 수업 (n 대 n 테이블)  
    - 쉐프 + 재료 = 요리  
    - 독단적으로 생길 수 없는 테이블 => 부자관계가 없음  

- ※SQL안에서 자동 update가능함 = 트리거

## 역정규화
논리적으로는 나뉘는게 맞지만  
데이터가 적고 데이터가 주기적으로 들어오거나 업데이트 되지 않으면  
오히려 테이블이 나누어져 있는게 손실을 가져옴  
때문에 데이터 손실을 막기 위해 null값을 감수 하면서 테이블을 다시 합침  
