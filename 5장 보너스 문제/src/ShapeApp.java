interface Shape{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("--- 다시 그립니다. ---");
		draw();
	}
}

class Circle implements Shape{
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.print("반지름 " + this.radius + " ");
	}
	public double getArea() {
		return PI * radius * radius;
	}
}

public class ShapeApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape coin = new Circle(10);
		coin.redraw();
		System.out.println("코인의 면적은 " + coin.getArea());
	}

}
