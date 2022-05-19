package 스태틱;

public class CallChef_01 {

	public static void main(String[] args) {
		
		Chef.getInstance(); // 인스턴스화가 된 메소드를 스태틱으로 공유함
		Chef c = Chef.getInstance();
		c.printHello();
		// 출력 : hello world
		c.printbye();
		// 출력 : bye world
		
		Chef2 c2 = Chef2.getInstance();
		c2.printHello();
		// 출력 : hello world
	}
		
	
}
