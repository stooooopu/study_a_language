//### 문제설명
//    정총무가 쏜 음식점 리스트에서 초밥집은 노홍철이 구매했다.
//    정총무가 쏘지 않은 음식점은 배열 몇번째에 있을까?
//
//### 제한사항
//- 메소드와 변수는 아래와 같이 선언.
//- 이름에 유재석과 박명수가 오면 0을 리턴.
//- 배열길이는 4를 넘지 않는다.
//	### 입출력 예
//    1
	public static int getList(String array[], String name){
	        int index = 0;
	        for (int i=0; i<array.length; i++) {
	        	if (name.equals("유재석") && name.equals("박명수")) {
	        		return 0;
	        	}if(array[i].equals("초밥집")) {
	        		index = i;
	        		}
	        	}
	        return index;
	        }

	public static void main(String[] args) {
        String 노홍철 = "초밥집";
        String array[] = {"편의점","초밥집","서점","전집"};
//        getList(array, 노홍철);
        System.out.println(getList(array,노홍철));
	}