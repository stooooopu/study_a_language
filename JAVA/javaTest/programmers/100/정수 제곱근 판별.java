package 메소드_문제;

//썻다 지웠다 하시라고요
public class Real연습장 {
//	임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//	n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고,
//	n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
//	제한 사항
//	n은 1이상, 50000000000000 이하인 양의 정수입니다.
//	입출력 예
//	n	return
//	121	144
//	3	-1
//	입출력 예 설명
//	입출력 예#1
//	121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.
//	입출력 예#2
//	3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.

    public static long solution(long n) {
        long answer = Math.sqrt(n);
        if(answer*answer == n) {
        	return answer = answer*(answer+1);
        } else {
        	return -1;
        }
        return answer;
    }

	public static void main(String[] args) {
		long n = 0;
		n=solution(n);
		System.out.println(n);
	}
}

//이때 long answer = Math.sqrt(n);에 에러가 남
//내 생각에는 n의 제곱근이 없는 경우 때문은 아닐까 하는 생각 중

    public static long solution(long n) {
        long answer = 0;
        int x = Math.toIntExact(n);
        int arr[] = new int [x];
        for(int i=0; i<arr.length; i++) {
        	if(x%(arr[i]+1)==0) {
        		arr[i] = i+1;
        		if(arr[i]*arr[i]==x ) {
        			x=arr[i];
        		}
        	}
        }
        if(n != x*x) return -1;
        answer = (x+1)*(x+1);
        return answer;
    }

	public static void main(String[] args) {
		long n = 3;
		n=solution(n);
		System.out.println(n);
	}
// 테스트 1 〉	통과 (24.21ms, 97.7MB)
// 테스트 2 〉	실패 (런타임 에러)
// 테스트 3 〉	통과 (45.75ms, 119MB)
// 테스트 4 〉	실패 (런타임 에러)
// 테스트 5 〉	실패 (메모리 초과)
// 테스트 6 〉	통과 (1.32ms, 73.5MB)
// 테스트 7 〉	실패 (런타임 에러)
// 테스트 8 〉	통과 (575.43ms, 506MB)
// 테스트 9 〉	통과 (2145.74ms, 1.55GB)
// 테스트 10 〉	실패 (런타임 에러)
// 테스트 11 〉	실패 (런타임 에러)
// 테스트 12 〉	실패 (런타임 에러)
// 테스트 13 〉	통과 (3.17ms, 77.8MB)
// 테스트 14 〉	실패 (런타임 에러)
// 테스트 15 〉	통과 (1606.52ms, 1.27GB)
// 테스트 16 〉	통과 (582.92ms, 546MB)
// 테스트 17 〉	통과 (0.03ms, 89.2MB)
// 테스트 18 〉	통과 (0.02ms, 78.5MB)
// 채점 결과
// 정확성: 55.6
// 합계: 55.6 / 100.0
// 일단 내 최선임

    public static long solution(long n) {
        long answer = 0;
        double d = (double)n;
        d = Math.sqrt(d);
        if(Math.round(d)*Math.round(d)==n) {
        	answer = (((long)d)+1)*(((long)d)+1);
        	
        	return answer;
        }else return -1;
	}
	public static void main(String[] args) {
		long n = 3;
		n=solution(n);
		System.out.println(n);
	}
// math.sqrt는 데이터타입이 double이니까 long을 double로 변환
// 그리고 다시 long으로 변환함
// if(Math.round(d)*Math.round(d)==n) 이때 만약 if(d*d==n)으로 한다면
// 무조건 값이 n이 나와서 소수점 뒤에 자리를 모두 버리고 제곱을 해서 원하는 출력값을 얻음
// 100점!!