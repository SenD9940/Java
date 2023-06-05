import java.util.Scanner;

class Phone{
	private String name, tel;
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}

public class PhoneManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수>> ");
		int length = sc.nextInt();
		Phone[] phones = new Phone[length];
		for(int i = 0; i < length; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>> ");
			phones[i] = new Phone(sc.next(), sc.next());
		}
		System.out.println("저장되었습니다...");
		while(true) {
			System.out.print("검색할 이름>> ");
			String search = sc.next();
			if(search.equals("exit")) {
				break;
			}
			for(int i = 0; i < length; i++) {
				if(phones[i].getName().equals(search)) {
					System.out.println(phones[i].getName() + "의 전화번호는 " + phones[i].getTel() + " 입니다.");
					break;
				}else if(i == length - 1) {
					System.out.println(search + "이 없습니다.");
				}
			}	
		}
		System.out.println("프로그램을 종료합니다...");
	}
}
