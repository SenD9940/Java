import java.util.Scanner;

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

class Circle extends Shape{
	public Circle() {
		super("Circle");
	}
}

class Rect extends Shape{
	public Rect() {
		super("Rect");
	}
}

class GraphicEditor{
	private Shape[] shapes;
	private int length;
	public GraphicEditor(){
		this.shapes = new Shape[10];
		this.length = 0;
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
		shapes[length++] = s;
	}
	public void delete(int index) {
		if(length() < index) {
			System.out.println("삭제할 수 없습니다");
			return;
		}
		for(int i = index -1; i < shapes.length; i++) {
			//해당 위치의 도형을 삭제하고 한칸씩 앞으로 옮김
			if(shapes[i] == null) {
				length = i - 1;
				shapes[length] = null;
				break;
			}
			shapes[i] = shapes[i + 1];
		}
	}
	public void showAll() {
		for(int i = 0; i < length(); i++) {
			System.out.println(shapes[i].getName());
		}
	}
	public int length() {
		return length;
	}
}

public class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
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