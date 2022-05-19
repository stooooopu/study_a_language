package 상속;
//알로하녹카페는 회원제로 운영한다.
//커피 10잔을 마시면 브론즈 회원
//커피 20잔을 마시면 실버 회원
//커피 30잔을 마시면 골드 회원
class UserLevel{
	
	int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		System.out.println("현재 주문한 커피는 "+count+"잔입니다");
		this.count += count;
		if(this.count<10) {
			System.out.println("지금까지 마신 커피는 총 "+this.count+"잔입니다");
			System.out.println("-----------------");
		}
		if(this.count >= 10 && this.count < 20) {
			System.out.println("지금까지 마신 커피는 총 "+this.count+"잔이고 브론즈 회원입니다");
			System.out.println("-----------------");
		}
		if(this.count >= 20 && this.count < 30) {
			System.out.println("지금까지 마신 커피는 총 "+this.count+"잔이고 실버 회원입니다");
			System.out.println("-----------------");
		}
		if(this.count >= 30) {
			System.out.println("지금까지 마신 커피는 총 "+this.count+"잔이고 골드 회원입니다");
			System.out.println("-----------------");
		}
	}

}

public class Cafe {
	public static void main(String[] args) {
		
		UserLevel userLevel = new UserLevel();
		
		userLevel.setCount(1);
		userLevel.setCount(6);
		userLevel.setCount(1);
		userLevel.setCount(6);
		userLevel.setCount(1);
		userLevel.setCount(6);
		
	}
}
