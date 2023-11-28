package static_member;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonAccount sa = SingletonAccount.getInstance();
		sa.setAccountNo("111-1111-111");
		sa.setOwnerName("홍길동");
		sa.setBalance(10000);
		
		sa.showAccountInfo();
	}
}

class SingletonAccount {
	private String accountNo;
	private String ownerName;
	private int balance;
	
	private SingletonAccount() {}
	
	private static class Holder {
		public static final SingletonAccount instance = new SingletonAccount();
	}
	
	public static SingletonAccount getInstance() {
		return Holder.instance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}	
	
	public void showAccountInfo() {
		System.out.printf("계좌번호 : %s\n계좌주: %s\n계좌잔액 : %d\n", accountNo, ownerName, balance);
	}
}