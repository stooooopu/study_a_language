# Group함수

- group_fanction
1. SUM
2. AVG
3. MAX
4. MIN
5. STDDEV
6. VARIANCE
7. COUNT

---
```sql
SELECT group_function(expr)
FROM tables;
```
- 테이블로 부터 전체 데이터를 부른 후  
__한 건의 데이터를 출력__
- 만약 tables이 아무런 데이터를 갖고있지 않았다면  
COUNT = 0;  
나머지 group_function = null;

---
```sql
SELECT group_function(expr)
FROM tables
WHERE conditions;
```
- WHERE절의 조건을 충족한 뒤  
__한 건의 데이터를 출력__
- 만약 WHERE절을 만족시키는 데이터가 없다면  
COUNT = 0;  
나머지 group_function = null;

---
```sql
SELECT c1, c2, c3, ... ,group_function(expr)
FROM tables
WHERE conditions
GROUP BY c1, c2, c3 ... ;
```
- 각 그룹별로 한건씩 결과 출력
- 출력할 결과가 없다면  
COUNT = 0;  
나머지 group_function = null;

---
```sql
SELECT deptno, COUNT(*), SUM(sal)
FROM emp
GROUP BY deptno
HAVING COUNT(*) > 4;
```
- deptno별로 grouping -> count 부서별인원  
HAVING절에서 조건으로 SELECT

---
# ROLLUP
```sql
SELECT deptno,
        job,
        SUM(sal)
FROM emp
WHERE deptno IN (10, 20)
GROUP BY ROLLUP(deptno, job)
```
- ROLLUP안에 deptno, job  
-> SUM(sal) = (deptno, job) : 부서와 직종 합  
(deptno) : 부서의 합 / (　) : 전체 합
```
deptno   job        TOTAL
  10    CLERK       1300 : (deptno, job)
  10    MANAGER     2450 : (deptno, job)
  10    PRESIDENT   5000 : (deptno, job)
  10                8750 : (deptno)

  20    ANALYST     6000 : (deptno, job)
  20    CLERK       1900 : (deptno, job)
  20    MANAGER     2975 : (deptno, job)
  20                10875 : (deptno)
                    19625 : (TOTAL)
```
```sql
ROLLUP(c1, c2)
```
- (c1, c2) / (c1) / (TOTAL)
```sql
ROLLUP( (c1, c2,) c3)
```
- 이때 같은 괄호안에 있는 c1과 c2는 같은 컬럼으로 생각
- (c1, c2, c3) / (c1, c2) / (TOTAL)

```sql
ROLLUP(c1, c2, c3)
```
- (c1, c2, c3) / (c1,c2) / (c1) / (TOTAL)

---
# CUBE
```sql
SELECT deptno,
        job,
        SUM(sal)
FROM emp
WHERE deptno IN (10, 20)
GROUP BY CUBE(deptno, job)
```
- CUBE안에 deptno, job  
-> SUM(sal) = (deptno, job) : 부서와 직종 합  
(deptno) : 부서의 합 / (job) : 직종 합 / (　) : 전체 합
```
deptno   job        TOTAL
  10    CLERK       1300 : (deptno, job)
  10    MANAGER     2450 : (deptno, job)
  10    PRESIDENT   5000 : (deptno, job)
  10                8750 : (deptno)

  20    ANALYST     6000 : (deptno, job)
  20    CLERK       1900 : (deptno, job)
  20    MANAGER     2975 : (deptno, job)
  20                10875 : (deptno)

        ANALYST     6000 : (job)
        CLEARK      3200 : (job)
        MANAGER     5425 : (job)
        PRESIDENT   5000 : (job)
                    19625 : (TOTAL)
```
```sql
CUBE(c1, c2)
```
- (c1, c2) / (c1) / (c2) / (TOTAL)
```sql
CUBE( (c1, c2,) c3)
```
- 이때 같은 괄호안에 있는 c1과 c2는 같은 컬럼으로 생각
- (c1, c2, c3) / (c1, c2) / (c3) / (TOTAL)

```sql
CUBE(c1, c2, c3)
```
- (c1, c2, c3) / (c1,c2) / (c1, c3) / (c1)  
(c2, c3) / (c2) / (c3) / (TOTAL)

---
# GROUPING SETS
- 다양한 GROUP BY를 처리할 수 있음
- ROLLUP 및 CUBE로 구현하는 것을 모두 할 수 있음
- GROUPING SETS 절에 지정된 모든 그룹을 계산하고,  
각 그룹의 결과를 UNION ALL로 조작하는 것과 유사

```sql
GROUPING SETS (c1, c2)
```
- (c1), (c2)
```sql
GROUPING SETS (c3, c4)
```
- (c3), (c4) 

```sql
GROUPING SETS (c1, c2) , GROUPING SETS (c3, c4)
```
- (c1, c3), (c1, c4), (c2, c3), (c2, c4) 

> 참고 : https://www.youtube.com/watch?v=0nTPWiHDJOA&t=929s