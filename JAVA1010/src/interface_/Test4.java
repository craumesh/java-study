package interface_;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Photoshop p = new Photoshop();
		
		Circle c = new Circle();
		c.setRadius(50);
		p.draw(c);
		
		Rectangle r = new Rectangle();
		r.setHeight(10);
		r.setWidth(30);
		p.draw(r);
	}

}

interface Shape {
	void draw();
}

class Circle implements Shape {
	private double radius;	
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("원 그리기 반지름 : " + radius);
	}
}

class Rectangle implements Shape {
	private double width;
	private double height;
	
	public void setWidth(double width) {
		this.width = width;
	}


	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형 그리기 가로 : " + width + ", 세로 : " + height);
	}
}

class Photoshop {
	public void draw(Shape shape) {
		shape.draw();
	}	
}