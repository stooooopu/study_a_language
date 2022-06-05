SELECT i.ANIMAL_ID,
        i.NAME
from ANIMAL_INS as i
join ANIMAL_OUTS as o
on i.ANIMAL_ID = o.ANIMAL_ID
order by i.DATETIME - o.DATETIME asc
limit 2
/*너무 오랜만에 Join을 써서 자꾸 select에도 
별칭 써주는 걸 잊는다
잊지말길 알겠니 지유야?*/