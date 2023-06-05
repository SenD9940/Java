import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		//아래 코드들 존나 중요하니까 외워라
		this.setTitle("HelloSwing");
		//super("HelloSwing);을 사용할 수도 있다.
		//setTitle()이 더 가독성이 높다.
		this.setSize(1280, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//종료 버튼을 누르면 프로그램 완전 종료.
		this.setResizable(false);
		//false를 할경우 창 크기를 조정하지 못하게 한다.
		this.setLocationRelativeTo(this.getOwner());
		//스크린의 정중앙에 윈도우를 배치한다
		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.setBackground(Color.DARK_GRAY);
		cp.add(new JButton("OK"));
		cp.add(new JButton("Cancel"));
		cp.add(new JButton("Ignore"));
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame myframe = new MyFrame();
	}
}
