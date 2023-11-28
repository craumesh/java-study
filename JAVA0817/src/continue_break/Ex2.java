package continue_break;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Label 기능
		 * - 반복문의 앞에 위치하며 break 또는 continue 의 동작 지점을 지정
		 * - break 문 또는 continue 문 뒤에 해당 레이블의 이름을 지정할 경우
		 * 	Label 위치의 다음 반복문에 break 또는 continue 문이 적용됨
		 * - 주로, 중첩 반복문에서 반복문을 한꺼번에 빠져나가기 위해 사용
		 * - 반복문 앞 또는 위에 주로 대문자로 된 문자를 작성하고 콜론을 붙임
		 */
		
		Loop1:
		while(true) {
			Loop2:
			for(int i = 2; i < 10; i++) {
				if(i == 5) {
					continue Loop2;
				}else if(i == 7) {
					break Loop1;
				}
				System.out.printf("[%d단]\n", i);
				for(int j = 1; j < 10; j++) {				
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}
				System.out.printf("\n");
			}
		}
	}
}
