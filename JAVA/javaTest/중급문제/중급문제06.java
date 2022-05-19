//		### 문제설명
//	    문자열 평균구하기
//	### 제한사항
//	- 점수중에 100점이 있다면 "100점 만점에 100점!" 출력.
//	- 평균 소수점 무시. (int형으로 받을 것)
//	### 입출력 예
//    100점 만점에 100점!
//    281
//    70
	public static void main(String[] args) {
        String scores = "80, 70, 100, 31";//컬럼 하나에 숫자를 이렇게 많이 넣음
        String array[] = scores.split(",");
        int len = array.length; //과목 수
        int 총점 = 0;
        for (int i=0; i<len; i++) {
			int temp = Integer.parseInt(array[i].trim());//trim 공백제거 앞뒤로 됨 공백이 있는 문자는 숫자로 배열 못함 가운데 공백 제거는 replace
			if (temp == 100) {
				System.out.println("100점 만점에 100점!");
			}
			총점 = 총점 + temp;
        }
        
        	System.out.print("총점 : "+총점);
        	System.out.print("평균 : "+총점/len);
		
	}