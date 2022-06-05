SELECT
    ins.NAME as name,
    ins.DATETIME as start
FROM ANIMAL_INS as ins
left join ANIMAL_OUTS as outs
on ins.ANIMAL_ID = outs.ANIMAL_ID
where outs.datetime is null
order by ins.datetime asc
limit 3
/*가장오래 보호소에 있던 3마리 인데
이미 order by로 순서를 정렬했음
그래서 limit했을 때 정렬된 순으로 잘라주니까*/