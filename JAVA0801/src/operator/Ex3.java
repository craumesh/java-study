package operator;

public class Ex3 {

	public static void main(String[] args) {
		
		/* 문자열에 대한 덧셈 연산자(+) = 연결 연산자
		 * - 어떤 데이터를 문자열과 덧셈 연산자로 연산 할 경우
		 * 산술 연산의 덧셈이 아닌 단순 문자열 결합으로 사용됨
		 * 이 때, 어떤 데이터를 문자열 타입으로 변환하여 두 문자열을 연결
		 * ex) "문자열" + "문자열" = "문자열문자열" or int + "문자열" = "int" + "문자열" = "int문자열"
		 */
		String s1 = "안녕";
		char c1 = '!';
		int i1 = 10, i2 = 20;
		int i3 = i1 + i2;
		
		System.out.println(s1 + c1);
		System.out.println(i1 + i2);
		System.out.println(s1 + i1 + i2);
		System.out.println(i1+ "+" + i2 + "=" + i3);
	}

}
