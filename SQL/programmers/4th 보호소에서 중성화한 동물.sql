/* ins.SEX_UPON_INTAKE = 'Intact Male'
-> outs.SEX_UPON_OUTCOME = 'Neutered Male'
or
ins.SEX_UPON_INTAKE = 'Intact Female'
-> outs.SEX_UPON_OUTCOME = 'Spayed Female'
로 바뀐 아이들을 찾아야 하는데
그럼 단순히 단어가 다른 아이들을 찾으면 될 거 같음 */
SELECT 
    ins.ANIMAL_ID as id,
    ins.ANIMAL_TYPE as type,
    ins.NAME as name
from ANIMAL_INS as ins
join ANIMAL_OUTS as outs
on ins.ANIMAL_ID = outs.ANIMAL_ID
where ins.SEX_UPON_INTAKE != outs.SEX_UPON_OUTCOME
/*됨*/