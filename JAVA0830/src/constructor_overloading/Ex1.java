package constructor_overloading;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.printInfo();		
		
		Person p2 = new Person("이상","123456-1234567");
		p2.printInfo();		
		
		Person p3 = new Person("대한제국","단군","111111-9999999");
		p3.printInfo();		
	}

}

class Person {
	private String nation;
	private String name;
	private String jumin;
	
	public Person() {
		System.out.println("Person() 생성자 호출!");		
	}
	
	public Person(String sName, String sJumin) {
		System.out.println("Person(String, String) 생성자 호출!");		
		nation = "대한민국";
		name = sName;
		jumin = sJumin;
	}
	
	public Person(String sNation, String sName, String sJumin) {
		System.out.println("Person(String, String, String) 생성자 호출!");		
		nation = sNation;
		name = sName;
		jumin = sJumin;
	}
	
	public void printInfo() {
		System.out.printf("국가 : %s\n이름 : %s\n주민번호 : %s\n\n", nation, name, jumin);
	}
}