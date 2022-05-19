public class Pizza02 {
	
	public static Pizza getPizza(Pizza p) {
		p.피자조각 = 8;
		p.피자종류 = "치즈피자";
		return p;
	}
	public static void main(String[] args) {
		//리턴은 클래스로도 할 수 있구나
		Pizza p1 = new Pizza();
		//new Pizza();를 데이터타입이 Pizza 인 변수이름 p1에 넣는다 
		
		//1번
		p1 = getPizza(p1);
		//데이터타입이 Pizza 인 변수p1에
		//getPizza(p1);이라는 함수를 넣는다
		//이때 getPizza(p1)안에 p1은 pizza클래스임
		System.out.println("피자조각 : "+p1.피자조각);
		System.out.println("피자종류 : "+p1.피자종류);
		
		
		//2번
		Pizza p2 = getPizza(p1);
		//new로 부르지 않아도 되는 이유
		//파라미터로 new로 호출한 클래스를 넣었기 때문에 가능
		//클래스 리턴이 가능했던것!
		//☆★☆★☆★☆★1.메소드로 클래스 리턴이 가능하다☆★☆★☆★☆★☆★
		p2.피자조각 = 1;
		p2.피자종류 = "하와이안";
		System.out.println("피자조각 : "+p2.피자조각);
		System.out.println("피자종류 : "+p2.피자종류);
	}

}