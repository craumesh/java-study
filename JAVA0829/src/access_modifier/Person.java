package access_modifier;

public class Person {

	// 외부에서 멤버변수에 접근이 불가능하도록 private 접근제한자 적용
	private String name;
	private int age;

	// 멤버변수에 대신 접근하도록 Getter / Setter 메서드 정의(public 접근 제한자 사용)
	// 1. Getter 메서드 정의
	// 	=> 파라미터는 없고, 리턴값만 있는 메서드
	// String 타입 멤버변수 name에 대한 Getter 메서드
//	public String getName() {
//		return name;
//	}
//	
//	// int 타입 멤버변수 age에 대한 Getter 메서드
//	public int getAge() {
//		return age;
//	}
//	
//	// 2. Setter 메서드 정의
//	public void setName(String sName) {
//		// 외부로부터 전달받은 name 값(sName)을 멤버변수 name 에 저장
//		name = sName;
//	}
//	public void setAge(int iAge) {
//		age = iAge;
//	}
		
//	=============================================================================================

	// Getter / Setter 단축키를 통한 정의
	// => Alt + Shift + S -> R
	
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
	
}
