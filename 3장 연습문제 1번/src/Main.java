import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 한문자를 입력하세요>>");
		char c = sc.next().charAt(0);
		for(char i = c; i >= 'a'; i--) {
			for(char k = 'a'; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
	}

}
