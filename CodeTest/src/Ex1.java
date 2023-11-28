public class Ex1 {

	public static void main(String[] args) {
		Account acc = new Account("123-45-6789", "홍길동", 10000);
		acc.deposit(5000);
		acc.withdraw(5000);
		acc.withdraw(5000);
		acc.deposit(5000);
		acc.withdraw(15000);
	}
}

class PeeCalc {
	private final int PEE = 50000;
	private int age = 14;
	
	public void calc(){
		if(age >= 65 || age < 5){
			System.out.println("나이가 " + age + "세이므로 입장료는 " + (PEE-PEE/100*50) + "원입니다.");
		} else if(age >= 5 && age <= 19){
			System.out.println("나이가 " + age + "세이므로 입장료는 " + (PEE-PEE/100*30) + "원입니다.");
		} else {
			System.out.println("나이가 " + age + "세이므로 입장료는 " + PEE + "원입니다." );
		}
	}
}

class CharChecker {
	private char ch = '!';
	
	public void check() {
		if(ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " : 소문자");
		} else if(ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " : 대문자");
		} else if(ch >= '1' && ch <= '9') {
			System.out.println(ch + " : 숫자");
		} else {
			System.out.println(ch + " : 기타문자");
		}
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
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금금액 : " + amount + ", 현재잔고 : " + balance + "원");
	}
	
	public int withdraw(int amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println(amount + "원이 출금 되었습니다 (현재 잔고 : " + balance + "원)");
			return amount;
		} else {
			System.out.println("현재잔고 : " + balance + "원, 출금할 금액 : " + amount + "원");
			System.out.println("잔고가 부족하여 출금할 수 없습니다.");
			return 0;
		}
	}
	
}