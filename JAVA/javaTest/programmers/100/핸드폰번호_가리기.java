//	전화번호가 문자열 phone_number로 주어졌을 때, 
//	전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수(메소드)
//	solution을 완성해주세요.
//	제한조건
//	1. 문자형(String) phone_number을 받는 파라미터가 있어야 함.o
//	2. return 타입은 String.o
//	3. 메소드 이름은 solution.o
//	4. 특정문자 추출 메소드를 사용할 것. = replace
//	5. 문자길이 구하는 메소드는 length() 입니다.
//	    결과값 : ABC
//	    모든 문자 순서는 0부터 시작합니다.
//	    (0, 3)의 의미는 0번째 A부터 3번째 D 이전까지 문자를 자르겠다 라는 의미 입니다.
//	    (0, 100) 처럼 마지막 정수를 문자 길이 이상 만큼 지정하면 오류 발생.
//	입출력 예
//	phone_number : "01033334444", return : "*******4444"
//	phone_number : "027778888", return : "*****8888"
	public static String solution (String str) {
		String x = str.substring(str.length()-4, str.length()); //뒤에4자리
		System.out.println(x);
		String y = "";
		String z = "*";
		for (int i=0; i<str.length()-4; i++) {
			y += z;
		}
    }
    public static void main(String[] args) {
    String str = "ABCDEFG";
    str = solution(str);
    System.out.println(str);
        }
//  solution method 좀 더 효율적이고 실무에 가까운 방법
//	public static String solution (String str) {
//		int COUNT = 4;
//		final int len = str.length();
//		String x = str.substring(len-COUNT, len); //뒤에4자리
//		String star = "*";
//		for (int i=0; i<len-COUNT; i++) {
//			star += star;
//		}
//		return star+x;
//	}
//      변수 이름은 무슨 의미인지 알 수 있게 길게 짓는 연습!

//      현재 4의 의미는 뒤에 4자리를 의미한다
//      이때 변수 COUNT는 계속해서 사용하고, 절대값에 가깝기 때문에 대문자 변수로 지정한 것
//      변수이름의 경우 OTHER_STAR_NUMBER로 지정하면 좋을 듯 싶음

//      또한 뒤에 4자리가 아닌 그 외의 숫자가 들어올 때 한 번에 수정하기 쉽게 변수로 지정 한 것이기도 함
