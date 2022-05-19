package programmers;

public class 평균_구하기 {
//	평균 구하기
//	문제 설명
//	정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
//	제한사항
//	arr은 길이 1 이상, 100 이하인 배열입니다.
//	arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
//	arr	return
//	[1,2,3,4]	2.5
//	[5,5]	5
    public static double solution(int[] arr) {
        double answer = 0;
        double len = arr.length;
        double sum = 0;
        double avg = 0;
        if(len>=1 && len<=100) {
        	for(int i=0; i<len; i++) {
        		if(arr[i]>=-10000 && arr[i]<=10000) {
        			sum = sum+arr[i];
        		}
        	}
        }
        avg = sum/len;
        return avg;
    }
    public static void main(String[] args) {
		double x = 0;
		int[] arr = {1,2,3,4};
		x = solution(arr);
		System.out.println(x);
	}
}
//저번에 문제를 풀었을 떄 1,2,3,4의 평균이 2.0이 나왔던 이유가
//sum, avg, len 을 int로 지정했었음
//이걸 double로 바꾸니 소수점 밑에 자리도 출력 됨
//헐