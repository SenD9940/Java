import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] day = {'일', '월', '화', '수', '목', '금', '토'};
		while(true) {
			int num = 0;
			System.out.print("정수를 입력하세요>>");
			try {
				num = sc.nextInt();
				System.out.println(day[num % day.length]);
			}catch(InputMismatchException e) {
				System.out.println("경고! 수를 입력해 주세요");
				sc.next();
			}finally {
				if(num == -1) {
					System.out.println("프로그램을 종료 합니다.");
					break;
				}
			}
		}
	}
}
