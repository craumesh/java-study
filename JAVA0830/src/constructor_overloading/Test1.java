package constructor_overloading;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate md1 = new MyDate(2077);
		md1.printInfo();
		
		MyDate md2 = new MyDate(2077, 07);
		md2.printInfo();
		
		MyDate md3 = new MyDate(2077, 07, 07);
		md3.printInfo();
		
	}

}

class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate(int year) {
		this.year = year;
		this.month = 1;
		this.day = 1;
	}
	
	public MyDate(int year, int month) {
		this.year = year;
		this.month = month;
		this.day = 1;
	}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void printInfo() {
		System.out.printf("%d년 %d월 %d일\n\n", year, month, day);
	}
}