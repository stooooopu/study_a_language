# 관계형 데이터베이스 (RDBMS)
## DB > table > data
- 데이터를 더욱 안전하게 저장
- 서로의 테이블끼리 관계가 있음
  - JOIN이 있음
  - 부모 테이블과 자식 테이블이 존재
```
  emp table 안에 deptno column 이 존재  
  이때 deptno column 은 dept table에서 온 것  
  deptno column이 없으면 emp table 설정 불가
  
  => emp table은 dept table을 참조하고 있음 

  => 부모 : dept / 자식 : emp (참조하는 쪽이 자식이 됨)  
```
- DB모델링에서 화살표는 참고를 의미  
```
  x -> y 

x가 y를 참조한다 => 부모 : y / 자식 : x  
이때 y는 따로 참조하는 테이블이 없는 고유한 테이블 
=> 원시테이블  
```
---
## 문법
### from > where > group by > having > select > order by
1. SELECT
- select _columnName_
    - 통계, count(columnName)
    - Date_format
    ```
    select date_format ('%y-%m')
      2자리 년도, 2자리 월 (22-04)

    select date_format ('%Y')
      4자리 년도 (2022)
    ```
2. FROM
- from _tableName_
3. WHERE
- where _조건_
  - 연산자 : like, and, or, is null, is not null
  - like : 특정 단어가 들어가는 걸 찾고싶을 때
```
    WHERE columnName like 'a%'
      columnName 중 a가 들어가는 모든 것 조회
    
    WHERE _columnName_ lick '%a%a%'
      columnName 중 aa가 들어가는 모든 것 조회
```
  - and / or : and먼저 실행되기 때문에  
  or을 먼저 실행시키고 싶으면 (　)를 활용
  - between : 두 날짜 사이의 날짜 선택
```
    WHERE
      DateColumnName between 'yyyy/MM/dd' and 'yyyy/MM/dd'
```
4. GROUP BY
- group by _columnName_
5. HAVING
- having _group by 후 통계함수 조건_
  - 통계 sum, avg, max, min, count()
6. ORDER BY
- order by _columnName_ asc : 오름차순
- order by _columnName_ desc : 내림차순
---

비관계형 데이터베이스 (NoSQL)
 - 데이터를 분석하는 것이 목적
 - 대표적인 프로그램 : DynamoDB, MongoDB
 - JOIN이 없음