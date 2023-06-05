import java.util.Scanner;

public class ArrayAccess {
	final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int[] Array = new int[5];
		System.out.print("숫자 5개를 입력하세요: ");
		for(int i = 0; i < 5; i++) {
			Array[i] = sc.nextInt();
			if(max < Array[i]) {
				max = Array[i];
			}
		}
		System.out.println("최대값은 " + max + "입니다.");
	}

}
