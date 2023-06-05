import java.util.Scanner;

public class MyStack {
	final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("데이터의 사이즈를 입력하세요: ");
		int length = sc.nextInt();
		Gstack<String> gst = new Gstack<String>(length);
		gst.push("hello");
		gst.push("world");
		System.out.println(gst.pop());
		System.out.println(gst.pop());
	}
}
