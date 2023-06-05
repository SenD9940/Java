import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		System.out.print("정수 10개를 입력하세요>>");
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		for(int num : nums) {
			if(num % 3 == 0) {
				System.out.print(num + " ");
			}
		}
	}

}
