package 메소드_문제;

public class Real연습장 {
//	1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
//	소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.(1은 소수가 아닙니다.)
//	제한 조건
//	n은 2이상 1000000이하의 자연수입니다.
//	입출력 예
//	n	result
//	10	4
//	5	3
//	입출력 예 #1
//	1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환
//	입출력 예 #2
//	1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
    public static int solution(int n) {
        int answer = 0;
        int array[] = new int [n];
        if (n>2 && n<1000000) {
        	for (int i=0; i<n; i++) {
        		array[i] = i+1;
        		for (int j=2; j<array[i]; j++) {
        			if (array[i]!=1) {
        				if(array[i]%j==0) {
        					++answer;
        					break;
        				}
        			}
        		}
        	}
        }
        return n-(answer+1);
    }
    public static void main(String[] args) {
		int n = 5;
		n=solution(n);
		System.out.println(n);
    }
}
// 채점 결과
// 정확성: 62.5
// 효율성: 0.0
// 합계: 62.5 / 100.0
// 네? 갑자기 효율성 테스트요?