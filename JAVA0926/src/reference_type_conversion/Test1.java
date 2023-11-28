package reference_type_conversion;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone();
//		sp.call();
//		sp.message();
//		sp.kakaoTalk();
		
		HandPhone hp = new HandPhone();
//		hp.call();
//		hp.message();
		
		Telephone tp = new Telephone();
//		tp.call();
		
		System.out.println("====================================================");
		
		hp = sp;		
		hp.call();
		hp.message();
		
		sp = (SmartPhone)hp;		
		sp.call();
		sp.message();
		sp.kakaoTalk();
	}

}

class Telephone {
	public void call() {
		System.out.println("전화 걸기");
	}
}

class HandPhone extends Telephone {
	public void message() {
		System.out.println("문자 전송");
	}
}

class SmartPhone extends HandPhone {
	public void kakaoTalk() {
		System.out.println("카카오톡 전송");
	}
}