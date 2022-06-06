2. 급여가 3000달러 이상인 사원만 삭제
```java
// controller
  @DeleteMapping("/emp/prac/empno/{empno}")
	public int deletePracSal(@PathVariable("empno")int empno) {
		return empService.deletePracSal(empno);
	}

// service
  @Transactional(rollbackFor = {Exception.class})
	public int deletePracSal(int empno) {
		EmpVO vo = empMapper.getPracSal(empno);
		if(vo.getSal()>=3000) {
			return empMapper.deleteEmp(empno);
		}
		return 0;
	}

// mapper
    public EmpVO getPracSal(int empno);
	public int deletePracSal(int empno);
```
---
```xml
<select id="getPracSal" resultType="EmpVO">
		select 
			*
		from emp e 
		where empno = #{empno}
	</select>
	
	<delete id="deletePracSal">
		DELETE FROM emp
		WHERE empno = #{empno}
	</delete>
```