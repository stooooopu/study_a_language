# 계층형 구조
쇼핑몰 카테고리 생각  

## start whith ~ connect by prior
1. start with
- 계층이 어디서부터 시작하는지 정해줌  
이때 기준은 부모, 자식 상관없음 컬럼이름만 잘 지정해 주면 됨
- start with로 지정하는 부분이 root node, level 1
- level값이 큰 쪽에서 작은쪽으로 전개
- 순방향 : 부모node로부터 자식node방향으로 전개
2. connect by prior
- prior이 내용이 주가 됨
```
prior이 앞에 있으면 하향
prior이 뒤에 있으면 상향
```
- connect by prior 절에 있는 조건은 where절의 조건과 다름  
start with 절에서 필터링 된 데이터는 결과목록에 포함, connect by절에 의해 필터링

---
# 계층형 질의문
1. SQL Sever
- CTE를 재귀 호출함으로써 계층 구조를 전개
- 앵커 멤버를 실행하여 기본 결과 집합을 만들고 이후 재귀 멤버를 지속적으로 실행
2. Oracle
- where절은 모든 전개를 진행한 이후 필터 조건으로서 조건을 만족하는 데이터만을 추출하는데 사용
- PRIOR 키워드는 SELECT, WHERE, CONNECT BY절에 사용할 수 있음