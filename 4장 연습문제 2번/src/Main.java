import java.util.*;

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
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Phone[] phones = new Phone[2];
		for(int i = 0; i < 2; i++) {
			System.out.print("이름과 전화번호 입력>> ");
			phones[i] = new Phone(sc.next(), sc.next());
		}
		for(int i = 0; i < 2; i++) {
			System.out.println(phones[i].getName() + "의 번호 " + phones[i].getTel());
		}
	}

}
