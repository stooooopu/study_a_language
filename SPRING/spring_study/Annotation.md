
# @Controller
사용자의 요청 -> Service에 전달 -> Service에서 처리 -> Controller에서 View에 넘겨줌  
=> 중간제어자 역할
1. URL을 요청받는 곳, URL요청이 오면 응답 담당  
2. IP수집 가능
```
	public returnType MethodName(HttpServletRequest request){
		String ip = request.getHeader("X-forwarded-For");
		if(ip == null) ip = request.getRemoteAddr(); 
		System.out.println(ip);
	}
```
- 어떤 지역에서 접속했는지 알 수 있음 => 데이터 수집이 가능
- Servlet : JAVA(Spring)
- getHeader("X-forwarded-For") : http구조상 ip는 head에 담겨있음
- if(ip == null ) : 가끔 ip가 null이 들어올 때가 있음  
이때 원격주소를 이용 IP를 받아옴

---
# @RestController
- Spring에서 외부의 요청(ex HTML등)을 받는 controller
- @CrossOrigin과 함께 사용
---
# @Autowired
Spring이 해당 객체(class)를 관리 해 줌   
객체의 타입에 해당하는 bean을 찾아 주입하는 역할
- 생성자
- Setter
- 필드
---
# @Service
비즈니스로직, 계산 수행, 외부 API호출을 수행하는 JAVA클래스를 표시  
```
기존 MainController에서 MainService 사용시

MainService service = new MainService();
이렇게 인스턴스화가 필요했음  
```
그런데 MainService는 __@Service__ 가 있음  
@Service가 클래스 인스턴스화와 소멸을 자동으로 해줌  
그래서
```
@Autowired
private MainService service;
```
실무에서는 앞에 private를 붙임  

---
# HTTP Method
메소드에서만 적용
## @GetMapping("/")
- __select__ 시 사용
- 주소에 파라미터가 노출 됨
- HTTP GET요청 -> 메소드 실행 -> 프로토콜로 결과를 받은 것  
그래서 Spring결과를 wep화면에서 확인 할 수 있음
## @PostMapping("/")
- __insert__ 시 사용
- url은 중복되지 않지만 Annotation이 다를경우 중복 가능(like 오버로딩)
## @DeleteMapping("/")
- __delete__ 시 사용
- 파라미터로 PK받아야 함
## @PatchMapping("/{PK}")
- __update__ 시 사용
## @RequestBody
- 파라미터로 넘어오는 VO를 대신 new(인스턴스화)
---
# @Getter @Setter / @Data
getter setter생략할 수 있게 해 주는 것  
검색 : __spring lombok gradle__  

실행이 안될 시
```
1. lombok.jar 다운로드
https://projectlombok.org/download

2. 다운로드 받았으면 폴더 만들어서 lombok.jar 넣기
   해당 경로에 들어가서 git bash창 띄우고 아래 명령어 입력
   java -jar lombok.jar

3. lombok 다운로드
install 클릭 -> Quit Installer 클릭
```
이클립스가 무료라 안되는 게 있음 이렇게 하나하나 설치 필요  

---
# @Transactional(rollbackFor = {Exception.class})
- 오류발생시 이전 commit으로 돌아감
- {Exception.class} : 모든 오류
- {NullPointerException.class} : null 오류

---
# @RequestParam
- 1개의 HTTP 요청 파라미터를 받기 위해서 사용
- 반드시 해당 파라미터가 넘어와야함
- 넘어오지 않을시 error 400 이 뜸
- queryString과 변수명이 동일해야함
- @RequestParam 은 url 상에서 데이터를 찾음

---
# @ResponseBody 
Controller에서 return을 "파일명"이 아닌 다른 타입으로 리턴이 필요할 때 사용
```java
// jsp project
@PostMapping("/login")
	public @ResponseBody boolean callLogin(@RequestBody Map<String,Object> data, HttpSession httpSession) {
		String userId = (String) data.get("userId");
		String userPassword = (String) data.get("userPassword");
		
		System.out.println(userId);
		System.out.println(userPassword);
		
		// session에 데이터 set
		httpSession.setAttribute("userId", userId);
		// 원래 password는 session에 넣지 않음
		httpSession.setAttribute("userPassword", userPassword);
		return true;
	}
```