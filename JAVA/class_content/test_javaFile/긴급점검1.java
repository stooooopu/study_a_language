package test;

public class 긴급점검 {

	public static void main(String[] args) {

		String name = "최승철";
		String name2 = "윤정한";
		boolean isTrue = false;
		// name과 name2가 같으면 isTrue에 true대입
		
//		if(name.equals(name2)) {
//			isTrue = true;
//		}
		
		int x = 10;
		int y = 12;
		// x와 y가 다르면 isTrue에 false를 대입
//		if(x != y) {
//			isTrue = false;
//		}
				
		// x가 y보다 작으면 isTrue에 false를 대입
		if(x<y) {
			isTrue = false;
		}
		
		// isTrue가 true면 x에 12 대입
		// x와 y가 같으면 isTruen에 false를 대입
		
		if(isTrue) {
			x=12;
			if(x==y) {
				isTrue = false;
			}
		}
		System.out.println(x);
		System.out.println(isTrue);
		
		int z = 123;
		String s = Integer.toString(z);
		System.out.println(s);
		
	}

}
