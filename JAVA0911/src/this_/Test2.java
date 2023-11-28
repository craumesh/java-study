package this_;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account2 acc1 = new Account2();
		acc1.showAccountInfo();
		System.out.println("\n");
		Account2 acc2 = new Account2("123-4567-891");
		acc2.showAccountInfo();
		System.out.println("\n");
		Account2 acc3 = new Account2("123-4567-891", "변상수");
		acc3.showAccountInfo();
		System.out.println("\n");
		Account2 acc4 = new Account2("123-4567-891", "변상수", 1000000000);
		acc4.showAccountInfo();
		
	
	}

}

class Account2 {
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public Account2() {
		this("111-1111-111","홍길동",0);
	}
	
	public Account2(String accountNo) {
		this(accountNo, "홍길동", 0);
	}

	public Account2(String accountNo, String ownerName) {
		this(accountNo, ownerName, 0);
	}
	
	public Account2(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void showAccountInfo() {
		System.out.printf("계좌번호 : %s\n예금주 : %s\n계좌잔액 : %d",accountNo,ownerName,balance);
	}
	
}