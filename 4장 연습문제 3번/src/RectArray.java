import java.util.Scanner;

class Rect{
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getArea() {
		return width * height;
	}
}
public class RectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Rect[] rects = new Rect[4];
		for(int i = 0; i < 4; i++) {
			System.out.print((i + 1) + " 너비와 높이>> ");
			rects[i] = new Rect(sc.nextInt(), sc.nextInt());
		}
		System.out.println("저장하였습니다...");
		int sum = 0;
		for(int i = 0; i < 4; i++) {
			sum += rects[i].getArea();
		}
		System.out.println("사각형 전체의 합은 " + sum);
	}

}
