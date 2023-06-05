import java.util.Scanner;

interface StackInterface{
	int length();
	String pop();
	boolean push(String ob);
}

class StringStack implements StackInterface{
	private String[] str = new String[5];
	private int count = 0;
	public int length() {
		return count;
	}
	public String pop() {
		return str[--count];
	}
	public boolean push(String pb) {
		str[count++] = pb;
		return true;
	}
}

public class StackManager{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringStack ss = new StringStack();
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		for(int i = 0; i < 5; i++) {
			ss.push(sc.next());
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(ss.pop() + " ");
		}
	}

}
