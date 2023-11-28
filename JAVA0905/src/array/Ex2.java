package array;

import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * < 배열 선언, 생성, 초기화를 한꺼번에 수행하는 문법 >
		 * 데이터타입[] 변수명 = {데이터1, 데이터2, ..., 데이터n}
		 * => 배열 생성 문법을 별도로 명시하지 않고
		 * 	중괄호를 사용하여 초기화할 데이터를 리터럴 형태로 전달하면
		 * 	해당 데이터 개수만큼 배열 공간이 자동으로 생성됨
		 * => n개 만큼의 공간을 생성하면서 인덱스 번호가 0 ~ n-1까지 부여되고
		 * 	각 인덱스에 데이터 값을 저장
		 */
		
		int[] arr = {1,2,3,4,5};
		// 5개의 리터럴 저장 시 5개 데이터 저장 공간만 생성되므로
		// 추가적인 데이터 저장은 불가능함
		
		int[] arr2;
		//arr2 = {1,2,3,4,5}; // 별도로 초기화할 시 사용 불가능
		//	=> new 키워드를 사용하는 방법과 결합하여 문법을 지정해야함
		arr2 = new int[] {1,2,3,4,5}; // 배열 크기는 지정하지 않아야함
		
		String[] strArr = new String[] {"JAVA","JSP","CLOUD"};
		
		int[] a = {1,2,3};
		int[] b = {6,5,4};
		int[] c = {7,8,9};
		
		System.out.println(Arrays.toString(a));		
		a = b;		
		System.out.println(Arrays.toString(a));	
		Arrays.sort(b);		
		System.out.println(Arrays.toString(a));
		b = new int[] {3,2,1};
		Arrays.sort(b);	
		System.out.println(Arrays.toString(a));
		a = b;		
		System.out.println(Arrays.toString(a));	
	}

}
