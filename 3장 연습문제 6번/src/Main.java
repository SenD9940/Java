import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] eng = {"student", "love", "java", "happy", "future"};
		String[] kor = {"학생", "사랑", "자바", "행복", "미래"};
		while(true) {
			System.out.print("영어 단어를 입력하세요>>");
			String search = sc.next();
			if(search.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			for(int i = 0; i < eng.length; i++) {
				if(eng[i].equals(search)) {
					System.out.println(kor[i]);
					break;
				}else if(i == eng.length - 1) {
					System.out.println("그런 영어 단어가 없습니다");
				}
			}
		}
	}

}
