package access_modifier;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		
		acc.setAccountNo("111-1111-111");
		acc.setBalance(10000);
		acc.setOwnerName("홍길동");
		
		System.out.println(acc.getAccountNo());
		System.out.println(acc.getBalance());
		System.out.println(acc.getOwnerName());
	}

}


class Account {
	private	String accountNo;
	private	String ownerName;
	private	int balance;
	
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
}