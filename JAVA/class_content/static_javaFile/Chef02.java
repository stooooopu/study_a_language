package 스태틱;

public class Chef2 {
	public static Chef2 getInstance() {
		// null error 방지
		return new Chef2();
	}
	
	public void printHello() {
		System.out.println("hello world");
	}
	
	// static이면서 void이기 때문에 다른 class에서 인스턴스 화 없이 호출 가능
	// void이기 때문에 다른 클래스에서 따로 출력 필요 없음
	public static void x() {
		System.out.println("Static함수");
	}
}
