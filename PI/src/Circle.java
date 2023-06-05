import java.util.Scanner;

public class Circle {
	final static double PI = 3.141592;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요: ");
		double rad = sc.nextDouble();
		double result = rad * rad * PI;
		System.out.println("원의 면적: " + result);
	}
}
