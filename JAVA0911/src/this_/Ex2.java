package this_;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 생성자 this()
		 * - 자신의 생성자 내에서 자신의 또 다른 생성자를 호출
		 * - 레퍼런스 this 사용과 동일하게 자신의 인스턴스에 접근하여
		 * 	다른 오버로딩 된 생성자를 호출하는 용도로 사용
		 * - 생성자 오버로딩 시 이느턴스 변수에 대한 초기화 코드가 중복되는데
		 * 	초기화 코드 중복을 제거하는 용도로 사용
		 * 	=> 여러 생성자에서 각각 인스턴스 변수를 중복으로 초기화하지 않고
		 * 		하나의 생성자에서만 초기화 코드를 작성한 뒤
		 * 		나머지 생성자에서는 해당 초기화 코드를 갖는 생성자를 호출하여
		 * 		초기화 할 값만 전달 후 대신 인스턴스 변수를 초기화
		 * 	=> 메서드 오버로딩 시 코드의 중복을 제거하기 위해서
		 * 		하나의 메서드에서만 작업을 수행하고 나머지 메서드는
		 * 		해당 메서드를 호출하여 데이터를 전달하는 것과 동일함
		 * 		(단, 메서드는 메서드이름()으로 호출)
		 */
		MyDate d1 = new MyDate();
		System.out.println(d1.year + " / " + d1.month + " / " + d1.day);
		System.out.println();
		MyDate d2 = new MyDate(2023);
		System.out.println(d2.year + " / " + d2.month + " / " + d2.day);
		System.out.println();
		MyDate d3 = new MyDate(2023,9);
		System.out.println(d3.year + " / " + d3.month + " / " + d3.day);
		System.out.println();
		MyDate d4 = new MyDate(2023,9,11);
		System.out.println(d4.year + " / " + d4.month + " / " + d4.day);
	}

}

class MyDate {
	int year;
	int month;
	int day;
	
	public MyDate() {
		this(1900,1,1); // 자신의 생성자 내에서 다른 오버로딩 된 생성자 호출
		System.out.println("MyDate() 생성자 호출됨!");
//		year = 1900;
//		month = 1;
//		day = 1;
//		this(1); // 생성자 내의 다른 실행 코드 보다 아래쪽에 생성자 this()가 올 수 없다
	}
	
	public MyDate(int year) {
		this(year,1,1);
		System.out.println("MyDate(int) 생성자 호출됨!");
//		this.year = year;
//		month = 1;
//		day = 1;
	}

	public MyDate(int year, int month) {
		this(year,month,1);
		System.out.println("MyDate(int, int) 생성자 호출됨!");
//		this.year = year;
//		this.month = month;
//		day = 1;
	}

	public MyDate(int year, int month, int day) {
		System.out.println("MyDate(int, int, int) 생성자 호출됨!");
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	
}