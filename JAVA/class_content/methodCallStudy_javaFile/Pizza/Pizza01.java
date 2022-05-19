public class Pizza01 {

    public static Pizza getPizza(Pizza p){
    	//getPizza(Pizza p)에선 리턴타입은 Pizza이기 때문에 처음 return값을 null로 시작
    	//파라미터타입은 Pizza class, 변수이름은 p임
    	//때문에 getPizza(Pizza p)에서는 Pizza class를 불러올 필요가 없음
    	p.피자조각 = 9;
    	p.피자종류 = "치즈피자";
    	return p;
    }
    public static Pizza getPizza(){
    	Pizza p1 = new Pizza();
    	//getPizza()에서는 리턴타입은 Pizza이기 때문에 처음 return값을 null로 시작
    	//하지만 파라미터에 아무것도 받는게 없기 때문에 Pizza class존재를 모름
    	//파라미터값에 아무것도 없어서 p.피자조각, p1.피자종류을 못씀
    	//그래서 main에서 불러온 Pizza class랑 상관 없이
    	//getPizza()에 Pizza class를 불러와야함
    	p1.피자조각 = 10;
    	p1.피자종류 = "불고기피자";
    	return p1;
    }
    //메인메소드에서 Pizza를 호출했다고 가정하면..!
    public static void main(String[] args) {
        //getPizza피자 메소드 2개를 이용하자.
        Pizza p = new Pizza();
        //p2, p3로 Pizza 데이터 받기
        
        Pizza p2 = getPizza(p); 
        //getPizza(p)에서 대입된 p.피자조각 / p.피자종류를 
        //데이터타입 : Pizza, 변수이름 : p2라는 변수에 담을 것이다
        Pizza p3 = getPizza();
        //getPizza()에서 대입된 p.피자조각 / p.피자종류를 
        //데이터타입 : Pizza, 변수이름 : p3라는 변수에 담을 것이다
        System.out.println("p2 피자 종류 "+p2.피자종류);
        System.out.println("p2 피자 조각 "+p2.피자조각);
        //때문에 출력할 땐 p2가 된다
        System.out.println("p3 피자 종류 "+p3.피자종류);
        System.out.println("p3 피자 조각 "+p3.피자조각);
        //때문에 출력할 땐 p3가 된다

//### 입출력 예
//   p2 피자 종류 치즈피자
//   p2 피자 조각 20
//   p3 피자 종류 불고기피자
//   p3 피자 조각 100
    }
}