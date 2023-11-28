package enum_type;

public class Ex3 {

	public static void main(String[] args) {		
		Month now = Month.FEBRUARY;
		System.out.println(now + ", " + now.getMonthKor());
	}

}


enum Month {
	JANUARY("1월"), FEBRUARY("2월");
	// => enum 타입은 각자가 객체로 취급되므로, 파라미터 생성자를 선언시
	//	생성자의 파라미터 데이터 형태에 대한 값을 입력해줘야함
	
	private String monthKor;
	
	private Month(String monthKor) { 
		this.monthKor = monthKor;
	}
	
	public String getMonthKor() {
		return monthKor;
	}

	public void setMonthKor(String monthKor) {
		this.monthKor = monthKor;
	}
	
}