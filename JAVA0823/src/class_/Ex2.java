package class_;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Person p1 = new Person();
			p1.name = "아이티윌";
			p1.age = 100;
			
			p1.printInfo();
	}
}

class Person {
	String name;
	int age;
	
	void printInfo() {
		System.out.printf("이름 : %s\n나이 : %d", this.name, this.age);
	}
}
