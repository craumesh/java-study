package class_;

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	void showAccountInfo(){
		System.out.printf("계좌 번호 : %s\n예금주명 : %s\n현재 잔고 : %d원\n", accountNo, ownerName, balance);
	}
}


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAC = new Account();
		myAC.accountNo = "111-2222-3456789";
		myAC.ownerName = "대포통장";
		myAC.balance = 1000000000;
		
		myAC.showAccountInfo();
	}

}

