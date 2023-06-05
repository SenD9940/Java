import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Main extends JFrame{
	JTextField input = new JTextField(10);
	JTextField result = new JTextField(10);
	public Main() {
		this.setTitle("간단한 계산기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout(3, 3));
		cp.add(setHeader(), BorderLayout.NORTH);
		cp.add(setBody(), BorderLayout.CENTER);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setLocationRelativeTo(this.getOwner());
		this.setVisible(true);
	}
	
	private JPanel setHeader() {
		JPanel header = new JPanel();
		header.setBackground(Color.GRAY);
		JLabel inputLabel = new JLabel("수식");
		JLabel resultLabel = new JLabel("결과");
		header.add(inputLabel);
		header.add(input);
		header.add(resultLabel);
		header.add(result);
		return header;
	}
	
	private JPanel setBody() {
		JPanel body = new JPanel();
		body.setLayout(new GridLayout(4, 4, 5, 5));
		for(int i = 0; i < 10; i ++) {
			String name = String.valueOf(i);
			JButton btnNum = new JButton(name);
			btnNum.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String text = input.getText();
					if(text.length() == 0 && !btnNum.getText().equals("0")) {
						input.setText(input.getText() + name);
					}else if(text.length() != 0){
						input.setText(input.getText() + name);
					}
				}
			});
			body.add(btnNum);
		}
		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText("");
				result.setText("");
			}
		});
		body.add(btnCE);
		JButton btnCalc = new JButton("계산");
		btnCalc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(String.format("%.1f", calc()));
			}
		});
		body.add(btnCalc);
		final String[] name = {"+", "-", "*", "/"};
		for(int i = 0; i < name.length; i++) {
			JButton operator = new JButton(name[i]);
			operator.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton op = (JButton)e.getSource();
					String text = input.getText();
					if(text.length() != 0) {
						input.setText(text + op.getText());
					}
				}
			});
			//맥에서 작동이 안되는 이유를 모르겠습니다
			operator.setBackground(Color.CYAN);
			operator.setOpaque(true);
			body.add(operator);
		}
		return body;
	}
	
	public double calc() {
		String form = input.getText();
		String operand1 = "";
		String operand2 = "";
		char operator = 0;
		for(int i = 0; i < form.length(); i++) {
			char c = form.charAt(i);
			if(c == '+' || c == '-' || c == '*' || c == '/') {
				operator = c;
				continue;
			}
			if(operator == 0) {
				operand1 += c;
			}else {
				operand2 += c;
			}
		}
		double result = 0;
		int op1 = Integer.parseInt(operand1);
		int op2 = 0;
		if(!operand2.equals("")) {
			op2 = Integer.parseInt(operand2);	
		}
		if(operator == '+') {
			result =  op1 + op2;
		}else if(operator == '-') {
			result =  op1 - op2;
		}else if(operator == '*') {
			result =  op1 * op2;
		}else if(operator == '/') {
			result =  (double)op1 / (double)op2;
		}else {
			result = op1;
		}
		return result;
	}

	public static void main(String[] args) {
		Main main = new Main();

	}
}