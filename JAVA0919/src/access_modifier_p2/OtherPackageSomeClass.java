package access_modifier_p2;

import access_modifier_p1.ParentClass;

public class OtherPackageSomeClass {
	public void useMember() {
		// 다른 패키지의 상속 관계까 아닌 다른 클래스에서의 접근
		// => 인스턴스 생성 후 참조 변수를 통해 접근해야 함 = has-a 관계
		// => 다른 패키지이므로 import문이 필요
		
		ParentClass p = new ParentClass();
		p.publicVar = 10;
		//p.protectedVar = 20; // 패키지가 다르고 상속 관계또한 아니므로 접근 불가
		//p.defaultVar = 30; // 패키지가 다르므로 접근 불가
		//p.pritvateVar = 40; // 클래스가 다르므로 접근 불가
	}
}
