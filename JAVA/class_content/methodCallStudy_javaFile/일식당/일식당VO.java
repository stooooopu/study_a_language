package 생성자;

public class 일식당VO {

	//생성자를 안쓰고 어떻게 초기화하는지 알려드리겠습니다요
	//1. 필드변수 접근지정자에 private로 선언
	private String porkCutlet; //맛있는 동까스(컴파일 언어들은 꼭 세미콜론 찍어주시라요)
	private String price;
	private int count;
	//set함수
	public void setporkCutlet(String porkCutlet) {
		//void를 이용해서 private이 접근지정자인 필드변수를 초기화
		this.porkCutlet = porkCutlet;
	}
	//get함수
	public String getporkCutlet() {
		//void를 이용해서 초기화 된 필드변수를 return
		return this.porkCutlet;
	}
	//set 과 get은 한 쌍
	
	//set 과 get을 한 번에 해주기
	//Source -> generate getters and setters의 단축키 
	//Alt + shift + s
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	//실무에서는 생성자 안쓰고 이렇게 함수로 사용함니다
	//필드변수만 대입해 주는 class이름을 묶었음 => VO
	//그럼 이름을 일식당VO로 해야합니다요
	
}