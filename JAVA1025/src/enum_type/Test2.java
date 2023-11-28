package enum_type;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week2 today = Week2.WED;
		
		switch(today) {
		case MON: case TUS: case WED:
		case THU:System.out.println("날 죽이지 못하는 평일은 나를 힘들게 만든다"); break;
		case FRI:System.out.println("불금!"); break;
		case SAT:
		case SUN:System.out.println("주말!"); break;
		}
	}
}

enum Week2 {
	MON,TUS,WED,THU,FRI,SAT,SUN
}