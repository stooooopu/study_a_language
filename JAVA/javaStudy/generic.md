# Generic
- < > 안에 지정된 데이터타입에 의해서 ArrayList 결정
- < > 안에는 클래스만 가능
    - int : Integer
    - String
    - double : Double
## Collections Framework (container)
- import생성 필요 (ctrl + shift + o)
- Collecrion Framework  
  java에서는 여러 상황에서 사용할 수 있는 다양한 container 제공
- Container 
  - 값을 담는 그릇
  - 값의 성격에 따라서 컨테이너의 성격이 조금씩 달라짐
- 길이를 유동적으로 컨트롤
- Collections
1. list
    - *** ArrayList
    - LinkedList
    - Vector
2. set
    - HashSet
    - LinkedHashSet
    - TreeSet
3. Queue
    - LinkedList
    - PriorityQueue
    - Dequeue 
4. Map
    - *** HashMap
    - *** Hashtable
    - TreeMap 
- 문법
```java
// dataType = class

     ArrayList<dataType> 변수이름 = new ArrayList<dataType>();

     HashMap<dataType,dataType> 변수이름 = new HashMap<dataType,dataType>();
                 <key,value> => vlaue의 dataType은 Object많이 사용
```
- ArrayList의 부모인 List로 받아서 정의 가능
```java
    ArrayList<String> list = new ArrayList<String>();

    List<String> list2 = new ArrayList<String>();
    list2 = new LinkedList<String>();
```
## ArrayList
- .add( data ) : ArrayList 데이터 삽입
- .get( index ) : ArrayList 데이터 불러옴
- .remove( index ) : ArrayList 데이터 삭제
- .size() : ArrayList 길이호출
  - ArrayList 각 자리에는 고유한 주소가 존재
  - 0번자리 데이터가 삭제 -> 1번자리 데이터가 0번자리 주소로 감
## HashMap
- .put( "key", "value" ) : HashMap 데이터 삽입
- .get( "key" ) : HashMap 데이터 불러오기(key값으로 접근)
---
# < Map > vs < vo >
- List안에 empTable data 넣기
```
 ename  empno
 SMITH   7369
 ALLEN   7499
```

```java
// voClass
class EmpVO{
	private int empNo;
	private String ename;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
}
// voType
List<EmpVO1> empList = new ArrayList<EmpVO1>();
			
			EmpVO SMITH = new EmpVO();
			SMITH.setEmpNo(7369);
			SMITH.setEname("SMITH");
			empList.add(SMITH);
			
			EmpVO ALLEN = new EmpVO();
			ALLEN.setEmpNo(7499);
			ALLEN.setEname("ALLEN");
			empList.add(ALLEN);
```
column job을 추가 해야한다면
- EmpVO class에 필드변수 job추가 -> getter & setter추가 -> setJob


```java
// HashMapType
List<Map<String,Object>> empMapList = new ArrayList<Map<String,Object>>();
			
			Map<String,Object> MapSMITH = new HashMap<String, Object>();
			MapSMITH.put("empNo", 7369);
			MapSMITH.put("ename", "SMITH");
			empMapList.add(MapSMITH);
			
			Map<String,Object> MapALLEN = new HashMap<String, Object>();
			MapALLEN.put("empNo", 7499);
			MapALLEN.put("ename", "ALLEN");
			empMapList.add(MapALLEN);
```
column job을 추가 해야한다면
- MapSMITH.put("job","MANAGER) 추가
- MapALLEN.put("job","SALESMAN") 추가
---
### ※ 기존 배열 선언
  ```
    int array[] = {1,2,3,4,5};
    int array[] = new int [5];

    배열 이유 : 데이터타입이 같은 연관된 데이터들을 쉽게 사용하기 위해
    배열 단점 : 이미 한 번정해진 배열의 크기를 변경할 수 없음
    
    단점을 극복하기 위한 방법 => collections
  ```