import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("커피 주문하세요>>");
		String coffee = sc.next();
		int amount = sc.nextInt();
		//if 문을 활용한 경우
		int price = 0;
		if(coffee.equals("에스프레소")) {
			price = 2000 * amount;
		}else if(coffee.equals("아메리카노")) {
			price = 2000 * amount;
		}else if(coffee.equals("카푸치노")) {
			price = 3000 * amount;
		}else if(coffee.equals("카페라떼")) {
			price = 3500 * amount;
		}
		System.out.println(price + "원 입니다");
		
		
		//switch문을 사용한 경우
		switch(coffee) {
		case "에스프레소":
			price = 2000 * amount;
			break;
		case "아메리카노":
			price = 2000 * amount;
			break;
		case "카푸치노":
			price = 3000 * amount;
			break;
		case "카페라떼":
			price = 3500 * amount;
			break;
		}
		System.out.println(price + "원 입니다");
		
	}

}
