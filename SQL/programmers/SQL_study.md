1. DISTINCT : 중복제거 키워드
    SELECT DISTINCT 중복제거할 컬럼 명
    FROM 테이블이름
    -> 컬럼 안에 중복 데이터가 하나로 합쳐짐

    2개 이상의 컬럼 사용
    SELECT DISTINCT 중복제거할 컬럼 명, 컬럼명
    FROM 테이블이름
    -> DISTINCT 중복제거할 컬럼을 하나의 행으로 인식-> 그 행의 중복 제거

2. CASE - WHEN - ELSE - END : 조건에 따라 값 지정
    *progrmmers폴더의 '중성화 여부 파악하기' 참고
    
    CASE 컬럼  
    WHEN 조건1 THEN 값1 
    WHEN 조건2 THEN 값2 
    ELSE 값3 
    END 

3. GROUP_CONCAT : GROUP BY된 컬럼의 데이터를 가로열로 표시