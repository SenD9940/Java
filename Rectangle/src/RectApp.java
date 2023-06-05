import java.util.*;

public class RectApp {
	final static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("사격형의 너비를 입력하세요: ");
		int width = sc.nextInt();
		System.out.print("사각형의 높이를 입력하세요: ");
		int height = sc.nextInt();
		
		Rectangle rect = new Rectangle();
		rect.setWidth(width);
		rect.setHeight(height);
		rect.setName("rect");
		System.out.println(rect.getName() + "사각형의 면적 = " + rect.getArea());
		
		Rectangle rect1 = new Rectangle(width, height, "rect1"); //생성자에 width, height를 넘겨 주었다.
		System.out.println(rect1.getName() + "사각형의 면적 = " + rect1.getArea());
		
	}

}
