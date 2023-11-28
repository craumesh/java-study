package inheritance;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 상속의 장점
		 * 1. 코드 재사용성이 증가
		 * 2. 코드의 유지보수성이 용이해짐
		 * 
		 */
		Point3D p = Point3D.getInstance();
		p.print3D();		
	}

}


// 2차원 좌표를 관리하는 Point2D 클래스
class Point2D {
	int x = 10; // x좌표
	int y = 20;	// y좌표
	
	public void print2D() {
		System.out.println("x좌표 = " + x + ", y좌표 = " + y);
		// 슈퍼클래스의 메서드를 수정하면
		// 서브클래스인 Print3D 클래스에서 수정 내용에 대한 적용을 받을 수 있음
	}
}

// 3차원 좌표를 관리하는 Point3D 클래스
class Point3D extends Point2D {
	int z = 30;
	
	private Point3D() {}
	
	private static class LazyHolder {
		public static final Point3D instance = new Point3D(); 
	}
	
	public static Point3D getInstance() {
		return LazyHolder.instance;
	}	
	
	public void print3D() {
		print2D();
		System.out.println("x좌표 = " + x + ", y좌표 = " + y + ", z좌표 = " + z);
	}
}