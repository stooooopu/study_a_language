package 메소드_문제;

public class 짝수_홀수 {
//	문제 설명
//	정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수(메소드), 
//	solution을 완성해주세요.
//	제한 조건
//	1. 정수 num을 받는 파라미터가 있어야 함.o
//	2. return 타입은 String.o
//	3. 메소드 이름은 solution.o
//	입출력 예
//	num : 3, return : "Odd"
//	num : 4, return : "Even"
	public static String solution (int num) {
		if(num%2 == 0) {
			return "Even";
		}else {
			return "Odd";
		}
	}
	public static void main(String[] args) {
		int x = 3;
		String y = "y";
		y = solution(x);
		System.out.println("num : "+x+" return : "+y);
	}
}