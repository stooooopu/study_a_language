package 메소드_문제;

//썻다 지웠다 하시라고요
public class Real연습장 {
//	문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
//	각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
//	제한 사항
//	문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
//	첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
//	입출력 예
//	return
//	"try hello world"	"TrY HeLlO WoRlD"
//	입출력 예 설명
//	"try hello world"는 세 단어 "try", "hello", "world"로 구성되어 있습니다.
//	각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 "TrY", "HeLlO", "WoRlD"입니다.
//	따라서 "TrY HeLlO WoRlD" 를 리턴합니다.
    public static String solution(String s) {
        String answer = "";
        String arr[] = s.split(" ");
        String array[] = arr[0].split("");
//        이때 try hello world 를 공백 기준으로 나누고
//        다시 arr[0] try를 각각 배열로 나눠줌
        for(int i=0; i<array.length; i++) {
        	if(i%2==0) {
        		array[i]=array[i].toUpperCase();
        	}
        	arr[0] += array[i];
        }
        System.out.println(arr[0]);
        return answer;
    }
    public static void main(String[] args) {
		String s = "try hello world";
		s = solution(s);
//		System.out.println(s);
	}
}
=>
    public static String solution(String s) {
        String answer = "";
        String array[] = s.split("");
        int len = array.length;
        String arr[] = new String[len];
        for (int i=0; i<len; i++) {
        	if(array[i]!=" ") {
        		if(i%2==0) {
        			arr[i]=array[i].toUpperCase();
        		}else arr[i]=array[i].toLowerCase();
        	} else arr[i]=array[i];
        }
        answer = String.join("", arr);
        return answer;
    } 
    // 이렇게 했을 때 테스트만 통과 가능
    // 이 solution은 문자 전체를 홀수와 짝수로 나눈거기 때문
    // 이 문제를 해결하기 위해선 공백일 때 그 다음에 i=0부터 다시 시작한다고 알려주든,
    // i=++i 라고 알려줘야함
    // 그럼 이i를 따로 변수로 지정 해 주면??
        public static String solution(String s) {
        String answer = "";
        String array[] = s.split("");
        int len = array.length;
        int count = 0;
        for (int i=0; i<len; i++) {
        	if (array[i].equals(" ")) count=1;
        	if (count%2==0) {array[i]=array[i].toUpperCase();}
        	else {array[i]=array[i].toLowerCase();}
        	++count;
        }
        answer = String.join("", array);
        return answer;
    }
    public static void main(String[] args) {
		String s = "try hello world";
		s = solution(s);
		System.out.println(s);
    }
    // 100점!! 