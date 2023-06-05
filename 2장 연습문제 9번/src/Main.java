import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하세요>>");
		int num = sc.nextInt();
		int first = num / 10;
		int second = num % 10;
		boolean isClap = false;
		System.out.print("박수");
		if(num > 10 && first % 3 == 0) {
			System.out.print("짝");
			isClap = true;
		}
		if(second % 3 == 0) {
			System.out.print("짝");
			isClap = true;
		}
		if(!isClap) {
			System.out.print("없음");
		}
	}

}
