SELECT
    CART_ID,
    name
from CART_PRODUCTS 
where name = 'Milk'
or
name = 'Yogurt'
order by CART_ID asc
/*CART_ID	name
286	Milk
286	Yogurt
287	Milk
448	Milk
448	Yogurt
448	Milk
578	Milk
578	Yogurt
578	Milk
636	Milk
789	Yogurt
789	Yogurt
830	Yogurt
830	Yogurt
830	Yogurt
977	Milk
977	Yogurt
996	Milk
1034	Yogurt
1048	Yogurt
1048	Milk
1048	Yogurt
여기서 내가 출력해야 하는 애들은 
286,448,578,977,1048 임

WHERE name IN ('Milk', 'Yogurt')
이렇게 써도 같음
*/
-- 집에서 순서대로 입력해 보고 이해하기
-- 1.
SELECT
    CART_ID,
    name
FROM CART_PRODUCTS
where name in ('milk','Yogurt')
-- 2.
SELECT
    CART_ID,
    name
FROM CART_PRODUCTS
where name in ('milk','Yogurt')
group by CART_ID
-- 3.
SELECT
    CART_ID,
    name
FROM CART_PRODUCTS
where name in ('milk','Yogurt')
group by CART_ID
HAVING GROUP_CONCAT(DISTINCT(name)) = 'Milk,Yogurt'