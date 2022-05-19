package 상속;

// class 이름 앞에는 항상 대문자
public class DwVO{
	String name;
	String className;
	int studentCount;
	
	// 1. 생성자는 class이름과 동일해야 한다 (다르게 하면 함수로 인식)
	// 2. return 타입이 없다
	// Home에서 name, className, studentCount을 계속 입력을 해야하는 이슈 발생
	public Dw(String name, String className, int studentCount) {
		this.name = name;
		this.className = className;
		this.studentCount = studentCount;
	}
	public Dw() {
		
	}
	// 1. 생성자에 파라미터 없이 필드변수 초기화
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	
	
	
	
}
