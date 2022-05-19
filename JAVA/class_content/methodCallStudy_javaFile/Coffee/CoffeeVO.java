package 메소드메소드;

public class coffeeVO {

	private String menu;
	private int syrup;
	
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
		//void라서 return이 올 수 없음
	}
	public int getSyrup() {
		return syrup;
	}
	public void setSyrup(int syrup) {
		this.syrup = syrup;
	}
	//여기에는 이렇게만 쓰임 이 안에서 로직 생성 금지!
	
}
