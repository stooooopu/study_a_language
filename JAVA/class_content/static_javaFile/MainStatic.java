package 스태틱;

public class MainStatic {
	public static void main(String[] args) {

	StaticStudy s = new StaticStudy();
	s.count++;
	System.out.println(s.count);
	
	StaticStudy s2 = new StaticStudy();
	System.out.println(s2.count);
	
	// 스태틱으로 선언된 변수, 메소드는 new(인스턴스화)를 하지 않고 사용할 수 있다
	System.out.println(StaticStudy.GAMGI);
	
	}
}
