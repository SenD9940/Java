
public class Circle {
	private double radius;
	public Circle() {
		this.radius = 0.0;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	public double getArea() {
		return this.radius * this.radius * 3.141592;
	}
}
