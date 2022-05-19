package 스태틱;

public class CallChef_02 {
	
	public static void main(String[] args) {
		Chef c = Chef.getInstance();
		c.printHello();
		// 출력 : hello world
		
		
		// Chef2가 static이라 인스턴스화 없이 호출가능
		Chef2.x();
		// 출력 : Static함수
		
		Chef2.getInstance().printHello();
		// 출력 : hello world
	}
}
