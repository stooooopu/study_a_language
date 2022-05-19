package 상속;

class student_A{
	public void 공부하다() {
		System.out.println("JAVA 공부중");
	}
}

class student_B{
	public void 공부하다() {
		System.out.println("SQL 공부중");
	}
}

class student_C{
	public void 공부하다() {
		System.out.println("HTML 공부중");
	}
}

public class School {
	
	public static void main(String[] args) {
		student_A a = new student_A();
		student_B b = new student_B();
		student_C c = new student_C();
		
		a.공부하다();
		b.공부하다();
		c.공부하다();
		
	}
}
