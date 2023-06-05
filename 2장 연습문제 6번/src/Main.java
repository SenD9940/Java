import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("커피 주문하세요>>");
		String coffee = sc.next();
		int count = sc.nextInt();
		switch(coffee) {
		case "에스프레소":
			System.out.println(2000*count + "원입니다.");
			break;
		case "아메리카노":
			System.out.println(2500*count + "원입니다.");
			break;
		case "카푸치노":
			System.out.println(3000*count + "원입니다.");
			break;
		case "카페라떼":
			System.out.println(2000*count + "원입니다.");
			break;
		}
	}

}
