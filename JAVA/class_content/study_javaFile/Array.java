package study;

public class 배열 {

	public static void main(String[] args) {

		//배열"선언" = 변수 이름을 짓다
		//밑에 array1, array2, array3 총 3개를 선언함
        //array1, 2, 3 모두 동일한 의미
		int[] array1;
		int []array2;
		int array3[];
		//배열 타입은 long, double, integer, string... 가능
        

		//배열"초기화" = 변수에 값을 할당하다
		int[] array4 = new int[4];
		//현재 array4번 길이는 4
		//array4[] = {0,0,0,0} 기본값 0으로 세팅 됨
		
		int arrayInt[]=new int [10];
		for (int i=0; i<arrayInt.length; i++) {
			System.out.print(i);
		}
		//이때 arrayInt[i]를 출력했을 때 0123456789로 출력 됨
		
		
	}

}