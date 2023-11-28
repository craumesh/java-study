package this_;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account("111-0000-111111", "이진수", 10110001);
		acc.showAccountInfo();
	}

}

class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
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
		System.out.println("Account [accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]");
	}	
}