package 상속3;

import java.util.ArrayList;
import java.util.List;

class UserVO{
	private String name;
	private int sal; //급여
	
	public UserVO(String name, int sal){
		this.name = name;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	public UserVO() {
		
	}
}

class MainUtil{
	
	public List<UserVO> getAllUsers(List<UserVO> list){ //전체 유저 호출

		return list;
	}
	
	public String getUser(List<UserVO> list, String name){ //특정 유저 호출
		for(UserVO vo: list) {
			System.out.println(vo.getName()+","+vo.getSal());
		}
		int[] arr = {1,2,3,4,5};
		for(int i : arr) {
			System.out.println(i);
		}
		
		return null;
	}
	
	public List<UserVO> deleteUser(List<UserVO> list, int index){
		for(int i=0; i<list.size(); i++) {
			if(i==index) {
				list.remove(i);
			}
		}
		return null;
	}
	
	public int getUserTotalSal(List<UserVO> list){
		int totalSum = 0;
		for(int i=0; i<list.size(); i++) {
			totalSum += list.get(i).getSal();
		}
		return totalSum;
	}
	
}
class x {
	int x;
}
public class MainService extends MainUtil{
	
	public static void main(String[] args) {
		//위에 MainUtil함수를 이용해서 문제풀 것.
		//1. 전체 유저 호출
		//2. 특정 유저 호출
		//3. 특정 유저 삭제
		//4. 모든 유저 급여 합 구하기
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("SMITH", 100));
		list.add(new UserVO("BRIAN", 300));
		list.add(new UserVO("ALLEN", 600));
		list.add(new UserVO("KING", 2000));
		
		UserVO vo = new UserVO();
		vo.setName("");
		vo.getName();
		x x = new x();
		x.x=0;
		
		MainService main = new MainService();
		for(int i=0; i<list.size(); i++) {
		System.out.print(list.get(i).getName()+", ");
		System.out.println(list.get(i).getSal());
	}
		System.out.println(main.getUser(list, "KING"));
		System.out.println(main.deleteUser(list, 0));
		System.out.println(main.getUserTotalSal(list));
	}
}