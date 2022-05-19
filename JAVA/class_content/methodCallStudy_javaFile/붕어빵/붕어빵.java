package 상속;

public class 붕어빵 {
	public static void main(String[] args) {
//		팥붕어빵 = 10;
//		슈크림붕어빵 = 20;
//		피자붕어빵 = 30;
		
		붕어빵 팥붕어빵 = new 붕어빵("팥", 10);
		System.out.println(팥붕어빵.종류+","+팥붕어빵.수량);

		붕어빵 슈크림붕어빵 = new 붕어빵("슈크림", 20);
		System.out.println(슈크림붕어빵.종류+","+슈크림붕어빵.수량);
		
		붕어빵 피자붕어빵 = new 붕어빵("피자", 30);
		System.out.println(피자붕어빵.종류+","+피자붕어빵.수량);
		
	}
}
