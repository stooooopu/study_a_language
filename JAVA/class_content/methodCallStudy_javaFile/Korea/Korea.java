package 생성자;

public class Korea {

	public static void main(String[] args) {

		KoreaVO k = new KoreaVO();
		
		k.setLocation("korea ");
		String loc = k.getLocation();
		k.setAddr("seoul ");
		String add = k.getAddr();
		k.setName("Scoups ");
		String name = k.getName();
		k.setCount(10);
		int count = k.getCount();
		System.out.println(loc+add+name+count);
				
	}

}