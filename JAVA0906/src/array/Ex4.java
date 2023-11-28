package array;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2차원 배열
		 * - 1차원 배열 여러개의 묶음을 관리하는 배열
		 * - 행과 열로 이루어진 테이블 구조와 유사한 구조의 배열
		 * 	=> 행과 열의 인덱스는 1차원 배열과 동일
		 * 
		 * < 2차원 배열 선언 및 생성 기본 문법 >
		 * 데이터타입[][] 변수명 = new 데이터타입[행크기][열크기]
		 * 
		 * < 2차원 배열 접근 기본 문법 >
		 * 변수명[행인덱스][열인덱스];
		 * 
		 * < 2차원 배열 선언, 생성, 초기화를 한꺼번에 수행하는 문법>
		 * 데이터타입[][] 변수명 = {{값1,값2,...,값n},{값1,값2,...,값n},...,{값1,값2,...,값n}};
		 * 
		 * < 2차원 배열 크기 >
		 * 1. 행의 크기 : 변수명.length;
		 * 2. 열의 크기 : 변수명[행번호].length;
		 * 
		 * < 2차원 배열의 모든 요소를 차례대로 접근하는 문법 >
		 * for(int i = 0; i < 변수명.length; i++) {
		 * 		for(int j = 0; j < 변수명[행번호].length; j++) {
		 * 		}
		 * }
		 */
		
		int[][] array = new int[3][2];
		
		/*		|	 0열	|	 1열
		 * -----------------------------
		 * 0행	|	(0, 0)	|	(0, 1)
		 * -----------------------------
		 * 1행	|	(1, 0)	|	(1, 1)
		 * -----------------------------
		 * 2행	|	(2, 0)	|	(2, 1)
		 */
		
		System.out.println("배열 행 길이 : " + array.length + "\n배열 1열 길이 : " + array[0].length);
		array = new int[][] {{1,2},{3,4},{5,6}};
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("======================================");
		
		int[][] arr2 = {{1,2},{3,4},{5,6}};
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("======================================");
		
		String[][] str = {{"윤종현", "권영찬", "변치욱"},{"손보성", "정수아", "서현정"},{"박가경", "신승민", "김효린"}};
		for(int i = 0; i < str.length; i++) {
			System.out.print(i + "행 : ");
			for(int j = 0; j < str[i].length; j++) {
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("======================================");
		
		// 2차원 배열은 행을 먼저 생성한 후 별도로 열을 각각 생성 가능하다
		// 데이터타입[][] 배열명 = new 데이터타입[행크기][];
		int[][] arr3 = new int[3][];
		
		//각 행에 접근하여 열을 생성하는 코드 작성
		arr3[0] = new int[3];
		arr3[1] = new int[2];
		arr3[2] = new int[4];

		for(int i = 0; i < arr3.length; i++) {
			System.out.println("배열 " + i + "열 길이 : " + arr3[i].length);
		}
		
		System.out.println("======================================");
		
		arr3[0][0] = 1; arr3[0][1] = 2;	arr3[0][2] = 3;
		arr3[1][0] = 1; arr3[1][1] = 2;
		arr3[2][0] = 1; arr3[2][1] = 2;	arr3[2][2] = 3; arr3[2][3] = 4;
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(i + "행 : ");
			for(int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("======================================");
		
		arr3[0] = new int[] {1,2,3};
		arr3[1] = new int[] {1,2};
		arr3[2] = new int[] {1,2,3,4};
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(i + "행 : ");
			for(int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}	
		
	}
}
