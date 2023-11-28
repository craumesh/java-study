package class_;

class Account2 {
	private
	String accountNO;
	String name;
	int balance;
	
	Account2(String aNo, String sName, int iBalance) {
		accountNO = aNo;
		name = sName;
		balance = iBalance;
	}
	
	protected void showInfo() {
		System.out.printf("계좌 번호 : %s\n예금주 : %s\n현재 잔고 : %d원\n\n", accountNO, name, balance);
	}
	
	protected void deposit(int amount) {
		balance += amount;
		System.out.printf("입금 하신 금액 : %d원\n입금 후 현재 잔고 : %d원\n\n", amount, balance);
		
	}
	
	protected int withDraw(int amount) {		
		if(balance < amount) {
			System.out.printf("계좌에 잔액이 모자랍니다!\n\n");
			return 0;
		}
		System.out.printf("출금 하신 금액 : %d원\n출금 후 현재 잔고 : %d원\n\n", amount, balance - amount);
		return amount;
	}
}

public class Test2_2 {

	public static void main(String[] args) {
		Account2 myAc = new Account2("111-2222-3456789", "홍길동", 0);
		
		myAc.showInfo();
		myAc.deposit(10000);		
		myAc.balance -= myAc.withDraw(6000);		
		myAc.balance -= myAc.withDraw(5000);
		myAc.showInfo();
	}

}
