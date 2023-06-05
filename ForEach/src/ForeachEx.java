import java.util.Scanner;

public class ForeachEx {
	final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("입력할 데이터의 수를 입력하세요: ");
		int n = sc.nextInt();
		int sum = 0;
		int[] nums = new int[n];
		System.out.print("숫자를 5개 입력하세요: ");
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		for(int k : nums) {
			sum += k;
			System.out.print(k + " ");
		}
		System.out.println("의 합은 " + sum + "입니다");
		String[] friut = new String[n];
		System.out.print("문자열을 5개 입력하세요: ");
		for(int i = 0; i < n; i++) {
			friut[i] = sc.next();
		}
		for(String f : friut) {
			System.out.print(f + " ");
		}
	}

}
