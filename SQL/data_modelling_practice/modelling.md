#### PK = not null, 중복x

해당 테이블과 관련 없는 내용들이 들어가기 시작하면 나중에 수정 삭제에 제약이 커짐  
- ex) emp table  
  - column empno / ename / sal / dname까지면 상관 없음  
  - 어쨋든 부서도 직원과 연관이 있기 때문  
  - 하지만 dname에 대한 자세한 정보까지는 사원테이블인 emp table과는 관련 없음
- ex ) column empno / ename / sal / dname / loc / bossname ...  
  - 부서에 대한 상세정보까지는 emp table에 온다면
  - 나중에 관리도 안됨 그리고 비용이 많이 듦  
  - 논리적으로 관련이 없음  

모델링을 할 때에는 그룹핑할 컬럼이 항상 필요

