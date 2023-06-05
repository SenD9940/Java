import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("식을 입력하세요>>");
		double op1 = sc.nextDouble();
		String operator = sc.next();
		double op2 = sc.nextDouble();
		double result = 0;
		switch(operator) {
		case "+":
			result = op1 + op2;
			break;
		case "-":
			result = op1 - op2;
			break;
		case "*":
			result = op1 * op2;
			break;
		case "/":
			if(op2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			result = op1 / op2;
			break;
		default:
			System.out.println("연산 기호가 잘못되었습니다.");
			return;
		}
		System.out.println("연산결과: " + result);

	}

}
