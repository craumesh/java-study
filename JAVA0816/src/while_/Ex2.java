package while_;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * do - while문
		 * - while문은 조건을 먼저 거마하고 반복 여부를 결정한다
		 * do ~ while문은 일단 반복문을 먼저 실행하고 난 뒤에 조건을 검사하여
		 * 다음 반복 여부를 결정함
		 * - while 문은 조건식에 따라 반복 문이 단 한번도 실행 되지 않을 수도 있지만
		 * do ~ while문은 최소 한 번의 실행은 보장됨
		 */
		
		int i = 0;
		do {
			i++;
			System.out.println(i);			
		}while(i < i);
	}
}
