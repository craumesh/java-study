package reference_type_conversion;

import org.xml.sax.ext.Attributes2;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * instanceof 연산자
		 * - 좌변의 객체(참조변수)가 우변 클래스의 타입인지 판별하는 연산자
		 * - 참조변수가 부모 객체를 참조하는지 자식 객체를 참조하는지를 판별할 수 있음
		 * - 판별 결과가 true 이면 형변환이 가능한 관계(업캐스팅 or 다운캐스팅)
		 * 	판별 결과가 false 이면 절대로 형변환 불가능
		 * - 우변의 클래스 타입과 같거나 우변 클래스 타입의 자식 타입 모두 가능
		 * - A is a B = A instanceof B
		 * - 판별 결과를 boolean 타입 변수에 저장하거나
		 * 	if문에 판별하는 문장을 직접 사용 가능
		 * 
		 * < 기본 문법 >
		 * if(A instanceof B){
		 *	// A는 참조변수(객체), B는 클래스명(타입)
		 *	// 형변환이 가능한 관계이므로 변환 수행
		 * } else {
		 * 	// 절대로 형변환이 불가능한 관계이므로 변환 수행 X
		 * }
		 */
		
		SmartPhone2 sp = new SmartPhone2("GalaxyS24", "010-0101-1100", "Android");
		
		sp.call();
		sp.sms();
		sp.kakaoTalk();
		
		// sp는 스마트폰 입니까? A is a B?
		if(sp instanceof SmartPhone2) {
			System.out.println("sp는 SmartPhone이다");
			// sp를 스마트폰 타입 변수에 저장 가능
			SmartPhone2 phone = sp;
		} else {
			System.out.println("sp는 SmartPhone이 아니다");
		}
		
		System.out.println("======================================================");
		
		// 업캐스팅 가능 대상 확인
		// sp 는 HandPhone 입니까? Yes
		// SmartPhone(ps) is a HandPhone?
		if(sp instanceof HandPhone2) {
			System.out.println("sp는 HandPhone이다");
			System.out.println("그러므로 sp를 HandPhone으로 형변환 가능하다");
			
			// sp -> HandPhone 타입(hp)으로 변환
			HandPhone2 hp = sp; // 업캐스팅 = 묵시적 형변환
			System.out.println("sp는 HandPhone이 가진 모든 기능을 포함한다");
			System.out.println("따라서, 업캐스팅 이후에도 HandPhone의 기능 사용 가능");
			
			hp.call(); // HandPhone의 기능인 전화 기능과 문자 기능을 사용 가능 하지만
			hp.sms();
			//hp.kakaoTalk(); // SmartPhone의 기능은 사용을 포기해야 한다
		} else {
			System.out.println("sp는 HandPhone이 아니다");
		}
		
		System.out.println("======================================================");
		
		// 다운캐스팅 가능 대상 확인
		HandPhone2 hp = new HandPhone2("애니콜", "011-001-1101");
		
		// hp는 SmartPhone 인가?
		if(hp instanceof SmartPhone2) {
			System.out.println("hp는 SmartPhone이다");
		} else {
			System.out.println("hp는 SmartPhone이 아니다");
			System.out.println("그러므로 SmartPhone으로 변환 불가능");
			System.out.println("hp는 SmartPhone이 가진 기능을 모두 포함하지 못함");
		}
		
		System.out.println("======================================================");
		
		// SmartPhone -> HandPhone 타입으로 업캐스팅
		HandPhone2 hp2 = new SmartPhone2("GalaxyS25", "010-1100-0110", "Android");
		
		if(hp2 instanceof SmartPhone2) {
			System.out.println("hp는 SmartPhone이다");
			System.out.println("그러므로 hp를 SmartPhone으로 형변환 가능하다");
			SmartPhone2 sp2 = (SmartPhone2)hp2;
			System.out.println("sp2는 SmartPhone이 가진 모든 기능을 포함한다");
			sp2.call(); // HandPhone의 기능인 전화 기능과 문자 기능을 사용할 수 있으며
			sp2.sms();
			sp2.kakaoTalk(); // SmartPhone의 기능도 다시 사용이 가능해진다
		} else {
			System.out.println("hp는 SmartPhone이 아니다");
			System.out.println("그러므로 SmartPhone으로 변환 불가능");
			System.out.println("hp는 SmartPhone이 가진 기능을 모두 포함하지 못함");
		}
		
		System.out.println("======================================================");
		
		Child c = new Child();
		
		// Child -> Parent 자동 형변환이 가능하지만
		// 형변환을 바로 수행하지않고 instanceof 연산자를 통해 검사 후 수행
		if(c instanceof Parent) {
			System.out.println("c는 Parent이다");
			// 형변환 수행
			Parent p = c;
			p.parentPrn();
		} else {
			System.out.println("c는 Parent가 아니다");
		}
		
		Parent p2 = new Parent();
		// Parent -> Child 변환 가능 여부 판별 후 변환
		if(p2 instanceof Child) {
			System.out.println("p2는 Child이다");
			// 형변환 수행
			Child c2 = (Child)p2;
			c2.parentPrn();
			c2.childPrn();
		} else {
			System.out.println("p2는 Child가 아니다");
		}
	}
}


class HandPhone2 {
	String modelName;
	String phoneNumber;
	
	public HandPhone2(String modelName, String phoneNumber) {
		super();
		this.modelName = modelName;
		this.phoneNumber = phoneNumber;
	}	
	
	public void call() {
		System.out.println("전화 기능");
	}
	
	public void sms() {
		System.out.println("문자 기능");
	}
}

class SmartPhone2 extends HandPhone2 {
	String osName;

	public SmartPhone2(String modelName, String phoneNumber, String osName) {
		super(modelName, phoneNumber);
		this.osName = osName;
	}
	
	public void kakaoTalk() {
		System.out.println("카톡 기능");
	}
	
}