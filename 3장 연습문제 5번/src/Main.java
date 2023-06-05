import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		System.out.print("정수 10개를 입력>>");
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		for(int i = 0; i < nums.length; i++) {
			for(int k = 0; k < nums.length - 1; k++) {
				if(nums[k] > nums[k + 1]) {
					int temp = nums[k];
					nums[k] = nums[k + 1];
					nums[k + 1] = temp;
				}
			}
		}
		for(int num : nums) {
			System.out.print(num + " ");
		}
	}

}
