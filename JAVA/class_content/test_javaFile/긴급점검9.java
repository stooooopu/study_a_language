package test;

import java.util.ArrayList;
import java.util.List;

class Chef{

	private int chefAge;

	public int getChefAge() {
		return chefAge;
	}

	public void setChefAge(int chefAge) {
		this.chefAge = chefAge;
	}
}

public class 긴급점검9 {
	// getChefList를 이용 30, 40, 50, 60 추가
	public static List<Chef> getChefList(){
		List<Chef> list = new ArrayList<Chef>();
		
		Chef c1 = new Chef();
		c1.setChefAge(30);
		Chef c2 = new Chef();
		c2.setChefAge(40);
		Chef c3 = new Chef();
		c3.setChefAge(50);
		Chef c4 = new Chef();
		c4.setChefAge(60);
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		
		return list;
	}
	
	// getChefListCount를 이용 나이가 50이상인 요리사 수 구하기
	public static int getChefListCount(List<Chef> list) {
		int count=0;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getChefAge()>=50) {
				++count;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		List<Chef> list = getChefList();
		
		for(Chef i : list) {
			System.out.println(i.getChefAge());
		}
		
		int age = getChefListCount(list);
		System.out.println(age);
		
	}
}
