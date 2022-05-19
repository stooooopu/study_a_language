package 상속2;


class Study{
	public Study() { //디폴트 생성자
		System.out.println("hello world");
	}
	
	public void doSleep() {
		System.out.println("꿀잠을 자다");
	}
	
	public void doStudy(String subjects) {
		System.out.println(subjects+"를 공부하다");
	}
	
}

class StudentC extends Study { //Study class를 상속
	
	public void doStudy(int x) {
	// 밑에 메소드와 overloading
	}
	
	public void doStudy(int x, int y) {
	}
	
	//새롭게 재정의한 메소드 실행
	@Override //@(어노테이션) 필수
	public void doStudy(String subjects) {
		System.out.println("공부하기 싫다");
	}
	
	@Override 
	public void doSleep() {
		System.out.println("저는 열심히 공부만 합니다");
	}
	
}
class StudentB extends Study{
	public void doSleep() {
		System.out.println("꿀잠을 자다");
	}
}
class StudentA extends Study{
	public StudentA() { //디폴트 생성자
		super(); // super메소드가 디폴트로 생성
		
	}
}


public class School {

	public static void main(String[] args) {
		
		//방법1
		StudentA a = new StudentA();
		StudentB b = new StudentB();
		StudentC c = new StudentC();
		//방법2
		//new StudentC().doStudy();
		
		//문제점 : 같은 기능을 하는 메소드 중복
		//해결책 : 상속을 이용해서 중복된 코드(메소드) 제거
		a.doStudy("SQL");
		b.doStudy("CSS");
		c.doStudy("JAVA");
		//불필요한 메소드를 삭제하고 공통메소드로 사용
		
		a.doSleep();
		b.doSleep();
		c.doSleep(); // StudentC class에 @Override를 사용 : 부모클래스에 있는걸 자식클래스에서 재 정의
		
		
	}
	
}
