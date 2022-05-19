package 생성자;

public class 학원 {

	public static void main(String[] args) {

		학원VO x = new 학원VO();
		//디폴트생성자
		System.out.println(x.학생수);
		System.out.println(x.교사이름);
		
		
		int num = 15;
		String name = "지유";
		학원VO y = new 학원VO(num,name);
		//파라미터가 있는 생성자 호출
		//생성자를 이용해 값을 넣어준 것
		System.out.println(y.학생수);
		System.out.println(y.교사이름);
	}

}