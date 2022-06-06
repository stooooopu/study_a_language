1. 문제 1. A로 시작하는 사람 수 구하기
```java
// controller
@GetMapping("/emp/names")
	// /emp/name?firstWorld=A
	public int callCountAName(@RequestParam("firstWorld")String firstWorld) {
		return empService.getCountAName(firstWorld);
	}

// service
@Transactional(rollbackFor = {Exception.class})
	public int getCountAName(String firstWorld) {
		List<EmpVO> list = empMapper.getCountAName(firstWorld);
		for(int i=0; i<list.size(); i++) {
			String name = list.get(i).getEname();
			System.out.println(name);
		}
		return empMapper.getCountAName(firstWorld).size();
	}

// mapper
public List<EmpVO> getCountAName(String firstWorld);
```
- firstWorld에서 원하는 알파벳 입력 가능
- mapper에서 A로 시작하는 정보를 List에 담고 service에서 그 리스트의 size를 리턴

```xml
<select id="getCountAName" resultType="EmpVO">
	SELECT 
		* 
	FROM emp
	WHERE ENAME LIKE #{firstWorld}"%"
	</select>

<!-- 선생님 query-->
<select id="getCountAName" resultType="EmpVO">
	SELECT 
		* 
	FROM emp
	WHERE ename LIKE CONCAT(#{firstWorld} , '%')
	</select>
```