package this_;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * this 키워드
		 * - 자신의 인스턴스 주소값을 저장하는 참조 변수
		 * 	=> 개발자가 생성하는 것이 아니라 자바에 의해 자동으로 생성됨
		 * - 모든 인스턴스 내에는 this 가 존재하며, 자신의 인스턴스 주소가 저장됨
		 * 	=> 즉, 인스턴스 마다 this 에 저장된 값이 다름
		 * 
		 * 1. 레퍼런스 this
		 * 	- 자신의 인스턴스 내의 멤버에 접근(멤버변수 or 멤버메서드)
		 * 	- 주로 로컬변수와 인스턴스 변수(=멤버변수)의 이름이 같을때
		 * 	인스턴스 변수를 지정하는 용도로 사용
		 * 
		 * < 레퍼런스 this 사용 기본 문법 >
		 * 자신의 클래스 내의 생성자 또는 메서드 내에서
		 * this.인스턴스 변수 또는 this.메서드()형태로 접근
		 */
		
		Person p = new Person("애옹", 4);
		System.out.println(p.toString());
	}

}

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}	
	
	// 로컬변수와 멤버변수를 구별하기 위해서는 멤버변수 앞에
	// 레퍼런스 this 를 사용하여 해당 인스턴스에 접근하는 코드로 사용해야함
	// => 외부에서 멤버변수 name에 접근 시 참조변수명.name 형태로 접근하듯이
	// 	내부에서 멤버변수 name에 접근 시 this.name 형태로 접근
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}