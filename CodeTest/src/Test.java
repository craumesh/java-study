import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] numArr = {8, 5, 4, 5, 12, 4};
//		ArrayList<Integer> arrayList = new ArrayList<>();
//		
//		Arrays.sort(numArr);
//		for(int i = 0; i < numArr.length - 1; i++) {
//			if(numArr[i] != numArr[i + 1]) {
//				arrayList.add(numArr[i]);
//			}
//		}
//	    arrayList.add(numArr[numArr.length - 1]);
//		String result = arrayList.toString();
//		System.out.println(result);
		
		
		int[][] score = {{1,2},{3,5},{4,6}};		
		copyAndSum(score);
		
//		int[] numbers = {9,1,4,7,5,3,8};
//		int targetNumber = 12;
//		
//		printMatchedItem(numbers,targetNumber);
		
//		System.out.println(revert("Hello"));
		
		
		
	}
	
	static void copyAndSum(int[][] score) {
		int[][] result = new int[score.length+1][score[0].length+1];
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];
				result[i][score[i].length] += score[i][j];
				result[score.length][j] += score[i][j];
			}
			result[score.length][score[i].length] += result[i][score[i].length];
		}
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
	
//	static void printMatchedItem(int[] numbers, int targetNumber) {
//		String matchedString = "";
//		for(int i = numbers.length-1; i > 0; i--) {
//			for(int j = 0; j < i; j++) {
//				System.out.println(numbers[i] + " " + numbers[j]);
//				if(numbers[i] + numbers[j] == 12) {
//					matchedString += numbers[i]+"+"+numbers[j]+"\n";
//				}
//			}
//		}
//		
//		System.out.println(matchedString);
//	}
	
//	static String revert(String value) {
//		String revertValue = "";
//		char[] valueArray = null;
//		
//		for(int i = value.length()-1; i >= 0; i--) {
//			revertValue += value.charAt(i);
//		}
//		
//		return revertValue;
//	}
	

}
