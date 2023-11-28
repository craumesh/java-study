package String;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * StringBuffer 와 StringBuiler
		 * - String 클래스는 한 번 생성되면 그 내부의 문자열이 변경되지 않음
		 * - String 클래스를 사용하여 문자열을 계속 연결하거나 변경하는 프로그램을
		 * 	사용하면 메모리 낭비가 심함
		 * - 이 때, StringBuffer 또는 StringBuilder 를 활용하여 문자열을 변경하거나 연결
		 * - 두 클래스는 크게 차이가 없으며
		 * 	스레드가 동작하는 멀티스레드 프로그램이라면 문자열의 안전한 변경을 보장하는
		 * 	StringBuffer 클래스를 사용하고,
		 * 	스레드가 동작하지 않는 프로그램이라면 실행 속도가 좀 더 빠른
		 * 	StringBuilder 클래스를 사용
		 */
		
		String str = new String("JAVA");
		String str2 = new String("JAVA");
		System.out.println("str 문자열 주소 : " + System.identityHashCode(str));
		// => 인스턴스가 처음 생성될 때 메모리 주소 : 1023487453
		System.out.println(str); // JAVA => System.out.println(str.toString());
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		
		str = str + " and";
		System.out.println("str 문자열 주소 : " + System.identityHashCode(str));
		// => str 문자열 주소 : 1651191114 (변경됨!)
		System.out.println(str); // JAVA and 의 문자열을 갖는 메모리 영역이 새로 생성되었음을 알 수 있음
		// => 기존의 "JAVA" 문자열을 갖는 메모리 영역은 참조하는 변수가 없을 경우
		//		자바에서 제공하는 가비지 컬렉터에 의해서 자동으로 사라짐
		
		str += " JSP";
		System.out.println("str 문자열 주소 : " + System.identityHashCode(str));
		// => str 문자열 주소 : 1586600255 (변경됨!)
		
		str += " Programming is soooooooooo fun!!!!!!!!!!!!!!";
		System.out.println("str 문자열 주소 : " + System.identityHashCode(str));
		// => str 문자열 주소 : 474675244 (변경됨!)
		System.out.println(str);
		
		System.out.println("==========================================================");
		
		String str3 = new String("Java");
		
		StringBuilder buffer = new StringBuilder(str3);
		// => String으로부터 StringBuilder 생성
		
		System.out.println("연산전 Buffer 메모리 주소 : " + System.identityHashCode(buffer));
		// => 인스턴스가 처음 샐성될 때의 메모리 주소 : 932583850

		buffer.append(" and");
		System.out.println("연산후 Buffer 메모리 주소 : " + System.identityHashCode(buffer));
		// => 연산 후 Buffer 메모리 주소 : 932583850
		
		buffer.append(" JSP");
		System.out.println("연산후 Buffer 메모리 주소 : " + System.identityHashCode(buffer));
		// => 연산 후 Buffer 메모리 주소 : 932583850
		
		buffer.append(" PROGRAMMING IS SOOOOOOOOOOOOOOOOOOOO FUN!!!!!!!!!!!!!!!!");
		System.out.println("연산후 Buffer 메모리 주소 : " + System.identityHashCode(buffer));
		// => 연산 후 Buffer 메모리 주소 : 932583850
		
		str3 = buffer.toString();
		System.out.println(str3);
		System.out.println("새로 만들어진 str3 문자열 주소 : " + System.identityHashCode(str3));
		
	}

}
