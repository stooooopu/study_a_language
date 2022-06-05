# sub query 
- 쿼리에 또 쿼리가 옴
- NULLABLE => 해당 컬럼에 null값이 올 수 있는지를 알려주는 것  
- 서브쿼리를 쓰기전에 꼭 필요한가 생각
- 서브쿼리 실행 -> 메인쿼리 실행  
기본 쿼리 순서는 무시 하지 않음 단지 괄호 먼저 실행할 뿐

## 1. SELECT  : 스칼라 서브쿼리
- A 테이블 (감기 관련)  
- B 테이블 (코로나 확진자 관련)  
- C 테이블 (오미크론 확진자 관련)  
- 조건. join을 할 수 있는 교집합데이터(컬럼)가 없음
```
     SELECT  
         COUNT(*) AS 감기 확진,  
         (SELECT COUNT(*) FROM B) AS 코로나 확진,  
         (SELECT COUNT(*) FROM C) AS 오미크론 확진  
     FROM A 
```
서브쿼리는 괄호 안에 있는 쿼리가 먼저 실행->외부쿼리(B->C->A 순)  
- ex)
```
    select   
         count(*) as 'emp 수',  
         (select count(*) from dept) as 'dept 수'  
    from emp  
```
---
## 2. FROM : 인라인 뷰
- 데이터를 먼저 필터링 해야할 때
- ex) emp테이블에 급여가 3000천 미만인 사람 데이터로 무언가를 활용 할 때
```
     select  
        e.ename,
        e.job  
     from ( select ename, job  
     from emp  
     where sal < 3000  
     ) as e  
```
---
## 3. WHERE : 중첩 서브쿼리
- 단일행 : where조건에 서브쿼리가 단일행이라면(ex PK) '=' 으로 가능
```
     select
             *  
     from emp  
     where ename =  
     (select ename  
     form emp  
     where empno = 3000)

이때 empno가 3000인 사람은 1명뿐 => 단일행
```
- 다중행 : where조건에 서브쿼리가 다중행이라면 in 으로 가능 =>  
데이터가 많아지면 많아질 수록 속도 저하  
- 실제로 존재하는 데이터의 값을 비교  
```
     select
             *  
     from emp  
     where ename in  
     (select ename  
     form emp  
     where sal < 3000)

sal이 3000 이상인 사람은 다수 => 다중행
```
in 대신 EXISTS를 쓸수도 있음 (거의 UPDATE에만 사용)  
괄호안에 있는 서브쿼리가 true면 외부쿼리 실행  
괄호안에 있는 서브쿼리가 false면 외부쿼리 실행 안함  
=> JAVA에서 flag와 비슷  
```
select
     ename  
from emp  
where exists (  
    select * from emp  
    where DEPTNO = 40)  
```
- 이때 emp 테이블의 deptno는 30까지만 있음 -> false => 실행안함
```
select
     ename  
from emp  
where exists (  
    select * from emp  
    where DEPTNO = 30)  
```
- 이때 emp 테이블의 deptno는 30까지만 있음 -> true => 실행

이 밑으론 거의 사용하지 않음  
4. HAVING  
5. ORDER BY  
6. INSERT  
7. UPDATE set ->EXISTS사용  