package 생성자;

public class KoreaVO {

	String ename;
	public KoreaVO() {//클래스를 생성하면 디폴트 생성자가 존재(특수 메소드)
		//1. 리턴타입이 없음. 함수 이름은 클래스와 동일
		//2. when : 필드변수에 값을 대입할 때 사용
		this.ename = "seventeen";//필드 변수에 값을 대입할 때 사용
		//3. KoreaVO(String 지역이름) 이런식으로 파라미터에 데이터를 받을 수 있음
		//필드변수와 파라미터의 이름이 동일 할 수 있음
		//만약 3번처럼 KoreaVO(String 지역이름)로 했을 때
		//String 피자종류 = "";지역변수는 파라미터 변수이름과 동일 할 수없음
	}
	//--------------------------------------------------------------
	//1. 필드변수 접근지정자에 private로 선언
	private String location;
	private String addr;
	private String name;
	private int count;
	//set 과 get은 한 쌍
    //set 과 get을 한 번에 해주기
	//Source -> generate getters and setters의 단축키 
	//Alt + shift + s
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	//실무에선 생성자 안쓰고 이렇게 함수로 사용함니다
	//필드변수만 대입해 주는 class이름을 묶었음 => VO
	//그럼 이름을 KoreaVO로 해야함
}