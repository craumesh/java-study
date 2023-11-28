package class_;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 p1 = new Person2();
		
		p1.name = "아이티윌";
		p1.age = 100;
		
		p1.eat("치킨");
		p1.showInfo();
		p1.talk();
		p1.showInfo();
	}

}

class Person2 {
	String name;
	int age;
	boolean isHungry;
	
	public void showInfo() {
		System.out.printf("이름 : %s\n나이 : %d\n배고픔 : %b\n\n", name, age, isHungry);
	}
	
	public void eat(String foodName) {
		isHungry = false;
		System.out.printf("%s 먹기!\n\n", foodName);
	}
	
	public void talk() {
		isHungry = true;
		System.out.printf("말하기!\n\n");
	}
}