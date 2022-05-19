package 생성자;

public class 일식당 {

	public static void main(String[] args) {

		//생성자 이용해서 이렇게 실무에서 사용
		일식당VO a = new 일식당VO();
		a.setporkCutlet("치즈돈까스");
		String 돈까스 = a.getporkCutlet();
		System.out.println(돈까스);
		
		a.setPrice("다른것보다 비쌈");
		String 가격 = a.getPrice();
		System.out.println(가격);
		
		a.setCount(5);
		int 갯수 = a.getCount();
		System.out.println(갯수);
	}

}