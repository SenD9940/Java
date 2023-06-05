import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Main extends JFrame{

	public Main() {
		this.setTitle("0으로 만들기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout(10, 10));
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(1, 3));
		int num = (int)(Math.random()*60) + 1;
		JLabel jl = new JLabel(String.valueOf(num));
		jl.setFont(new Font("Arial", Font.PLAIN, 20));
		jl.setHorizontalAlignment(JLabel.CENTER);
		cp.add(jl, BorderLayout.NORTH);
		JButton[] btns = {new JButton("+2"), new JButton("-1"), new JButton("%4")};
		for(int i = 0; i < 3; i++) {
			btns[i].addActionListener(new Calculator(jl, btns, this));
			jp.add(btns[i]);
		}
		cp.add(jp, BorderLayout.SOUTH);
		this.setSize(300, 300);
		this.setResizable(false);
		this.setLocationRelativeTo(this.getOwner());
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
	}
}

class Calculator implements ActionListener{
	JButton[] btns;
	JLabel label;
	Main main;
	public Calculator(JLabel label, JButton[] btns, Main main) {
		this.label = label;
		this.btns = btns;
		this.main = main;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		main.setTitle("0으로 만들기");
		JButton b = (JButton)e.getSource();
		int result = 0;
		if(b.getText().equals("+2")) {
			result = Integer.parseInt(label.getText()) + 2;
		}else if(b.getText().equals("-1")) {
			result = Integer.parseInt(label.getText()) - 1;
		}else if(b.getText().equals("%4")) {
			result = Integer.parseInt(label.getText()) % 4;
		}
		label.setText(String.valueOf(result));
		b.setEnabled(false);
		if(result == 0) {
			main.setTitle("성공");
			for(int i = 0; i < 3; i++) {
				btns[i].setEnabled(true);
			}
			int num = (int)(Math.random()*60) + 1;
			label.setText(String.valueOf(num));
		}else {
			for(int i = 0; i < 3; i++) {
				if(btns[i].isEnabled()) {
					break;
				}
				if(i == 2 && result != 0) {
					b.setEnabled(false);
					main.setTitle("실패");
				}
			}
		}
	}
}