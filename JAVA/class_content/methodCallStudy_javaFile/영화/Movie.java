package 생성자;

public class Movie {

	public static void main(String[] args) {

		MovieVO m1 = new MovieVO();
		//new : class호출(객체화, 인스턴스화 하다)
		//class이름 () : 클래스 생성자 호출
		//Movie안에 getMovie쓰는거 아님
		System.out.println(m1.count);
		System.out.println(m1.location);
		System.out.println(m1.name);
		m1.count = 15;
		System.out.println(m1.count+" 이 방법을 많이 씁니다요");
		
		String loc1 = "우리집으로가자";
		MovieVO m2 = new MovieVO(loc1);
		System.out.println(loc1);
		System.out.println(m2.count);
		//이때 m2.count가 0인 이유는 Movie class의 필드변수 count에는 값을 대입하지 않았기 때문에
		//디폴트값 0으로 출력
		
		String name = "에스쿱스";
		String loc2 = "우리집에";
		int count1 = 10;
		MovieVO m3 = new MovieVO(name,loc2,count1);
		//여기에 String name = "쿱스가";
		//String loc2 = "우리집에"; int count1 = 10;를 지정 안하고
		//바로 new Movie("쿱스가","우리집에",10); 가능!
		System.out.println( "m3 =>"+m3.name+" "+m3.location+" "+m3.count+"명이면 분명 이득인 부분");
		System.out.println();
		System.out.println(name+loc2+count1);
		//위에System.out.println(name+loc2+count1);도 출력 값은 같지만
		//단순히 내가 지정한 변수를 출력한 것이기 때문에
		//MovieVO m3를 지정할 필요없음
		
		MovieVO m5 = new MovieVO("쿱스가","우리집에",30);
		System.out.println("m5 name : "+m5.name);
		System.out.println("m5 location : "+m5.location);
		System.out.println("m5 count : "+m5.count);
		
		
		System.out.println();
		int count2 = 30;
		MovieVO m4 = new MovieVO();
		System.out.println(count2);
		
	}

}