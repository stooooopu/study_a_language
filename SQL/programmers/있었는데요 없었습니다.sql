SELECT 
    ins.ANIMAL_ID as id,
    ins.NAME as name
FROM ANIMAL_INS as ins
join ANIMAL_OUTS as outs
on ins.ANIMAL_ID = outs.ANIMAL_ID
where ins.datetime > outs.datetime
order by ins.datetime asc
