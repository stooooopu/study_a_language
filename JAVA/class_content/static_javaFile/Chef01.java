package 스태틱;

public class Chef {

	// static의 목적이 공유
	// private라서 다른 곳에서 부를 수 없음
	private static Chef chefVariable = null; // 스태틱으로 선언 된 클래스 변수
	
	// returnType: ChefClass
	// static메소드라서 공유 가능
	// 
	public static Chef getInstance() { // 스태틱으로 선언된 메소드
		if(chefVariable == null){
			chefVariable = new Chef();
		}
		return chefVariable;
	}
	
	public void printHello() {
		System.out.println("hello world");
	}
	
	public void printbye() {
		System.out.println("bye world");
	}
}
