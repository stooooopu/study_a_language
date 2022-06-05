## CREATE
```sql
CREATE TABLE A
(id VARCHAR2(10) NOT NULL,
number NUMBER(10),
CONSTRAINT A_PK PRIMARY KEY (id));

CREATE TABLE A
(id VARCHAR2(10) NOT NULL PRIMARY KEY,
number NUMBER(10));
```
## ALTER
```
여러개의 컬럼 동시에 수정구문 지원 안함
괄호를 사용하지 않음
```
## UNIQUE
```
테이블 내에 중복되는 값이 없지만 NULL입력 가능
```
## 물리적 테이블 명
```
테이블명과 컬럼명은 반드시 문자로 시작
A-Z, a-z, 0-9, _, $, #
```
## FK
```
1. 테이블 생성시 설정
2. null가능
3. 한 테이블에 여러개 존재 가능
4. 참조 무결성 제약을 받을 수 있음
```
## constraint(제약조건)
```
데이터베이스에서 데이터의 무결성을 유지하기 위하여 테이블 특정 컬럼에 설정하는 제약
PK : 테이블당 하나
UNIQUE KEY : null값을 가질 수 있음
FK : 테이블간 관계정의를 위해 PK를 다른테이블의 외래키가 참조하도록 생성
```
## ALTER로 컬럼삭제
```sql
ALTER TABLE A
DROP COLUMN 컬럼명
```
## 테이블 이름 변경
```sql
RENAME old_name TO new_name
```
## 이벤트 종류  
```
masterTABLE - childTABLE

1. DELETE ACTION

CASECADE : master삭제시 child 함께 삭제
SET NULL : master삭제시 child null
SET DEFAULT : master삭제시 child default값
RESTRICT : child 테이블에 PK값이 없는 경우에만 master삭제 허용
NO ACTION : 참조무결성을 위반하는 삭제/수정 액션 없음

2. INSERT ACTION
AUTOMATIC : master 테이블에 PK없는 경우 master에 PK생성 후 child값 입력
SET NULL : master 테이블에 PK없는 경우 child FK를 null
SET DEFAULT : master 테이블에 PK없는 경우 child FK를 default값
DEPENDENT : master 테이블에 PK가 존재할 때만 child입력 허용
NO ACTION : 참조무결성을 위반하는 입력액션을 취하지 않음
```
## VARCHAR2
```
문자형이지만 숫자도 사용 가능
```
## DISTINCT
```
데이터의 중복 제거
GROUP BY로도 가능
```
## TRUNCATE TABLE
```
특정 테이블의 모든 데이터를 삭제, 디스크 사용량을 초기화
테이블이 삭제되는 것이 아닌 데이터를 삭제하고 저장공간을 재사용 가능하도록 해제
```
## DELETE TABLE
```
특정 테이블의 모든 데이터를 삭제, 디스크를 초기화 하지 않음
```
## DROP TABLE
```
특정 테이블의 모든 데이터를 삭제, 디스크의 사용량을 초기화, 스키마의 정의도 함께 삭제

스키마
CREATE TABLE IF NOT EXISTS 테이블명(
    ---내용--- 
    )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
```
## DDL
```
auto commit
```
## DML
```
사용자 commit
```
## TRANSECTION
```
DB의 논리적 연산단위, 밀접히 관련되어 분리될 수 없는 한 개 이상의 DB조각
```
```
1. 원자성 : 트랜젝션에서 정의된 연산들은 모두 성공적 실행 or 전혀 실행 안됨
2. 일관성 : 트랜젝션이 실행되기 전의 DB내용이 잘못되지 않았으면 실행 후에도 DB내용은 잘못되면 안됨
3. 고립성 : 트랜젝션이 실행되는 도중에 다른 트랜젝션의 영향을 받아 잘못된 결과를 만들면 안됨
4. 지속성 : 트랜젝션이 성공적으로 수행되면 DB의 내용은 영구적으로 저장
```
## COMMIT
```
종료를 위한 대표적 명령어, 변경사항을 DB에 영구적으로 반영함
```
## ROLLBACK
```
COMMIT되지 않은 상위의 데이터 변경사항이 폐기 -> 변경 전 상태로 되돌림
```
## SAVEPOINT
```
현 시점에서 SAVEPOINT까지 일부만 ROLLBACK
```
## 부정비교 연산자
```
!= , ^=, <>
NOT 컬럼명 = : ~과 같지 않다
NOT 컬럼명 > : ~보다 크지 않다
```
## CONCAT
```

```
## 단일행 다중행
```
1. 단일행 함수는 SELECT, WHERE, ORDER BY, UPDATE의 SET절에 사용 가능
2. 1:M 관계의 조이이라 하더라도 M쪽에서 출력 된 행이 하나씩 단일행 함수의 입력값으로 사용되므로 사용 가능
3. 다중행 함수도 단일행 함수와 동일하게 단일 값만을 반환
```
```
다중행
집계함수, 그룹 함수, 윈도우 함수
```
## SEARCHED CASE EXPRESSION
```sql
SELECT t.id,
CASE WHEN t.color = 1 THEN 'Red'

    WHEN t.color = 2 THEN 'Blue'

    WHEN t.color = 3 THEN 'Green'

    ELSE 'NoColor' END AS color

FROM t

```
위의 예시를 보면 Searched Case Expression에서는  
t.color의 조건에 따라 결과값을 리턴해주는 것을 확인할 수 있다.
## SIMPLE CASE EXPRESSION
```sql
SELECT t.id,

CASE t.color WHEN 1 THEN 'Red'

            WHEN 2 THEN 'Blue'

            WHEN 3 THEN 'Green'

            ELSE 'NoColor' END AS Color

FROM t

```
위의 예시를 보면 Simple Case Expression에서는  
t.color가 무슨 값인지의 expression에 따라서 리턴값이 정해진다.
## 단일행 NULL관련 함수
```
oracle      : NVL(표현식1, 표현식2) 
SQL server  : ISNULL(표현식1, 표현식2)
표현식1값 = NULL => 표현식2 값 출력
이때 표현식1dataType = 표현식2dataType

NULLIF(표현식1, 표현식2)
표현식1 = 표현식2 => NULL
표현식1 != 표현식2 => 표현식1

COALESCE(표현식1, 표현식2 ...)
임의의 개수 표현식에서 NULL이 아닌 최초의 표현식 나타냄
모든 표현식이 NULL => NULL

C1  C2  C3
1   2   3
    2   3
        3
이때 각 컬럼에서 NULL이 아닌 가장 첫 번째 값은 1 2 3
```
## TOP( N )
```
상위건수 N만큼 출력
```
## WITH TIES
```
N에 해당하는 건수중 동일한 건수도 출력 TOP() 과 함께 쓰임
```
## EQUI JOIN
```
WHERE절에 JOIN조건을 넣음
JOIN에 관여하는 테이블 간의 컬럼 값들이 정확하게 일치하는 경우에 사용
'=' 연산자에 의해서만 수행
```
## 옵티마이저
```
가장 효율적인 방법으로 SQL을 수행할 최적의 처리 경로를 생성해주는 DBMS의 핵심 엔진
```
## 순수 관계 연산자
```
SELECT연산 : WHERE절로 구현
PROJECT연산 : SELECT절로 구현
(NATURAL)JOIN연산 : 다양한 JOIN기능으로 구현
DIVIDE연산 : 현재 사용되지 않음
```
## 다중조인
```
```
## NATURAL JOIN
```
1. 반드시 두 테이블 간의 동일한 이름, 타입을 가진 컬럼이 필요 
2. 조인에 이용되는 컬럼은 명시하지 않아도 자동으로 조인에 사용
3. 동일한 이름을 갖는 컬럼이 있지만 데이터 타입이 다르면 에러
4. 조인하는 테이블 간의 동일 컬럼이 SELECT 절에 기술되도 테이블 이름을 생략
```
```sql
select *
from emp 
natural join dept
where DEPTNO =10
```
## USING
```
USING조건절을 이용한 EQUI JOIN에서도 NATURAL JOIN과 마찬가지로 JOIN컬럼에 대해서는 ALIAS나 테이블 이름과 같은 접두사를 붙일 수 없음
```
## DATE TYPE
```
+1일
SYSDATE + 1
+1시간
SYSDATE + 1/24
+10분
SYSDATE + 1/24/6
+1분
SYSDATE + 1/24/60
```
## CROSS JOIN
```
두 테이블간 JOIN조건이 없을 경우 생길 수 있는 모든 데이터의 조합
```
## UNION
```
두개의 테이블을 조회할 때 중복되는 데이터는 제거 된 후 출력
```
## UNION ALL
```
두개의 테이블을 조회할 때 중복되는 데이터까지 출력
ALIAS는 첫번째 SQL모듈기준
정렬기준은 마지막 SQL모듈기준
```
## JOIN의 ON절
```
ON절 안의 조건은 필터링에 대한 조건
```
## (+)
```
'(+)' 기호의 위치의 반대쪽 테이블이 OUTER JOIN의 기준이 되는 테이블
```
```sql
a.id = b.id (+) -- LEFT OUTER
 
a.id(+) = b.id  -- RIGHT OUTER
```
## INTERSECT
```
교집합 중복된 행은 하나의 행으로 함
```
## EXCEPT
```
앞의 sql결과에서 뒤의 sql문의 결과에 대한 차집합 
중복된 행은 하나의 행
```
## START WITH / CONNECT BY PRIOR 
```
1. START WITH 절에 시작 조건을 찾음

2. CONNECT BY 절에 연결조건을 찾음

```
## ORDER SIBLINGS BY
```
조회된 데이터에 대해 특정 컬럼에 대한 ORDER BY 실행
계층에 맞는 order by
```
## 1:1 필수관계
```
하나의 테이블에 데이터를 넣으면 다른 테이블에도 반드시 넣어야 하는 것
```
## 다중 컬럼 서브쿼리
```
서브쿼리의 결과로 여러개의 컬럼이 반환되어 메인쿼리의 조건과 동시에 비교되는 것을 의미
SQL Server에서는 지원하지 않음
```
## 비연관 서브쿼리
```
주로 메인쿼리에 값을 제공하기 위한 목적으로 사용
```
## 연관 서브쿼리
```
서브쿼리가 메인쿼리 컬럼을 포함하고 있는 형태의 서브쿼리
```
## VIEW
```
1. 독립성 : 테이블구조가 변경되어도 뷰를 사용하는 응용프로그램은 변경하지 않아도 됨
2. 편리성 
- 복잡한 질의를 뷰로 생성, 관련 질의를 단순하게 작성가능 
- 해당 형태의 SQL문을 자주 사용할 때 뷰를 이용 편리하게 사용 가능
3. 보안성 : 숨기고싶은 정보가 존재, 뷰를 생성할 때 해당 컬럼을 빼고 생성함으로써 사용자에게 정보를 감출 수 있음
```
```sql
-- view생성
create view 뷰이름 as sql문 (select문) ;
-- view삭제
drop view 뷰이름 ;
```
## PARTITION BY
```
그룹내 순위 및 그룹별 집계를 알 수 있음
```
## RANK
```
순위를 구하는 함수로 동일값에 동일한 순위일 경우 중간 순위는 비워둠
```
## DENSE_RANK
```
동일순위를 부여하되 중간값을 비워두지 않음
```
## ROW_NUMBER
```
동일값에도 유일순위 부여
```
## LAG
```
현재 읽혀진 데이터의 이전 값을 알아냄
```
## LEAD
```
현재 읽혀진 데이터의 이후 값을 알아냄
```
## ROLE
```
사용자와 권한 사이에서 중개역할 수행
```
## index
```
규칙기반 옵티마이저는 적절한 인덱스가 존재하면 항상 인덱스를 사용하려고 함
인덱스 범위 스캔은 결과가 없으면 한 건도 반환 안할 수도 있음

1. 기본index : NOT NULL & UNIQUE
- 조회 삽입 삭제 갱신 할 때 부하를 가져옴
- 자주 변경되는 데이터는 UPDATE DELETE성능에 좋지 않은 영향을 미침

2. 보조 index : UNIQUE가 아니라면 중복 입력 가능

B-TREE index : 브랜치 블록과 리프 블록으로 구성, OLTP환경에서 많이 사용
               브랜치블록 - 분기를 목적
               리프블록 - 인덱스를 구성하는 컬럼의 값
CLUSTERED index : index의 리프 페이지 = 데이터 페이지
                  리프 페이지의 모든 데이터 = 인덱스 키 컬럼 순으로 물리적 정렬
BITMAP : 하나의 인덱스 키 엔트리가 많은 행에 대한 포인터를 저장하고 있는 구조
```
## 옵티마이저와 실행계획
```
ORACLE의 규칙기반 옵티마이저에서 우선순위가 높은 규칙 Single row by rowid
비용기반 옵티마이저 통계정보를 사용하여 실행계획을 수립
 -> 통계정보가 변경되면 실행계획이 달라질 수 있음
ORACLE의 실행계획에 나타나는 기본적인 JOIN = NL Join, Hash Join, Sort Merge Join
```
```
Hash Join
    - DW등의 데이터 집계업무
    - sort merge join하기에 투 테이블이 너무 커서 부하가 심할 때 유용
    - EQUI 조인 조건에서만 동작
    - 행의 수가 적은 테이블을 선행 테이블로 선택하는 것이 유리
    
Sort Merge Join
    - DW등의 데이터 집계업무
    - Non EQUI Join조건에서도 사용 가능
    - join 조건의 인덱스의 유무에 영향받지 않음

NL Join
    - OLTP목록 처리업무
    - 자연조인이 효과적일 때
    - Driving Table의 조인 데이터 양이 큰 영향을 주는 조인 방식
    - 유니크 인덱스를 활용, 소량 테이블을 온라인 조회하는 경우 유용

```
---
# ||
```
문자 합치기
```
---




