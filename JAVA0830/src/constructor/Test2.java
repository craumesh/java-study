package constructor;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account2 acc = new Account2("111-1111-111", "대포통장", 1000000000);
		acc.printInfo();
	}

}

class Account2 {
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public Account2(String accountNo) {
		super();
		this.accountNo = accountNo;
	}
	
	public Account2(int balance) {
		super();
		this.balance = balance;
	}
	
	public Account2(String ownerName, int balance) {
		super();
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public Account2(String accountNo, String ownerName) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
	}
	
	public Account2(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void printInfo() {
		System.out.printf("계좌 번호 : %s\n계좌주 : %s\n계좌잔액 : %d\n", accountNo, ownerName, balance);
	}
	
}