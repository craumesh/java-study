package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 람다식 응용
		 */
		
		String[] str = {"this", "is", "java", "world"};
		
		System.out.println(Arrays.toString(str));
		
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		
		/*
		 * 새로운 정렬기능을 만들려면?
		 * => 내부적으로 Comparator 의 compare() 메서드를 사용
		 * 		새로운 정렬 기능을 만들고 Arrays.sort() 에 전달하면 된다
		 * 		=> 자바에서는 함수만 전달할 수 있는 방법이 없다
		 * 			따라서 해당 기능을 가지는 객체를 전달해야 한다
		 * 			일회용으로 정렬 기능을 작성하려면 익명 내부 클래스 활용한다
		 */
		
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// -1을 곱해서 내림차순으로 정렬한다
				return o1.compareTo(o2) * -1;
			}
		});
		
		// 내림차순 정렬 후 :
		System.out.println(Arrays.toString(str));
		
		/*
		 * - 결국 정렬을 위해 필요했던 기능은 Comparator 가 아니라
		 * 	사실 compare() 라는 메서드이다
		 * - compare() 만 있으면 되지만, 자바언어의 특성으로 인해
		 * 	익명 내부클래스를 만들어 객체화해서 전달하고 있다
		 * - 이런 번거로움을 람다식으로 해결할 수 있다
		 */
		
		System.out.println("-----------------------------------------------------");
		
		// 표현방법1
		Arrays.sort(str, (o1, o2) -> {
				return o1.compareTo(o2) * -1;			
		});
		System.out.println(Arrays.toString(str));
		
		// 표현방법2
		Arrays.sort(str, (o1, o2) -> o1.compareTo(o2) * -1);
		System.out.println(Arrays.toString(str));
	}
}
