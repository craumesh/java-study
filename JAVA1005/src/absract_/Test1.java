package absract_;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyer f = new SuperMan();
		f.takeOff();
		f.fly();
		f.land();
		
		f = new Bird();
		f.takeOff();
		f.fly();
		f.land();
		
		f = new AirPlane();
		f.takeOff();
		f.fly();
		f.land();
	}

}

abstract class Flyer {
	public abstract void takeOff();
	public abstract void fly();
	public abstract void land();
}

class SuperMan extends Flyer {
	public void takeOff() {
		System.out.println("슈퍼맨 이륙!");
	}
	public void fly() {
		System.out.println("슈퍼맨 비행중!");
	}
	public void land() {
		System.out.println("슈퍼맨 착륙!");
	}
}

class Bird extends Flyer {
	public void takeOff() {
		System.out.println("새 이륙!");
	}
	public void fly() {
		System.out.println("새 비행중!");
	}
	public void land() {
		System.out.println("새 착륙!");
	}
}

class AirPlane extends Flyer {
	public void takeOff() {
		System.out.println("비행기 이륙!");
	}
	public void fly() {
		System.out.println("비행기 비행중!");
	}
	public void land() {
		System.out.println("비행기 착륙!");
	}
}