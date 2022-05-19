package service;

public class MainService {//UserVO의 필드변수를 이용해 로직을 구현 하는 것!!!!!!!!

	
	public void setUser(UserVO vo) {
		
	}

	public UserVO getUser(int x) {
		//리턴타입이 UserVO
		//UserVO를 리턴하기 위해서 UserVO를 호출해야함.(== 객체화 해야함)
		UserVO vo = new UserVO();
		vo.setId(x);
		vo.setEmail("email");
		vo.setLogin(true);
		vo.setName("홍길동");
		vo.setPhone("010");
		return vo;
	}
}