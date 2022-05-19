package 상속3;

import java.util.ArrayList;
import java.util.List;

class UserVO2{
	private String name;
	private int age;
	
	// 현재 전역변수가 private으로 선언 -> 이 전역변수는 UserVO2에서만 사용가능
	// 다른클래스에서 사용하기 위해선 생성자를 이용 파라미터로 값을 받아서 public으로 
	public UserVO2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public UserVO2(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class User{
	
}

public class MainService2 extends User {
	
	public static void main(String[] args) {
		// dataType이 UserVO인 ArrayList 생성
		List<UserVO2> list = new ArrayList<UserVO2>();
		// public UserVO(name, age)메소드
		list.add(new UserVO2("최승철",1));
		// dataType이 UserVO2인데 "윤정한",2는 String, int 타입이라 안됨
		// list.add("윤정한",2);
		
		
		
	}
}
