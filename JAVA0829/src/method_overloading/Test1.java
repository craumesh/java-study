package method_overloading;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print p = new Print();
		p.print(5);
		p.print(5.5);
		p.print("5.5");
		
		System.out.println("");
		
		Calculator c = new Calculator();
		c.calc("-", 2, 4);
		c.calc("*", 2, 4, 6);
		c.calc("+", 2, 4, 6, 8);
	}
}

class Print {
	
//	public void play(Object data) {
//		print(data);
//	}
	public void print(int data) {
		System.out.println("정수 출력! : " + data);
	}
	public void print(double data) {
		System.out.println("실수 출력! : " + data);
	}
	public void print(String data) {
		System.out.println("문자열 출력! : " + data);
	}
}

class Calculator {
	private int operResult = 0;
	
	public void calc(String oper, int num1, int num2) {
		switch(oper) {
		case "+": operResult = num1 + num2; break;
		case "-": operResult = num1 - num2; break;
		case "*": operResult = num1 * num2; break;
		case "/": operResult = num1 / num2; break;
		case "%": operResult = num1 % num2; break;
		}
		System.out.print("num1 " + oper + " num2 = " + operResult + "\n");
	}
	public void calc(String oper, int num1, int num2, int num3) {
		switch(oper) {
		case "+": operResult = num1 + num2 + num3; break;
		case "-": operResult = num1 - num2 - num3; break;
		case "*": operResult = num1 * num2 * num3; break;
		case "/": operResult = num1 / num2 / num3; break;
		case "%": operResult = num1 % num2 % num3; break;
		}
		System.out.print("num1 " + oper + " num2 " + oper + " num3 = " + operResult + "\n");
	}
	public void calc(String oper, int num1, int num2, int num3, int num4) {
		System.out.print("num1 ");
		switch(oper) {
		case "+": operResult = num1 + num2 + num3 + num4; break;
		case "-": operResult = num1 - num2 - num3 - num4; break;
		case "*": operResult = num1 * num2 * num3 * num4; break;
		case "/": operResult = num1 / num2 / num3 / num4; break;
		case "%": operResult = num1 % num2 % num3 % num4; break;
		}
		System.out.print("num1 " + oper + " num2 " + oper + " num3 " + oper + " num4 = " + operResult + "\n");
	}
}