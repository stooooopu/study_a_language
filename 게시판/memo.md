# list 출력값
```java
@GetMapping("/students")
	public String loadStudentsPage(ModelMap map, 
			@RequestParam("pageNum")int pageNum,
			@RequestParam("pageSize")int pageSize) {
		List<Map<String,Object>> list = studentsService.getAllStudentsList(pageNum, pageSize);
		System.out.println(list);
		PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String,Object>>(list);
		
		map.addAttribute("pageHelper", pageInfo);
		return "students";
	}
```
list 출력값
```java
Page{count=true, pageNum=1, pageSize=10, startRow=0, endRow=10, total=24, pages=3, reasonable=true, pageSizeZero=false}  
[{studentsId=8, studentsName=문준휘, createAt=2022-06-07T08:43:50}, {studentsId=9, studentsName=권순영, createAt=2022-06-07T08:43:54} ...]
```

---
# @Controller / @RestController 나눈 이유
1. 둘의 차이점 : return type  
2. 장점
- Contoller의 return은 "파일명"으로만 가능한데 반해  
RestController는 return이 json  
return이 json이니 범용성이 넓어 App, IoT등 여러 서버와 통신이 가능  
이때 App=HTML과 동일하다고 생각하면 됨  
(app도 DB와 바로 연동이 안돼서 HTML과 동일하게 RestController가 필요)  

---

# redirect
해당 파트로 연결 해 줌  
ex) 고객센터에서 담당이 아니니 담당부서로 연결 해 준다고 하는 것  

# forward
본인의 파트가 아니더라도 어떻게든 해결을 함
ex) 고객센터에서 담당이 아니더라도 해결방안을 제시하는 것

---
# test
eclipse에서는 test제공  
java에서 main함수처럼 확인 가능  
JUnit

---
# 페이지 개념 정리