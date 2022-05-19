package 메소드메소드;

public class cafe {

	public static void main(String[] args) {
		
	coffeeVO cafe = new coffeeVO();
//	cafe.menu = "americano"; 필드변수가 private 불러오기가 안됨
//	이때 . 은 경로임
	cafe.setMenu("americano");
	//set으로 대입해서 09저장됨(영구를 이용한 말장난)
	String coffee = cafe.getMenu();
	System.out.println(coffee);

	
	cafe.setMenu("latte");
	String coffee2 = cafe.getMenu();
	System.out.println(coffee2);
	//set -> get 이 순서를 잊지 마쎄용~
	
	}
}
