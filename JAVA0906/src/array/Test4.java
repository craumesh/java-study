package array;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				sum += arr[i][j];
			}
			System.out.println();
		}
		System.out.println("배열의 모든 원소의 합 : " + sum);
		System.out.println("배열의 모든 원소의 평균 : " + sum / (arr[0].length + arr[1].length + arr[2].length));
		System.out.println("=======================================");
		
		String[] stdName = {"홍길동", "이순신", "강감찬", "최윤지", "정윤정"};
		int[][] stdPoint = {{80, 70, 80},{90,90,90},{50,60,77},{100,100,100},{80,80,60}};
		int[] sumStdPoint = new int[stdName.length];
		
		System.out.printf("\t<학생 점수표>\n\t국어\t영어\t수학\n");
		for(int i = 0; i < stdPoint.length; i++) {
			System.out.printf("%s", stdName[i]);
			for(int j = 0; j < stdPoint[i].length; j++) {
				System.out.printf("\t%d", stdPoint[i][j]);
				sumStdPoint[i] += stdPoint[i][j];
			}
			System.out.println();
		}
		System.out.println("=======================================");
		System.out.printf("\t<학생별 총점>\n");
		for(int i = 0; i < stdName.length; i++) {
			System.out.printf("%s : %d점\n", stdName[i], sumStdPoint[i]);
		}
	}
}
