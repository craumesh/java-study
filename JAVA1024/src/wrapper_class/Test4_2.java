package wrapper_class;

public class Test4_2 {

	public static void main(String[] args) {
		String pass = "aDmin123!";
		PassValidation.passCheck(pass);
	}

}

class PassValidation{
	public static void passCheck(String str) {
		char[] chArr = str.toCharArray();
		boolean[] isboolArr = new boolean[4];
		int validPoint = 0;
		for(char ch: chArr) {
			if(validPoint >= 4) {
				break;
			}
			
			if(Character.isUpperCase(ch)) {
				if(!isboolArr[0])	{
					validPoint++;
					isboolArr[0] = true;
					continue;
				}
			} else if(Character.isLowerCase(ch)) {
				if(!isboolArr[1])	{
					validPoint++;
					isboolArr[1] = true;
					continue;
				}
			} else if(Character.isDigit(ch)) {
				if(!isboolArr[2])	{
					validPoint++;
					isboolArr[2] = true;
					continue;
				}
			} else {
				if(!isboolArr[3])	{
					validPoint++;
					isboolArr[3] = true;
				}
			}
		}
		System.out.println("입력된 패스워드 : " + String.valueOf(chArr));
		passValid(validPoint);
	}
	
	public static void passValid(int point) {
		System.out.print("패스워드 안전도 : ");
		switch(point) {
		case 1: System.out.println("사용불가 |"); break;
		case 2: System.out.println("위험 ||"); break;
		case 3: System.out.println("보통 |||"); break;
		case 4: System.out.println("강함 ||||"); break;
		default: System.out.println("Error!");
		}
	}
}