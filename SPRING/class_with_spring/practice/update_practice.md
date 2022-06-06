1. 문제 : 사원번호 = 7844  
comm이 0이거나 null이면 기존 급여에서 500추가 comm이 있다면 0리턴
```java
// controller
@PatchMapping("/emp/empno/{empno}")
	public int callEmpSalUpdate(@PathVariable ("empno")int empno) {
		return empService.getEmpUpdateSalCount(empno);
	}

// service
public int getEmpUpdateSalCount(int empno) {
		// comm = 0 / null
		EmpVO vo = empMapper.selectEmpCommSal(empno);
		int comm = vo.getComm();
		
		if(comm==0) {
			int bonus = 500;
			int sal = vo.getSal();
			vo.setSal(sal+bonus);
			//update 로직추가
			return empMapper.updateEmpSal(vo);
		}
		return 0;
	}

// mapper
    public EmpVO selectEmpCommSal(@Param("empno") int empno);
	public int updateEmpSal(EmpVO vo);
```
```xml
	<select id="selectEmpCommSal" resultType="EmpVO">
	SELECT
		empno,
		COMM ,
		SAL 
	FROM emp
	WHERE EMPNO = #{empno}
	</select>
	
	<update id="updateEmpSal">
	UPDATE emp
	SET sal = #{sal}
	WHERE empno = #{empno}
	</update>
```

1. 문제에서 최종적으로 원하는 결과 = update  
=> __controller__ = @PatchMapping

2. 조건 : 사원번호 = 7844  
사원번호에 맞는 정보를 찾는 __Query = select__  
select 안에서 찾을 정보  
```
        0인지 확인할 comm  
        현재 급여 확인할 sal  
        sal을 updqte할 empno
```

3. select query의 __id에 추가할 mapper__ 정의  
return Type은 특정 사원번호에 대한 한명의 정보 = EmpVO  
파라미터로 특정 empno받기  
=> 특정 사원번호에 대한 comm이 나옴 여기에 대해 급여를 추가할지 안할지 서비스로직 필요

4. 특정 사원에 대한 정보를 찾았음  
이제는 comm 확인 후 sal에 추가할(update) 로직 구현 필요  
__service에는 updateMethod__

5. sevice 로직 안에서 특정 사원번호에 대한 정보를 담을 VO를 생성  
-> selectQuery와 연결된 mapper를 불러서 담음  
-> set한 sal을 실제 DB에 업데이트 할 query필요  

6. update query구현 -> __id에 추가할 mapper__ 정의

6. service return에 추가
