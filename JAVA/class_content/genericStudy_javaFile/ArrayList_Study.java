package 컬렉션즈;

import java.util.ArrayList;

public class ArrayList_Study {

	public static void main(String[] args) {

		// int[] array = {0}; int형 배열
		// < > : 제네릭, 어떤 데이터타입의 데이터를 담을지 정해줌
		ArrayList<String> list = new ArrayList<String>(); //ctrl + shift + o -> import생성
		
		// 길이와 상관 없이 데이터를 무한으로 넣을 수 있음
		//.add(); : list에 데이터를 삽입
		//.get(); : list에 데이터 불러옴
		list.add("시금치 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		
		int len = list.size(); //list 길이 호출
		System.out.println(len);
		
		String value = list.get(0); //list 값 호출
		System.out.println(value);
		value = list.get(1);
		System.out.println(value);

		
		int count = 0;
		for(int i=0; i<len; i++) {
			if(list.get(i).equals("곱창 파스타")) {
				++count;
			}
		}
		System.out.println("곱창 파스타의 갯수는 : "+count);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(40);
		list2.add(60);
		list2.add(80);
		list2.add(30);

		int len2 = list2.size();
		// list에는 각 자리에 고유 주소가 있음 -> 만약 데이터가 삭제되면 그 주소를 다음 사람에게 넘김
		// list2.remove(1); // .remove(); : list2 데이터 삭제
		
		// list2의 숫자 총합
		int sum = 0;
		for (int i=0; i<len2; i++) {
//			sum += list2.get(i);
		if(list2.get(i)!=40) {
			sum += list2.get(i);
			}
		}
		System.out.println(sum);
		
		
		
		
	}

}
