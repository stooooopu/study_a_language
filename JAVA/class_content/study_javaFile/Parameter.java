package 메소드메소드;

public class 파라미터클래스 {

	
	
	public static  void test(Pizza p) {
//		p1 = new Pizza();		
//		☆★☆★☆★☆★여기서 pizza class 호출 가능
//		p.피자조각 = 8;
//		p.피자종류 = "치즈피자";
		System.out.println("bye");
		
	}
	public static void main(String[] args) {
		//1. class를 호출해서 변수에 담는다
		Pizza p = new Pizza();
		test(p);//실행시키려면 main안에 작성해야함
		
		//2. 클래스를 변수에 담지 않고 바로 넣는다 (디버깅이 안돼서 잘 안쓰지만 간혹 사용하는 경우 있음)
		test(new Pizza()); 
		
		//3. null 데이터 넘겨주기 (파일을 나중에 호출하고 싶을 떄)
		Pizza p1 = null;
		test(p1); //값이 null이어도 오류는 안남 
		//현재까진 아무것도 호출 안함
//		p1 = new Pizza();
		//이제서야 호출함☆★☆★☆★☆★근데 이걸 test(Pizza p)class에서 호출 가능
		
	}

}