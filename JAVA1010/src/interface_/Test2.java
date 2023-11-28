package interface_;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BumbleBee bb = new BumbleBee();
		bb.fight();
		bb.transform(BumbleBee.MODE_AIRPLANE);
		bb.transform(BumbleBee.MODE_CAR);
		bb.transform(BumbleBee.MODE_NORMAL);
		bb.speak();
	}

}

interface Fightable {
	void fight();
}
interface Transformable {
	int MODE_CAR = 1;
	int MODE_AIRPLANE = 2;
	int MODE_NORMAL = 3;
	void transform(int mode);
}

interface Robot extends Fightable, Transformable {
	void speak();
}

class BumbleBee implements Robot  {

	@Override
	public void speak() {
		System.out.println("라디오로 말하기");
	}

	@Override
	public void transform(int mode) {
		switch(mode) {
		case MODE_CAR:System.out.println("자동차로 변신"); break;
		case MODE_AIRPLANE:System.out.println("비행기로 변신"); break;
		case MODE_NORMAL:System.out.println("기본 모드(로봇)로 변신"); break;
		}
	}

	@Override
	public void fight() {
		System.out.println("로켓 발사");
	}
	
}