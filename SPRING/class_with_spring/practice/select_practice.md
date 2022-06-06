1. job = 'MANAGER'이면서 sal >= 2000 이상인 ename조회  
2. job = 'SALESMAN'이면 return null

```java
// controller

@GetMapping("/emp/job/{jobName}/sal/{sal}")
	public List<EmpVO> callJobManager(@PathVariable("jobName") String job, @PathVariable("sal") int sal) {
		return empService.getJobManager(job, sal);
	}
```    
- 중괄호{ } 안에 있는 값을 파라미터로 넘김
- @PathVariable("변수이름") = @GetMapping("/emp/no/{변수이름}")

```java
// service

public List<EmpVO> getJobManager(String job, int sal){
		if(job.equals("SALESMAN")) {
			return null;
		}
		return empMapper.getJobManager(job, sal);
```
- if로 salesman을 먼저 거름
```java
// mainMapper

public List<EmpVO> getJobManager(
			@Param("job") String job,
			@Param("sal") int sal
			);
```
- 결과값이 복수일 경우 my batis에서 찾을 수 없음  
@Param을 이용해서 파라미터를 받아줘야함
```xml
<!--sqlmapper-->

<select id="getJobManager" resultType="EmpVO">
		SELECT
			ename
		FROM emp 
		WHERE JOB = #{job}
		and 
		SAL >= #{sal}
	</select>
```
- #{변수이름} = mapper의 변수이름
