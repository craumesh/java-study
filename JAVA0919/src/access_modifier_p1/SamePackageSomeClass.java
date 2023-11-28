package access_modifier_p1;

public class SamePackageSomeClass {
	public void useMember() {
		// 같은 패키지 내의 다른 클래스(ParentClass)의 멤버에 접근
		// => 인스턴스 생성 후 참조 변수를 통해서 접근해야 함
		// => 같은 패키지이므로 import문은 불필요
		ParentClass p = new ParentClass();
		p.publicVar = 10;
		p.protectedVar = 20;
		p.defaultVar = 30;
		//p.privateVar = 40; // 다른 클래스에서 접근 불가
		
	}
}
