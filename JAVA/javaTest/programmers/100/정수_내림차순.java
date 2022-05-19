package 메소드_문제;

//programmers에서는 Arrays.sort함수를 썻을 때 import가 안생기니까 에러남
import java.util.Arrays;

//썻다 지웠다 하시라고요
public class Real연습장 {
//	문제 설명
//	함수 solution은 정수 n을 매개변수로 입력받습니다.
//	n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
//	예를들어 n이 118372면 873211을 리턴하면 됩니다.
//	입출력 예
//	n	return
//	118372	873211
//	애초에 long type에서 시작
    public static long solution(long n) {
        long answer = 0;
        int len = (int)Math.log10(n)+1;
        long arr[] = new long[len];
//        arr[] = {0,0,0,0}
        for(int i=0; i<len; i++) {
        	arr[i] = (long)(n/Math.pow(10,len-i-1))%10;
        }
//        for(int i=0; i<len; i++) {
//        	arr[i] = (long)(n/Math.pow(10,len-i))%10;
//        } 로 하게 되면 10000, 1000, 100, 10 이기 때문에 1의 자리를 구할 수 없음
        Arrays.sort(arr);

//        long temp = 0;
//        for(int i=1; i<len; i++) {
//        	for(int j=0; j<len; j++) {
//        		if(arr[i]>arr[j]) {
//        		temp = arr[i];
//        		arr[i] = arr[j];
//        		arr[j]=temp;
//        		}
//        	}
//        } 이렇게 버블정렬할 수 있지만 그럼 long answer로 return하기 위해
//        다시 String -> long 으로 변환해야함
        for(int i=0; i<len; i++) {
        	answer += arr[i]*(long)Math.pow(10, i);
        }
//        10의 제곱을 이용해서 각 자리에 맞는 숫자를 더해주면 해결
        
        return answer;
    }

	public static void main(String[] args) {
		long n = 1183;
		n=solution(n);
		System.out.println(n);
	}
}