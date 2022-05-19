package test;

import java.util.ArrayList;
import java.util.List;

class Food{
	private List<String> foodName;

	public List<String> getFoodName() {
		return foodName;
	}

	public void setFoodName(List<String> foodName) {
		this.foodName = foodName;
	}

	

}
public class 긴급점검5 {
	public static void main(String[] args) {
		List<String> f = new ArrayList<String>();
		f.add("카레");
		f.add("칼국수");
		f.add("전");
		for(int i=0; i<f.size(); i++) {
			System.out.println("음식이름은 : "+f.get(i));
			
		// list안에 데이터 타입 확인
		// 클래스 타입이면 클래스를 호출 해 준다(String 제외)
		// 호출한 클래스를 list에 담는다
		List<Food> list = new ArrayList<Food>();
		new Food(); // 다시 사용이 불가
		
		
		// 1번
		Food food = new Food();
		list.add(food);
		
		// 2번
		list.add(new Food());
		}
		
		Food f1 = new Food();
		// Food 클래스 안에 변수나 메소드를 사용하기 위해 new(인스턴스화)
		Food f2 = null;
		// Food 타입 변수에 null
		
		
	}
}
