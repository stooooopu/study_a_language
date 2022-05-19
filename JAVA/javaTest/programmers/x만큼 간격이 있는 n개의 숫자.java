//	함수 solution은 정수 x와 자연수 n을 입력 받아,
//	x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
//	다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
//	제한 조건
//	x는 -10000000 이상, 10000000 이하인 정수입니다.x>=-10000000 && x<=10000000
//	n은 1000 이하인 자연수입니다.n <= 1000
//	입출력 예
//	x	n	answer
//	2	5	[2,4,6,8,10] x=x+x 이때 x는 n번째까지 더하기
//	4	3	[4,8,12]
//	-4	2	[-4, -8]
class Solution {
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		int y=x;
		if (x >= -10000000 && x <= 10000000 && n <= 1000) {
			for (int i = 0; i < n; i++) {
				answer[i] = x;
				x = x+y;
			}
		}
		return answer;
	}
    public static void main(String[] args) {

		int x = 0;
		int n = 0;
		long answer[] = new long [n];
		answer = solution(x,n);
		for(long i : answer) {
			System.out.print(i+",");
		}
	}
}//87.5점