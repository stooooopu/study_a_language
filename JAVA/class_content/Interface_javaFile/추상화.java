package 추상화;
// interface를 알려면 알아야해서 하는 중

abstract class Chef{ // 추상 클래스
	// 추상메소드 or 일반메소드 정의가능
	public void 요리를하다() { // 일반메소드
		
	}
	// 목적 : 오버라이딩
	abstract public void 비법을전수하다(); // 중괄호가 없음 
	// 구현이 목적이 아닌 공통메소드를 만드는 것 뿐
	// 리턴타입 
}

class Food extends Chef {// 추상클래스에서 오버라이딩이 필수
	@Override // Food override 후에는 Food class는 인스턴스화할 수 있다
	public void 비법을전수하다() {
		// 이 안에서 필요로직 구현
	} 
}

public class 추상화 {

	public static void main(String[] args) {
		
		Food f = new Food();
		
	}
}
