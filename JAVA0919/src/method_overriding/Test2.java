package method_overriding;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricCar ec = new ElectricCar();
		ec.speed = 0;
		ec.maxspeed = 240;
		ec.batteryCapacity = 5;
		
		ec.speedUp();
		ec.speedDown();
		ec.addFuel();
		
		DieselCar dc = new DieselCar();
		dc.speed = 0;
		dc.maxspeed = 260;
		dc.cc = 3000;
		
		dc.speedUp();
		dc.speedDown();
		dc.addFuel();
	}

}

class Car {
	int speed;
	int maxspeed;
	
	public void speedUp() {
		System.out.println("자동차 속력 증가!");
	}
	
	public void speedDown() {
		System.out.println("자동차 속력 감소!");
	}
	
	public void addFuel(){
		System.out.println("자동차 연료 충전!");
	}
}

class DieselCar extends Car {
	int cc;
	
	public void speedUp() {
		System.out.println("디젤 엔진의 힘으로 속력 증가!");
	}
	
	public void speedDown() {
		System.out.println("디젤 자동차 속력 감소!");
	}
	
	public void addFuel(){
		System.out.println("주유소에서 디젤 연료 주입!");
	}
}

class ElectricCar extends Car {
	int batteryCapacity;
	
	public void speedUp() {
		System.out.println("ElectricCar 전기모터의 힘으로 속력 증가!");
	}
	
	public void speedDown() {
		System.out.println("ElectricCar 속력 감소하면서 전기배터리 충전!");
	}
	
	public void addFuel(){
		System.out.println("전기차 충전소에서 배터리 충전!");
	}
}