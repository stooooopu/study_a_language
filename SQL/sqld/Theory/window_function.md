# Window function
## RANK() OVER
- 각 부서별로 순위를 메기고, 급여기준 내림차순
```sql
SELECT deptno, ename, sal,
        RANK() OVER(
            PARTITION BY deptno
            ORDER BY sal desc) AS ranking
FROM  emp
```
- OVER절에는 PARTITION BY , ORDER BY만 들어갈 수 있음
```
DEPTNO  ENAME   SAL   RANKING
  10      a     5000    1
  10      b     2450    2
  10      c     1300    3

  20      d     3000    1
  20      f     3000    1
  20      m     2975    3
```
- 결과가 동일해 순위가 같다면 그 다음 순위는 생략됨

---
## DENSE_RANK() OVER
```sql
SELECT deptno, ename, sal,
        DENSE_RANK() OVER(
            PARTITION BY deptno
            ORDER BY sal desc) AS ranking
FROM  emp
```
- OVER절에는 PARTITION BY , ORDER BY만 들어갈 수 있음
```
DEPTNO  ENAME   SAL   RANKING
  10      a     5000    1
  10      b     2450    2
  10      c     1300    3

  20      d     3000    1
  20      f     3000    1
  20      m     2975    2
```
---

## ROW_NUMBER() OVER
```sql
SELECT deptno, ename, sal,
        ROW_NUMBER() OVER(
            PARTITION BY deptno
            ORDER BY sal desc) AS number
FROM  emp
```
- OVER절에는 PARTITION BY , ORDER BY만 들어갈 수 있음
```
DEPTNO  ENAME   SAL   number
  10      a     5000    1
  10      b     2450    2
  10      c     1300    3

  20      d     3000    1
  20      f     3000    2
  20      m     2975    3
```
- 순위가 아닌 순번을 메김