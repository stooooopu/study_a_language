public class JTBC_이태원클라스 { //필드변수 2개와 메소드1개로 구성 됨
	
	//필드변수 2개
	String 주인공;
	//private String 주인공; =>은닉성
	//실무에서는 필드변수를 private으로 함 
	//public String 주인공
	//필드변수에도 접근지정자를 지정할 수 있음
	String 동료;
	
	
	//메소드 1개
	public void 학교를때려치다(String name) {
		//이때 name이라는 변수이름이 중요한건 아님
		//중요한건 String이라는 데이터 타입
		
		//주인공 = name;
		//name에 주인공필드변수를 넣고싶을때 위에처럼 해도 되지만
		//this.주인공 = name;
		//필드변수 앞에 this.을 붙여줌 나중에 찾기 편하게
		System.out.println(name+"가 학교를 나감");
	}
}
// ************** other class **************
public class JTBC {

	public static void main(String[] args) {

		JTBC_이태원클라스 일부작 = new JTBC_이태원클라스();
		일부작.주인공 = "박새로이";
		일부작.동료 = "조이서";
		String name = 일부작.주인공;//변수로 또 활용 가능
		System.out.println(일부작.동료); 
		일부작.학교를때려치다(name);
		
		JTBC_이태원클라스 이부작 = new JTBC_이태원클라스();
		이부작.주인공 = "누군";
		이부작.동료 = "그게나야";
		이부작.학교를때려치다(이부작.주인공);
		System.out.println(이부작.동료);
		
	}

}