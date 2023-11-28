package inheritance;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItwillBank bankRun = ItwillBank.getInstance();
		bankRun.accountNum = "111-1111-111";
		bankRun.ownerName = "이진수";
		bankRun.balance = 100000000;
		bankRun.showAccountInfo();
		
		bankRun.deposit(1);
		bankRun.withdraw(120000000);	
		bankRun.contract("보험 사기");
		
	}

}

class Account {
	String accountNum;
	String ownerName;
	int balance;
		
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		if(money < balance) {
			balance -= money;
		} else {
			System.out.println("잔고가 부족하여 출금 불가!");
			System.out.printf("출금할 금액 : %d, 현재 잔고 : %d\n", money, balance);
		}
	}
	
	public void showAccountInfo() {
		System.out.printf("계좌번호 : %s\n계좌주 : %s\n계좌잔액 : %d\n", accountNum, ownerName, balance);
	}
}

class ItwillBank extends Account {
	String insureName;
	
	private ItwillBank() {}
	
	private static class LasyHolder {
		public static final ItwillBank instance = new ItwillBank();
	}
	
	public static ItwillBank getInstance() {
		return LasyHolder.instance;
	}
	
	public void contract(String insureName) {
		this.insureName = insureName;
		System.out.println(this.insureName + " 보험 계약 완료!");
	}
}