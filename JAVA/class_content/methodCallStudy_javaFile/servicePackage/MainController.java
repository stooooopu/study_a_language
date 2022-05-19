package service;

public class MainController {
//	5-1. main 메소드에서 UserVO 클래스 호출(객체 생성)
//	5-2. main 메소드에서 MainService 클래스 호출(객체 생성)
//	5-3. MainService getUser 메소드 호출
//	5-4. getUser 메소드 로직 아래와 같이 추가할 것.
//	     파라미터에 1이상 100이하 숫자 입력.
//	     파라미터 데이터가(위에조건) UserVO 필드변수 id에 대입.
//	     UserVO set 메소드 사용해서 id를 제외한 필드변수 데이터 대입.
//	5-5. main에서 getUser 메소드 리턴 결과 출력
//	*(파라미터로 받은 id)와 (이름)만 출력
//	"id : 30"
//	"name : 현상원"
	public static void main(String[] args) {
		UserVO user = new UserVO();
		MainService main = new MainService();
	
		user = main.getUser(30);
		//리턴 값이 있으면 우선 변수로 받자.
		System.out.println(user.getId());
		System.out.println(user.getName());
	}
}
