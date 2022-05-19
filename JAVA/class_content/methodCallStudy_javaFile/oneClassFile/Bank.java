package 상속;
//지유는 총 입금금액, 출금금액, 잔고금액을 보고싶다.
//(주)상원IT에 프로그램 개발을 의뢰했다.
//총 입금금액, 출금금액, 잔고금액을 
//확인할 수 있게 해야한다.
//조건)
//출금은 현재잔고보다 많을 수 없다.
//한번 입금할 때 50만원 이하로 할 수 있다.
//잔고가 100만원이 넘으면 이자 10%를 지급한다.
class ItSangwon{
	int totalMoney;
	
	public int getMoney() { // 잔고금액
		
		return this.totalMoney;
	}
	
	public void depositMoney(int money) { //입금금액
		double interestRate = 0; //이자
		if(money<=500000) {
			System.out.println("입금금액은 "+money+"원입니다");
			this.totalMoney += money;
			if(this.totalMoney>=1000000) {
				interestRate = this.totalMoney*0.1;
				this.totalMoney += interestRate;
			}
		}else {
			System.out.println("입금금액은 500,000원보다 작아야 합니다");
		}
	}
	
	public void withdrawMoney(int money) { //출금금액
		if(money>this.totalMoney) {
			System.out.println("출금액은 현재잔고보다 많을 수 없습니다.");
		}else {
			System.out.println("출금금액은 "+money+"원 입니다");
			this.totalMoney -= money; 
		}
	}
	
}

public class Bank {
	public static void main(String[] args) {
		ItSangwon It = new ItSangwon();
		It.totalMoney = 600000;
		System.out.println("현재금액은 "+It.totalMoney+"원 입니다");
		System.out.println("----------------------");
		if(It.totalMoney>0) {
			It.depositMoney(400000);
			System.out.println("현재금액은 "+It.totalMoney+"원 입니다");
			System.out.println("----------------------");
			It.depositMoney(600000);
			System.out.println("현재금액은 "+It.totalMoney+"원 입니다");
			System.out.println("----------------------");
			It.withdrawMoney(5000);
			System.out.println("현재금액은 "+It.totalMoney+"원 입니다");
			System.out.println("----------------------");
			It.withdrawMoney(5000);
			System.out.println("현재금액은 "+It.totalMoney+"원 입니다");
			System.out.println("----------------------");
		}
		
	}
	
}
