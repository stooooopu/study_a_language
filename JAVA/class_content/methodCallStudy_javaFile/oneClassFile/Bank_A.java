package 상속;

class Account {
	int deposit;
	int withdraw;
	int totalMoney;

	// getter & setter
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		if(deposit > 500000) {
			System.out.println("입금금액은 500000원을 넘을 수 없습니다");
		}
		System.out.println("입금한 금액은 : "+deposit+"원 입니다");
		this.deposit += deposit; // 입금금액을 계속 더해줌
		this.totalMoney += deposit; // 잔액
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) { // 출금금액을 계속 더해줌
		if(this.totalMoney<withdraw) {
			System.out.println("잔금보다 큰 금액은 출금할 수 없습니다");
		}else {
			System.out.println("출금한 금액은 : "+withdraw+"원 입니다");
			this.withdraw += withdraw;
			this.totalMoney -= withdraw;			
		}
	}
	public int getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(int interest) { //잔액에서 이자 플러스
		this.totalMoney += interest;
	}
	
	
}

public class Bank_An {
//	이자는 은행이 주는것이기 때문에 따로 생성
	public static double paidINterestOnAccount(int money) {
		final double INTEREST_RATE = 0.1; // 이자율이 변하면 값만 고치면 됨		
		return money*INTEREST_RATE;
	}
	
	public static void main(String[] args) {

		Account account = new Account();
		System.out.println("현재잔고 : "+account.getTotalMoney()+"원 입니다");
		account.setDeposit(1000); //입금
		int myMoney = account.getTotalMoney();

		if(account.getTotalMoney()>0) {
			System.out.println("현재잔고 : "+account.getTotalMoney()+"원 입니다");
			account.setWithdraw(500); //출금
			System.out.println("현재잔고 : "+account.getTotalMoney()+"원 입니다");
			account.setDeposit(500000); //입금
			account.setDeposit(500000);
			System.out.println("현재잔고 : "+account.getTotalMoney()+"원 입니다");
			account.setDeposit(500000);
			System.out.println("현재잔고 : "+account.getTotalMoney()+"원 입니다");
			if(myMoney >= 1000000) { // 입금후 잔액이 1000000원이상이면
				int interestMoney = (int)paidINterestOnAccount(myMoney);
				account.setTotalMoney(interestMoney);
				System.out.println("현재잔고 : "+account.getTotalMoney()+"원 입니다");
			}
			
		}
		
	}
}
