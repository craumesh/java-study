package variable_arguments;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableArgumentsTest vat = new VariableArgumentsTest();
		vat.print();
		vat.print(1,2,3,9,7,6,5,4);
	}

}

class VariableArgumentsTest{
	public void print() {
		System.out.println("전달 받은 정수 없음!");
	}
	public void print(int...nums) {		
		System.out.println(Arrays.toString(nums));
	}
}