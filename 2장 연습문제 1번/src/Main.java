import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수를 입력하세요>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("%d+%d는 %d", a, b, a+b);
	}
}
