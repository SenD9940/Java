import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		this.setTitle("Listener");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.initLayout();
		this.setSize(300, 150);
		this.setResizable(false);
		this.setLocationRelativeTo(this.getOwner());
		this.setVisible(true);
	}
	
	public void initLayout() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		//내부 클래스
		//class MyListener implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			JButton b = (JButton)e.getSource();
//			if(b.getText().equals("Action")) {
//				b.setText("액션");
//			}else {
//				b.setText("Action");
//			}
//		}
	//}
		
		//익명 클래스
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action")) {
					b.setText("액션");
				}else {
					b.setText("Action");
				}
			}
		});
		cp.add(btn);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame myApp = new MyFrame();
	}

}


//외부 클래스
//class MyListener implements ActionListener{
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		JButton b = (JButton)e.getSource();
//		if(b.getText().equals("Action")) {
//			b.setText("액션");
//		}else {
//			b.setText("Action");
//		}
//	}
//}
