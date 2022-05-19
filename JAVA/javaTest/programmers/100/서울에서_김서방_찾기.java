package 문제풀이;

public class 김서방 {
//	String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아,
//	"김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
//	seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
//	seoul은 길이 1 이상, 1000 이하인 배열입니다.
//	seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
//	"Kim"은 반드시 seoul 안에 포함되어 있습니다.
//	입출력 예
//	seoul	return
//	["Jane", "Kim"]	"김서방은 1에 있다"
	public static String solution(String[] seoul) {
		String answer = "";
		int x = 0;
		int len = seoul.length;
		if (len >= 1 && len <= 1000) {
			for (int i = 0; i < len; i++) {
				if (seoul[i].length() >= 1 && seoul[i].length() <= 20) {
					if (seoul[i].equals("Kim")) {
						x = i;
					}
				}
			}
		}
		answer = Integer.toString(x);
		return "김서방은 "+answer+"에 있다";
	}

	public static void main(String[] args) {
		String[] seoul = { "Jane", "Kim" };
		String x = "";
		x = solution(seoul);
		System.out.println(x);
	}
}
