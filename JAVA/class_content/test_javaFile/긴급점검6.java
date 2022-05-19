package test;

import java.util.ArrayList;
import java.util.List;

class Food1{
	private String foodName;

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
}
public class 긴급점검6 {
	public static void main(String[] args) {
	List<Food1> list = new ArrayList<Food1>();
	
	Food1 f = new Food1();
	f.setFoodName("김치우동");
	list.add(f);
	
	Food1 f1 = new Food1();
	f1.setFoodName("우동");
	list.add(f1);
	
	// get()은 데이터 타입이 Food
	Food1 f2 = list.get(0);
	// 위에 식과 같은 의미
	for(Food1 f4 : list) { // Food1 f4 : list.get(i)와 동일한 것
		System.out.println(f4.getFoodName());
	}
		
	// get().getFoodName()은 데이터 타입이 String
	String f3 = list.get(0).getFoodName();
	
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i).getFoodName());
		}
	}
}
