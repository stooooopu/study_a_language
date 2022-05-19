package 상속;

// class file 생성 -> 디폴트 생성자가 생성
class Pizza{
	// 해당 클래스 호출 될 때 초기화 됨 (초기화는 뭔가가 시작될 때) 
	// 필드변수는 디폴트로 값이 초기화되어있음
	// int : 0 / String : 'null'
	int money; // 전역변수 or 필드변수
	
	//  생성자는 값을 초기화하는 것이 목적
	public Pizza(int x) { //=> 생성자(리턴타입이 없는 함수 : 리턴타입 지정 안함)
		this.money = x; // this = Pizza를 의미 -> Pizza class 중괄호 안에서 사용했기 때문에 Pizza를 의미
	} //=> 디폴트로 생겨남, 따로 만들어도 되고 무시하고 진행해도 됨
	
		
	public int getMoney() { // 일반함수(method : 리턴타입 정의 필요)
		//	함수는 파라미터에 값을 받아서 결과를 처리하는게 목적
		return 0;
	}
} // end Pizza class



//	.java file : 하나밖에 못옴 public class는 파일 이름을 의미 
public class Study0405 {
	public static void main(String[] args) {
		// class를 대입해야함 new를 써서 해당 클래스를 불러옴
		// () : 생성자(method, 함수) 호출
		Pizza p = new Pizza(10); //java특징 아님, 이건 객체지향언어 특징
		p = new Pizza(30); // int x = 10, x=30; => 동일함 (새로운 값 대입 현재 p.money는 30이 됨)
		
		System.out.println(p.money); // Pizza class에서 파라미터 int x -> 그래서 new로 호출할 때 파라미터값 입력 -> 필드변수 money에 x대입
		// => p.money출력시에 10나옴
		// 1. class도 data type
		
	}

}
