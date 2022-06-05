SELECT ANIMAL_ID,
NAME,
CASE SEX_UPON_INTAKE   
WHEN 'Neutered Male' THEN 'O' 
WHEN 'Spayed Female' THEN 'O' 
ELSE 'X'
END 
from ANIMAL_INS 
order by ANIMAL_ID asc
/*
case 대신 if문도 써 봤는데 결과가 다르게 나옴
왜 그런지는 잘 모르겠음
디버그 찍어보고싶은뎅
*/
