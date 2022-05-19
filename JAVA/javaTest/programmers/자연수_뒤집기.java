package 문제풀이;

public class 자연수_뒤집어_배열로_만들기 {
//	자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
//	예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
//	제한 조건
//	n은 10,000,000,000이하인 자연수입니다.
//	입출력 예
//	n	return
//	12345	[5,4,3,2,1]
    public static int[] solution(long n) {
        int[] answer = {};
        int x = Math.toIntExact(n);
        int len = (int)Math.log10(x)+1;
        answer = new int[len];
        int[] reanswer = new int [len];
        for(int i=0; i<len; i++) {
        	answer[i]=(int)(x/Math.pow(10,len-i-1))%10;
        }
//        System.out.println(answer[0]);
//        System.out.println(answer[1]);
//        System.out.println(answer[2]);
//        System.out.println(answer[3]);
//        System.out.println(answer[4]);
        for(int i=len-1,j=0; i>=0; i--,j++) {
        		reanswer[j]=answer[i];
        }
//        System.out.println(reanswer[0]);
//        System.out.println(reanswer[1]);
//        System.out.println(reanswer[2]);
//        System.out.println(reanswer[3]);
//        System.out.println(reanswer[4]);
        return reanswer;
    }
	public static void main(String[] args) {
		long x = 12345;
		int y = Math.toIntExact(x);
		int[] arr = new int [y];
		arr =	solution(x);
//		for(int i : arr) {
//			System.out.println(arr);
//		}
	}
}
// 테스트 1 〉	실패 (런타임 에러)
// 테스트 2 〉	통과 (0.03ms, 81.1MB)
// 테스트 3 〉	통과 (0.03ms, 66.5MB)
// 테스트 4 〉	실패 (런타임 에러)
// 테스트 5 〉	통과 (0.05ms, 74.6MB)
// 테스트 6 〉	통과 (0.04ms, 74.2MB)
// 테스트 7 〉	통과 (0.04ms, 75.7MB)
// 테스트 8 〉	통과 (0.04ms, 74.3MB)
// 테스트 9 〉	통과 (0.05ms, 79.6MB)
// 테스트 10 〉	통과 (0.04ms, 71.9MB)
// 테스트 11 〉	통과 (0.04ms, 73.2MB)
// 테스트 12 〉	통과 (0.03ms, 75.3MB)
// 테스트 13 〉	실패 (런타임 에러)
// 채점 결과
// 정확성: 76.9
// 합계: 76.9 / 100.0