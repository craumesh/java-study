package operator;

public class Ex7 {

	public static void main(String[] args) {
		/* 증감연산자(++,--)
		 * - 단항연산자
		 */
		// 증감연산자를 먼저 사용
		int i = 9;
		int j = ++i;
		
		// 갑을 대입 후 증감연산자 사용
		int k = 9;
		int l = k++;
		
		System.out.println(i + " " + j);
		System.out.println(k + " " + l);
	}

}
