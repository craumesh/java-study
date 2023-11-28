package absract_;

public class Test1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vc = new ElectricCar();
		vc.setCurX(50);
		vc.setCurY(100);
		vc.reportPosition();
		vc.addFuel();
		
		
		vc = new DieselCar();
		vc.setCurY(150);
		vc.reportPosition();
		vc.addFuel();
	}

}

abstract class Vehicle {
	private int curX;
	private int curY;	

	public void setCurX(int curX) {
		this.curX = curX;
	}

	public void setCurY(int curY) {
		this.curY = curY;
	}

	public void reportPosition() {
		System.out.println("현재 위치 : " + curX + ", " + curY);
	}
	
	public abstract void addFuel();
	
}

class ElectricCar extends Vehicle {
	public void addFuel() {
		System.out.println("전기차 충전소에서 배터리 충전!");
	}
}

class DieselCar extends Vehicle {
	public void addFuel() {
		System.out.println("주유소에서 디젤 연료 공급!");
	}
}