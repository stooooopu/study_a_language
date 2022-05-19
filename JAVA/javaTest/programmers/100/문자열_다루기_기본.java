package 문제풀이;

public class 문자열_다루기_기본 {
//	문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, 
//	solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
//	s는 길이 1 이상, 길이 8 이하인 문자열입니다.
//	입출력 예
//	s	return
//	"a234"	false
//	"1234"	true
    public static boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        if(len>=1 && len<=8 && len==4 || len==6) {
        	try {
        		Integer.parseInt(s);
        		return true;
        	}catch(NumberFormatException e) {
        		return false;
        	}
        }else return false;
    }
    public static void main(String[] args) {
		String s = "a234";
		boolean x = solution(s);
		System.out.println(x);
	}
}
// if(integer.parsint(s))는 문자열 안에 숫자가 아닌게 있으면
// false를 반환하는 게아니라 에러만 나서 구글링 해 보니까
// try catch가 있어서 넣어 보니까 됨
// 어떤 함수인지는 좀 더 찾아보고 java_study에 정리 해 놓겠음