package constructor_overloading;

public class Test1_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2000;
		int month = 2;
		int day = 29;
		
		MyDate2 md = new MyDate2(year, month, day);
		md.printInfo();		
	}
}

class MyDate2 {
	private int year;
	private int month;
	private int day;
	private boolean leapYear;
	
	public MyDate2(int year, int month, int day) {
		this.year = verifi(year, "y");
		this.month = verifi(month, "m");
		this.day = verifi(day, month, "d");
	}
	
	private int verifi(int n, String s) {
		switch(s) {
		case "y" :
			if(n >= 1900 && n <= 2100) {
				if( n % 100 != 0 && n % 4 == 0 || n % 400 == 0) leapYear = true;
				else leapYear = false;
				return n;
			}
			break;
		case "m" : if(n >= 1 && n <= 12) return n;
		}
		return -1;	
	}
		
	private int verifi(int n, int m, String s) {
		switch(s) {
		case "d" : 
			switch(m) {
			case 1: case 3:	case 5:	case 7:	case 8:	case 10:
			case 12: if(n >= 1 && n <= 31) return n; break;
			case 4:	case 6:	case 9:
			case 11: if(n >= 1 && n <= 30) return n; break;
			case 2: if(leapYear) {
				if(n >= 1 && n <= 29) return n;
			} else if(n >= 1 && n <= 28) return n;
			}
		}
		return -1;	
	}		
	
	public void printInfo() {
		if(year != -1 && month != -1 && day != -1) System.out.printf("%d년 %d월 %d일\n\n", year, month, day);
		else System.out.printf("올바르지 않은 양식입니다!");
	}
}
