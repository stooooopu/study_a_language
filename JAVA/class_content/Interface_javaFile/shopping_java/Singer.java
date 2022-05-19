package shopping;

import java.util.ArrayList;
import java.util.List;

public class Singer {
	public static List<String> Singer2(List<String> list){
		list = new ArrayList<String>();
		
		list.add("전소미");
		list.add("아이브");
		return list;
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("아이유");
		list = Singer2(list);
		
		list.add("빅마마");
		// list = new ArrayList<String>();를 추가 하지 않았으면
		// => 길이는 4
		// 순서는: 0, 이름은: 아이유/ 순서는: 1, 이름은: 전소미/ 순서는: 2, 이름은: 아이브/ 순서는: 3, 이름은: 빅마마
		
		// list = new ArrayList<String>();를 추가
		// => 길이는 3
		// 순서는: 0, 이름은: 전소미/ 순서는: 1, 이름은: 아이브/ 순서는: 2, 이름은: 빅마마
		// singer(list)로 아이유가 파라미터로 넘어갔는데
		// 다시 new로 선언해서 아이유는 사라지고 전소미, 아이브만 add된 상태로 return됨
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.print("/ 순서는: "+i+", 이름은: "+list.get(i));
		}
	}

}
