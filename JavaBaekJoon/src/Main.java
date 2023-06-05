import java.util.*;

class Shape{
	private String name;
	public Shape(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}

class Line extends Shape{
	public Line() {
		super("Line");
	}
}
class Rect extends Shape{
	public Rect() {
		super("Rect");
	}
}
class Circle extends Shape{
	public Circle() {
		super("Circle");
	}
}

class GraphicEditor{
	private Shape[] shapes;
	private int idx;
	public GraphicEditor() {
		shapes = new Shape[10];
		idx = 0;
	}
	public Shape selectShape(Scanner sc) {
		System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>>");
		int select_shape = sc.nextInt();
		switch(select_shape) {
		case 1:
			return new Line();
		case 2:
			return new Rect();
		case 3:
			return new Circle();
		default:
			return null;
		}
	}
	public void insert(Shape s) {
		shapes[idx++] = s;
	}
	public void delete(int position) {
		shapes[position - 1] = null;
		for(int i = position; i < shapes.length; i++) {
			if(shapes[i] == null) {
				shapes[i - 1] = null;
				idx = i - 1;
				break;
			}
			shapes[i - 1] = shapes[i];
		}
	}
	public void showAll() {
		for(int i = 0; i < idx; i++) {
			System.out.println(shapes[i].getName());
		}
	}
	public int length() {
		return idx;
	}
}


public class Main {
	final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor();
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				ge.insert(ge.selectShape(sc));
				break;
			case 2:
				System.out.print("삭제할 도형의 위치>>");
				ge.delete(sc.nextInt());
				break;
			case 3:
				ge.showAll();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다...");
				return;
			}
		}
	}
}
