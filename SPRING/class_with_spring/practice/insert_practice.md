1. emp에 없는 부서번호를 찾아서  
사원이 insert될 때 해당 부서번호로 insert

```java
// controller
  @PostMapping("/emp/empty/deptno")
	public int callNotDeptno(@RequestBody EmpVO vo) {
		return empService.setNotDeptno(vo);
	}

// service
  @Transactional(rollbackFor = {Exception.class})
	public int setNotDeptno(EmpVO vo) {
		int deptno = empMapper.getDeptno();
		vo.setDeptno(deptno);
		return empMapper.insertNotDeptno(vo);
	}

// mapper
	public int getDeptno();
	public int insertNotDeptno(EmpVO vo);
```
- service method는 하나로 그 안에서 로직 구현
```xml
<select id="getDeptno" resultType="int">
		SELECT
			d.deptno
		from emp as e 
		right join dept as d 
		on e.DEPTNO = d.DEPTNO 
		where e.EMPNO is null 
		and 
		d.LOC is not null 
	</select>
<insert id="insertNotDeptno">
		INSERT INTO emp
			(
				deptno,
				empno,
				ename,
				job,
				mgr,
				sal,
				comm,
				hiredate
			)
			VALUES
			(
			#{deptno},
			#{empno},
			#{ename},
			#{job},
			#{mgr},
			#{sal},
			#{comm},
			now()
			)
	</insert>
```
---
---
### 선생님 풀이
1. emp에 없는 부서번호를 찾아서  
사원이 insert될 때 해당 부서번호로 insert

```java
// controller
  @PostMapping("/emp/empty/deptno")
	public int callNotDeptno(@RequestBody EmpVO vo) {
		return empService.setNotDeptno(vo);
	}

// service
  @Transactional(rollbackFor = {Exception.class})
	public int setNotDeptno(EmpVO vo) {
		EmpVO empVo = empMapper.selectDeptNo();
		int deptno = empVO.getDeptno();
		vo.setDeptno(deptno);

		return empMapper.insertNotDeptno(vo);
	}

// mapper
	public int insertNotDeptno(EmpVO vo);
	public EmpVO selectDeptNo();
```

```xml
<!-- empTable에 없는 deptno조회 -->
<select id="selectDeptNo" resultType="EmpVO">
		SELECT
			d.deptno
		from emp as e 
		right join dept as d 
		on e.DEPTNO = d.DEPTNO 
		where e.EMPNO is null 
		and 
		d.LOC is not null 
	</select>

	<insert id="insertNotDeptno">
		INSERT INTO emp
			(
				deptno,
				empno
			)
			VALUES
			(
			#{deptno},
			#{empno}
			)
	</insert>
```
- SELECT에서 어떤 걸 받을지 모르기 때문에 최대한 크게 받는것이 좋음