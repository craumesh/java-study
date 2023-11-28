package lambda;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Str str = (x, y) -> x + y ;
		System.out.println(str.link("안녕", "하세요!"));
	}

}

@FunctionalInterface 
interface Str {
	String link(String x, String y);
}