package programmers;
//문제 설명
//양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
//예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
//자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
//제한 조건
//x는 1 이상, 10000 이하인 정수입니다.
//입출력 예
//arr	return
//10	true
//12	true
//11	false
//13	false

public class 하샤드의_수 {
    public static boolean solution(int x) {
        boolean answer = true;
        int len = (int)(Math.log10(x)+1);
        int y = 0;
        int z = 0;
        if(x>=1 && x<=10000) {
            if(len==1) {
        		return true;
        	}
        	if(len==2) {
        		y = x/10;
        		z = x%10;
        		y = y+z;
        		if(x%y==0) return true;
        		else return false;
        	}
        	if(len==3) {
        		y = x/100;
        		z = x%100;
        		y = y+z;
        		if(x%y==0) return true;
        		else return false;
        	}
        	if(len==4) {
        		y = x/1000;
        		z = x%1000;
        		y = y+z;
        		if(x%y==0) return true;
        		else return false;
        	}
        }
        return answer;
    }
    public static void main(String[] args) {
		boolean answer = true;
		int x = 11;
		answer = solution(x);
		System.out.println(answer);
	}
}
//채점 결과
// 정확성: 58.8
// 합계: 58.8 / 100.0