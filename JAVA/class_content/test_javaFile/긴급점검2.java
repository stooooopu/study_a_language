package test;

class Dw{
	String className;
	String studentName;

	public Dw(String className, String studentName) {
		this.className = className;
		this.studentName = studentName;
	}
}

public class 긴급점검2 {

	// returnType : Dw
	public static Dw printStudent() {
	// Dw d = new Dw("스마트웹&앱","홍길동");
		
		return new Dw("스마트웹&앱","홍길동");
	}
	
	public static void main(String[] args) {
		
		// 둘다 static이라서 변수에 담지 않고 바로 불러오기 가능
		System.out.println(printStudent().className);
		System.out.println(printStudent().studentName);
		
		Dw d = printStudent();
		System.out.println(d.className);
		System.out.println(d.studentName);
	
	}
}
