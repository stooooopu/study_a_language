SELECT
    outs.ANIMAL_ID as id,
    outs.NAME	as name
FROM ANIMAL_INS as ins
right join ANIMAL_OUTS as outs
on ins.ANIMAL_ID = outs.ANIMAL_ID
where ins.animal_id is null
order by ins.ANIMAL_ID asc
/*애초에 ins의 정보가 없고 그 없는 애들을 찾는거니까
select에서도 outs로 조회하고(ins에는 정보가 없으니까)
ins가 기준이 아닌 outs가 기준이니까 right join을 해야혀*/