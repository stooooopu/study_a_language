# CRUD  / transection
C : create(insert)  
R : read(select)  
U : update  
D : delete  

--- 
# PostMan
add request -> post -> 주소입력  
body -> raw -> text json   
json의 key = 필드변수 이름

---
# INSERT (AutoCommit)
```xml
<!--sqlmapper.xml-->
<insert id="mapperName">
		INSERT INTO tableName
		(
			columnName,
			date			
		)
		VALUES
		(
			#{columnName},
			now()
		)
	</insert>
```
- insert : 해당 테이블에 __notNull data 확인__
- now() : 현재 날짜 세팅
- oracle은 Mybatis Insert할때 PK 문법이 다름(시퀀스를 추가)
```java
// controller
@PostMapping("/url")
	public int call(@RequestBody VOType vo) {
        return Service.ServiceName(vo);
	}
```
- 여기서 받은 데이터를 jquery로 넘김

```java
// service
@Transactional(rollbackFor = {Exception.class})
	public int ServiceName(VOType vo) {
		return mapper.mapperName(vo); 
	}
```
- @Transactional : error처리
	- status: 500 (자바에서 에러)
```java
// mapper
public int mapperName(EmpVO empVo);
```
- returnType이 int인 이유
	- return으로 나오는 결과는 바뀐 행이 __총 몇줄__ 인지 나오기 때문

---

# DELETE (AutoCommit)
```xml
 <!--sqlmapper.xml-->
<delete id="mapperName">
		DELETE FROM tableName
		WHERE PKcolumnName = #{PKcolumnName}
	</delete>
```
- where 절에 꼭 PK를 조건으로 걸어 정확한 데이터를 제거
```java
// controller
@DeleteMapping("/url/{PKcolumnName}")
	public int call(@PathVariable("PKcolumnName") PKdataType variable) {
		return Service.ServiceName(variable);
	}
```
- @DeleteMapping : 자원 삭제
```java
// service
@Transactional(rollbackFor = {Exception.class})
	public int ServiceName(PKdataType variable) {
		return mapper.mapperName(variable); 
	}
```
```java
// mapper
public int mapperName(PKdataType variable);
```
- returnType이 int인 이유
	- return으로 나오는 결과는 바뀐 행이 __총 몇줄__ 인지 나오기 때문

---
# UPDATE (AutoCommit)
```xml
<!--sqlmapper.xml-->
<update id="mapperName">
		UPDATE tableName
		SET 
			바꿀columnName = #{columnName}
		WHERE PKcolumnName = #{PKcolumnName}
	</update>
```
- update : delete와 insert가 이루어지는 것 이기 때문에  
정확한 update를 위해서 where절에 PK를 조건으로 걸기
```java
// controller
@PatchMapping("/emp")
	public int call(@RequestBody VOType vo) {
		return Service.ServiceName(vo);
	}
```
- @PatchMapping : 자원 수정
## service & mapper : insert와 동일

---
# Other
```java
public void test(){

	mapper.insertMapper(); // insert하는 로직

	int[] temp = {1,2};
	int x = temp[3];
}
```
- 위에 예문 중 int x에서 error
- 하지만 아래 로직이 error가 나도 위에 insert로직은 처리 됨

```
1. DDL 과 DML 핵심 차이점
- AUTO COMMIT 여부
- DDL autocommit
2. Mybatis INSERT, DELETE, UPDATE
- AUTO COMMIT
```
Mybatis INSERT, DELETE, UPDATE 의 __returnType = int__ (처리된 행의 수)  
INSERT, DELETE, UPDATE (DML , 트랜젝션(데이터가 변하는 것))

```
HTTP의 기능

GET : 데이터를 header에 싣고 보냄(주소)

POST : 데이터를 body에 싣고 보냄
	   중요한 정보를 보내거나, 데이터를 많이 보낼 때 사용
	   ex) 회원가입
DELETE 
PATCH
```



- url이 같으면 안되는데 같아도 되는 경우
```
@GetMapping("/naver/news")
@PostMapping("/naver/news")

url은 같지만 기능이 다르기 때문에 사용 가능
```

