package 상속;

public class Home {

	public static void main(String[] args) {
		// Home에서 name, className, studentCount을 계속 입력을 해야하는 이슈 발생
		// 현재 Dw에 오류난 이유는 public에 파라미터가 있어서
		// 이걸 해결하기 위해선 파라미터값을 넣는다
		// 오버로딩을 이용 파라미터값이 없는 함수를 하나 더 만든다
//		Dw dw = new Dw(); // 파일을 불러오다 => 인스턴스화 하다
		Dw dw02 = null; //초기값으로 null을 넣을 수 있음
		if(dw02 == null) {
			dw02 = new Dw(); //dw02가 null 이면 Dw()를 호출해줘
		}
//		System.out.println(dw02);
		int x = 0;
		if(x==0) {
			x=10;
		}
		
		Dw dw = new Dw("정지유","웹개발",13); //=> 파라미터가 있는 Dw생성자 호출한 것
		System.out.println(dw.name+","+dw.className+","+dw.studentCount);
		// 내가 원하는 것만 set get가능 왜냐면 나머지 변수에는 디폴트로 초기화가 되어서
		// set get을 이용해서 초기화
		// set이 붙으면 return 타입이 없는 메소드
//		dw.setName("정지유");
//		dw.setClassName("웹 개발");
//		dw.setStudentCount(13);
		
		// get이 붙으면 return 타입이 있는 메소드
//		String name = dw.getName();
//		String className = dw.getClassName();
//		int studentCount = dw.getStudentCount();
		
//		System.out.println("학생이름은 : " + name);
//		System.out.println("과정명은 : " + className);
//		System.out.println("학생수는 : " + studentCount);
	}
}
