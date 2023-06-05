import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("논리 연산을 입력하세요>>");
		boolean a = sc.nextBoolean();
		String op = sc.next();
		boolean b = sc.nextBoolean();
		switch(op) {
		case "OR":
			System.out.println(a | b);
			break;
		case "AND":
			System.out.println(a & b);
		}
	}

}
