import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요>>");
		try {
			int num = sc.nextInt();
			if(num % 2 == 0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}catch(Exception e) {
			System.out.println("정수를 입력하지 않아 프로그램을 종료 합니다");
		}finally {
			sc.close();
		}
	}

}
