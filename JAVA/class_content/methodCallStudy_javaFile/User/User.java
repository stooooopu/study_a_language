package 생성자;

public class User {

	private int count;
	

	UserVO vo = new UserVO();	

	public boolean setUser(UserVO u) {
//		System.out.println(vo.getAddr());
//		System.out.println(vo.getAge());
//		System.out.println(vo.getName());
//		System.out.println(vo.getNickName());
		return true;
	}
	public int getUserCount() {
		return 0;
	}
	public int updateUser(UserVO u) {
		return 0;
	}
	public int deleteUser(UserVO u) {
		return 0;
	}
	public UserVO getUser(int x) {
		return null;
	}
	
	
}
