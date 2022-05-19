package 생성자;

public class UserCall {

	private User user;

	public static void main(String[] args) {
		
	User u = new User();
	UserVO vo = new UserVO();	
	
	vo.setAddr("서울");
	vo.setAge(28);
	vo.setName("최승철");
	vo.setNickName("총괄리다");
	u.setUser(vo);
	System.out.println(u.setUser(vo));
	
	
	}

}