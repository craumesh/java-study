package for_;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 중첩 for문
		 * - for문 내부에 또 다른 for문을 기술하는 것
		 * - 바깥쪽 for문과 안쪽 for문으로 구분
		 * 	=> 바깥쪽 for문이 한 바퀴 돌 때, 안쪽 for문은 여러 바퀴를 돈다
		 *  => 즉 안쪽 for문의 반복 횟수가 바깥쪽 for문 반복 횟수보다 많다.
		 *  	= 안쪽 for문 반복 횟수 = 안쪽 for문 횟수 * 바깥쪽 for문 횟수
		 *  ex) 시계의 분침이 바깥쪽 for문으로 0~59까지 60번 반복할 때
		 *  	분침 1바퀴 당 초침이 안쪽 for문으로 0~59까지 60반복
		 *  	= 1시간(60분) 당 초침 반복 횟수 = 분침횟수(60) * 초침횟수(60)
		 */
		
		for(int i = 0; i < 24; i++) {
			for(int j = 0; j < 60; j++) {	
				for(int k = 0; k < 60; k ++) {
					System.out.println(i + "시 " + j + "분 " + k + "초");					
				}
			}
		}		
	}
}
