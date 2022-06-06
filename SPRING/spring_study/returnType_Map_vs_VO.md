# Map vs VO
- emp, dept전체 column의 data조회

## vo
```java
// VO
import lombok.Data;
@Data
public class EmpVO extends Deptno {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private String hiredate;
	private int sal;
	private int comm;
	private int deptno;
    private String dname;
    private Stirng loc;
}


// controller
@GetMapping("/emp/vo/list")
	public List<EmpVO> callEmpMapList(){
		return empService.getEmpMapList();
    }
// service
public List<EmpVO> getEmpMapList(){
		return empMapper.selectEmpMapList();
	};

// mapper
public List<EmpVO> selectEmpMapList();

```
```xml
<select id="selectEmpMapList" resultType="EmpVO">
		SELECT
			empno,
			ename,
			job,
            mgr,
            hiredate,
			sal,
            comm,
            d.deptno,
            d.dname,
            d.loc
		FROM emp AS e
		INNER JOIN dept AS d
		ON e.deptno = d.deptno
	</select>
```
- 조회할 column이 늘어나면 필드변수에도 추가 해줘야함
## Map
```java
// controller
@GetMapping("/emp/map/list")
	public List<Map<String,Object>> callEmpMapList(){
		return empService.getEmpMapList();
    }

// service
public List<Map<String,Object>> getEmpMapList(){
		return empMapper.selectEmpMapList();
	};

// mapper
public List<Map<String,Object>> selectEmpMapList();
```
```xml
<select id="selectEmpMapList" resultType="map">
		SELECT
			empno,
			ename,
			job,
            mgr,
            hiredate,
			sal,
            comm,
            d.deptno,
            d.dname,
            d.loc
		FROM emp AS e
		INNER JOIN dept AS d
		ON e.deptno = d.deptno
	</select>
```
- 조회할 column이 늘어나도 xml에만 추가하면 됨
---
# 결론
> 더 자세한건 spring vo vs map으로 검색하기
## vo
- DELETE, UPDATE, INSERT : vo
- 장점 : vo클래스에 미리 필드변수를 정의해서 문서화, 유지보수 가능

## Map
- SELECT
- 장점 : column 이름에 맞게 자동으로 mapping
- 이유 : join이 많아지면 필드변수가 늘어나는걸 Mybatis가 자동으로 처리
---
# plus
필드변수명 = column명
```xml
<select id="selectEmpMapList" resultType="EmpVO">
		SELECT
			empno AS 사원번호
        FROM emp
	</select>
```
- 만약 query문에 AS 별칭을 줬다면
```java
// VO
import lombok.Data;
@Data
public class EmpVO {
    private int 사원번호;
}
```
- 필드변수 이름을 column명이 아닌 필드변수명으로 바꿔줘야  
데이터를 넣을 수 있음
