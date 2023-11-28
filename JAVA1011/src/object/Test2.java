package object;

import java.util.Objects;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account("1111-111-111111","홍길동", 100000);
		Account acc2 = new Account("1111-111-111111","홍길동", 100000);
		
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
		
		if(acc1.equals(acc2)) {
			System.out.println("1번 계좌와 2번 계좌의 정보는 같다!");
		} else {
			System.out.println("1번 계좌와 2번 계좌의 정보는 다르다!");
		}
	}

}

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountNo, other.accountNo) && balance == other.balance
				&& Objects.equals(ownerName, other.ownerName);
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
}
