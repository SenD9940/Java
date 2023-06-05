
public class CircleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(3);
		System.out.println("Circle Area = " + c.getArea());
		Circle c2 = new Circle();
		System.out.println("Circle Area = " + c2.getArea());
		Circle c3 = new Circle();
		c3.setRadius(12.123);
		System.out.println("Circle Area = " + c3.getArea());
	}

}
