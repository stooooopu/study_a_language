package shopping;

import java.util.ArrayList;
import java.util.List;

class Members{
	private String name;
	private List<String> stone;
	
	
	public List<String> getStone() {
		return stone;
	}

	public void setStone(List<String> stone) {
		this.stone = stone;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

public class Avengers {

	public static Members PrintMemberName(Members member) {
		try { // null을 걸러내기 위한 작업
			if(member == null) {
				member =new Members();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

		member.setName("토르");
		// stone을 추가하려면?
		// list를 불러옴(현재 list = null)
		List<String> list = new ArrayList<String>();

		// list에 값 추가 (현재 list[0]:파워스톤 / list[1]:타임스톤)
		list.add("파워스톤");
		list.add("타임스톤");
		
		// list를 member class에 추가
		member.setStone(list);
		return member;
	}
	
	public static void main(String[] args) {
		
		Members m = new Members();
		m.setName("캡틴아메리카");
		String name = m.getName();
		System.out.println("m name : "+name);
		
		// 모든 class의 초기값은 null
//		Members m2 = new Members();
		Members m2 = m; // 캡틴 아메리카가 나오는 이유는 m에서 이미 setName을 했으니까
		String name2 = m2.getName();
		System.out.println("m name2 : "+name2);

		// 방법1
		PrintMemberName(m);
		// 방법2
		PrintMemberName(new Members());
		//방법3
		Members m3=null; // class의 초기값인 null을 줄 수 있음
		PrintMemberName(m3);
		m3 = PrintMemberName(m3);
		m3.setName("헐크");
		m3.getName(); // 최종이름은 헐크

		// 이렇게 새로 정렬한 list는 위에서 선언한 list와 다른 것
		// new를 새로 대입하는 순간 새롭게 대입되는 것
		List<String> list = new ArrayList<String>();
		
		list.add("소울스톤");
		list.add("마인드스톤");
		list.add("순대국밥스톤");
		
		m3.setStone(list);
		System.out.println(m3.getStone().size());
		
	}
}
