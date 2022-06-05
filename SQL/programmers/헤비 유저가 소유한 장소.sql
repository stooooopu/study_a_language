
SELECT count(host_id)
from PLACES
-- 이렇게 하면 host_id의 전체 count가 나옴

select *
from PLACES 
where host_id in (select *
                from PLACES 
                group by host_id
                having count(*)>1)
order by ID asc
-- 이때 where과 서브쿼리 select가 달라서 에러

select *
from PLACES 
where host_id = (select host_id
                from PLACES 
                group by host_id
                having count(*)>1)
order by ID asc
/*이때 in이 아닌 =를 사용했더니 에러
아직 진도는 안나갔지만 선생님 말씀으로는 
서브쿼리만 돌렸을 때 단일행이 아닌 다중행으로 나오기 때문에 비교 할 수 없어서
in을 사용한 것이라고 말씀하심*/

select *
from PLACES 
where host_id in (select host_id
                from PLACES 
                group by host_id
                having count(*)>1)
order by ID asc
-- 이렇게 서브쿼리 select와 where의 컬럼 이름이 같고 =이 아닌 in을 사용해야 통과

-- from 서브쿼리로 문제 풀기
select p.*
from
(select
 *
from PLACES 
group by host_id
having count(*)>1) as p
order by ID asc
/*이렇게 하면 중복데이터 제거되고 하나씩만 나옴

☆★ 이 서비스에서는 공간을 둘 이상 등록한 사람 ☆★ => host_id가 2개 이상인 사람 
    id는 겹칠 수 없고 host_id는 겹칠 수 있다
    ID는 기본키입니다 => 고유번호 = PK

1. host_id가 2개 이상인 사람.*/
select host_id,
count(*) as cnt
from PLACES 
group by host_id
having count(*)>=2
-- host_id	cnt
-- 760849	3
-- 30900122	2

-- "헤비 유저"라고 부릅니다.
-- 헤비 유저가 등록한 공간의 정보를 아이디 순으로 조회하는 SQL문을 작성해주세요

select p2.id,
p2.name,
p2.host_id

from(
select host_id,
        count(*) as cnt
from PLACES 
group by host_id
having count(*)>=2
    ) as p

inner join PLACES as p2
on p.host_id = p2.host_id
order by p2.id asc

-- 다시 inner join 을 해 주는 이유는 name은 group by 가 안됨
-- 그래서 먼저 from 절에서 필터링 후 다시 inner join 을 한 뒤
-- 나머지 name 까지 보여주기 위해서