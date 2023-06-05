import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] rsp = {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위바위 보 게임을 합니다");
		while(true) {
			int random = (int)(Math.random()*3);
			String ai = rsp[random];
			System.out.print("가위 바위 보>>");
			String user = sc.next();
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			if((ai.equals("가위") && user.equals("바위")) 
					|| (ai.equals("바위") && user.equals("보")) 
					|| (ai.equals("보") && user.equals("가위"))) {
				System.out.println("사용자 = " + user + ", 컴퓨터 = " + ai + ", 이겼습니다");
				
			}else if((user.equals("가위") && ai.equals("바위")) 
					|| (user.equals("바위") && ai.equals("보")) 
					|| (user.equals("보") && ai.equals("가위"))) {
				System.out.println("사용자 = " + user + ", 컴퓨터 = " + ai + ", 컴퓨터가 이겼습니다");
			}else {
				System.out.println("사용자 = " + user + ", 컴퓨터 = " + ai + ", 비겼습니다");
			}
		}
	}

}
