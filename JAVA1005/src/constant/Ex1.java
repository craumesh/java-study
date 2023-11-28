package constant;

import java.util.Calendar;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 상수(Constant)
		 * - 변하지 않는 데이터 = 변하지 않는 데이터를 저장한 변하지 않는 변수
		 * - 보통 클래스 내에서 상수를 선언 시 PUBLIC STATIC FINAL 형태로 선언
		 * 1) PUBLIC : 누구나 접근 가능
		 * 2) STATIC : 클래스 로딩 시 함께 로딩되어 인스턴스 생성과 무관하며,
		 * 				클래스 하나 당 생성되며, 모든 인스턴스가 공유함
		 * 				=> 클래스명만으로 접근 가능(클래스명.변수명)
		 * 3) FINAL : 데이터 변경 불가 = 상수
		 */
		
		CarInfo ci = new CarInfo();
		ci.setCarModelName("AVANTE");
		ci.setColor(0x000000);
		ci.setCompany("HYUNDAI");
		
		if(ci.getCompany().equals("HYUNDAI") ) {
			System.out.println("현대 자동차 입니다!");
		} else {
			System.out.println("현대 자동차가 아닙니다!");
		}
		
		if(ci.getCompany().equals("AVANTE") ) {
			System.out.println("아반떼 입니다!");
		} else {
			System.out.println("아반떼가 아닙니다!");
		}
		
//		CarInfoWithConstant ci2 = new CarInfoWithConstant();
//		ci2.setCarModelName(CarInfoWithConstant.CAR_MODEL_NAME_SONATA);
//		ci2.setColor(CarInfoWithConstant.COLOR_PERPECT_BLACK);
//		ci2.setCarModelName(CarInfoWithConstant.COMPANY_KIA);
//		
//		if(ci2.getCompany().equals(CarInfoWithConstant.COMPANY_KIA)) {
//			System.out.println("현대 자동차 입니다!");
//		} else {
//			System.out.println("현대 자동차가 아닙니다!");
//		}
//		
//		if(ci2.getCarModelName().equals(CarInfoWithConstant.CAR_MODEL_NAME_SONATA)) {
//			System.out.println("소나타 입니다!");
//		} else {
//			System.out.println("소나타가 아닙니다!");
//		}
//		
//		if(ci2.getColor() == CarInfoWithConstant.COLOR_PERPECT_BLACK) {
//			System.out.println("뻐빽뜨 블랙 입니다!");
//		} else {
//			System.out.println("뻐빽뜨 블랙이 아닙니다!");
//		}
		
		// 상수 활용의 예
		// - Calendar 클래스를 사용하여 날짜 정보를 관리할 때
		//	Calendar 클래스의 get() 메서드를 통해
		// 	연도, 월, 일 등의 정보를 가져오는데
		//	항목 지정 시 Calendar 클래스에서 제공하는 상수를 통해 지정
		Calendar cal = Calendar.getInstance();
		System.out.println("올해는 몇 년도?" + cal.get(Calendar.YEAR));
		
		
	}
}

class CarInfoWithConstant{
	private String company;
	private String carModelName;
	private int color;
	
	// 특정 클래스 내에서 사용되는 데이터를 상수로 제공하면
	// 문자열의 오타나 정수형 파라미터 사용 시 등의
	// 다양한 어려움에서 오는 문제점을 해결할 수 있다
	// => 주로 상수는 public static final 키워드 사용
	//	public 에 의해 어디서든 접근 가능하며
	//	static 에 의해 클래스명만으로 인스턴스 생성없이 접근 가능하며
	//	final 에 의해 데이터가 변경되지 않음
	//	=> 상수의 이름을 명확하게 지정함으로써
	//		복잡한 데이터도 이름만으로 단순히 사용이 가능하게 된다
	
	public static final String COMPANY_HYUNDAI = "HYUNDAI";
	public static final String COMPANY_KIA = "KIA";
	public static final String COMPANY_CHEVROLET = "CHEVROLET";
	
	public static final String CAR_MODEL_NAME_SONATA = "SONATA";
	public static final String CAR_MODEL_NAME_K5 = "K5";
	public static final String CAR_MODEL_NAME_SPARK = "SPARK";
	
	public static final int COLOR_PERPECT_BLACK = 0x000001;
	public static final int COLOR_CREAM_WHITE = 0xFFFFCC;
	public static final int COLOR_BARCELONA_RED = 0xFF0000;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCarModelName() {
		return carModelName;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}	
}

class CarInfo{
	private String company;
	private String carModelName;
	private int color;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCarModelName() {
		return carModelName;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
	
	
}
