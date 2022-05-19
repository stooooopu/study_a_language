package test;

import java.util.ArrayList;
import java.util.List;

class Lunch{
	
//	private String foodName;
	
//	public String getFoodName() {
//		return foodName;
//	}
//
//	public void setFoodName(String foodName) {
//		this.foodName = foodName;
//	}
	private List<String> foodName;

	public List<String> getFoodName() {
		return foodName;
	}

	public void setFoodName(List<String> foodName) {
		this.foodName = foodName;
	}
	
	
}

public class 긴급점검7 {
	
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(10);
//		list.add(20);
//		// Integer은 밑에처럼 int로 가능
//		for(Integer i : list) {
//			System.out.println(i);
//		}
//		for(int i : list) {
//			System.out.println(i);
//		}

//		List<Lunch> list = new ArrayList<Lunch>();
//		Lunch x = new Lunch();
//		x.setFoodName("칼국수");
//		list.add(x);
//		
//		Lunch y = new Lunch();
//		y.setFoodName("스바라시라멘");
//		list.add(y);
//		
//		
//		for(Lunch l : list) {
//			System.out.println(l.getFoodName());
//		}
			
		
		List<String> list = new ArrayList<String>();
		list.add("스바라시라멘");
		list.add("우동");
		
		Lunch lunch = new Lunch();
		lunch.setFoodName(list);
		
		System.out.println(lunch.getFoodName());
		
		System.out.println(lunch.getFoodName().get(0));
		System.out.println(lunch.getFoodName().get(1));
		
		for(int i=0; i<lunch.getFoodName().size(); i++) {
			System.out.println(lunch.getFoodName().get(i));
		}
		
		// List<String> 이기 때문에 데이터타입이 Lunch가 아닌 String임
		for(String foodName : lunch.getFoodName()) {
			System.out.println(foodName);
		}
	}
}
