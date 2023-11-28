package constructor;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account("111-1111-111","홍길동",10000);
		acc1.printInfo();
	}
}

class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public Account(String sAN, String sON, int iB){
		System.out.println("생성자 호출됨!\n");
		accountNo = sAN;
		ownerName = sON;
		balance = iB;
	}
	
	public void printInfo() {
		System.out.printf("계좌 번호 : %s\n계좌주 : %s\n계좌잔액 : %d\n", accountNo, ownerName, balance);
	}
}
