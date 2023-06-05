import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyFrame extends JFrame{
	GamePanel gp = new GamePanel();
	public MyFrame() {
		this.setTitle("몬스터 게임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(gp);
		this.setSize(500, 500);
		this.setVisible(true);
		gp.setRequestFocusEnabled(true);
		gp.requestFocus();
	}
	
	class GamePanel extends JPanel{
		JLabel avatar;
		JLabel monster;
		public GamePanel() {
			this.setLayout(null);
			avatar = new JLabel();
			avatar.setText("A");
			avatar.setBounds(50, 50, 15, 15);
			avatar.setForeground(Color.RED);
			this.add(avatar);
			monster = new JLabel();
			monster.setBounds(200, 5, 15, 15);
			monster.setForeground(Color.BLUE);
			monster.setText("M");
			this.add(monster);
			this.requestFocus();
			this.addKeyListener(new GameKeyListener(avatar));
			MonsterThread th = new MonsterThread(monster, avatar);
			th.start();
		
		}
	}
	
	class GameKeyListener extends KeyAdapter{
		final int AVATAR_MOVE = 10;
		JLabel avatar;
		public GameKeyListener(JLabel avatar) {
			this.avatar = avatar;
		}
		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar() == 'q') {
				System.exit(0);
			}
			switch(e.getKeyCode()) {
			case KeyEvent.VK_UP:
				avatar.setLocation(avatar.getX(), avatar.getY() - AVATAR_MOVE);
				break;
			case KeyEvent.VK_DOWN:
				avatar.setLocation(avatar.getX(), avatar.getY() + AVATAR_MOVE);
				break;
			case KeyEvent.VK_LEFT:
				avatar.setLocation(avatar.getX() - AVATAR_MOVE, avatar.getY());
				break;
			case KeyEvent.VK_RIGHT:
				avatar.setLocation(avatar.getX() + AVATAR_MOVE, avatar.getY());
				break;
			}
			avatar.getParent().repaint();
		}
	}
	
	class MonsterThread extends Thread{
		final int MONSTER_DELAY = 200;
		final int MONSTER_MOVE = 5;
		JLabel monster;
		JLabel avatar;
		public MonsterThread(JLabel monster, JLabel avatar) {
			this.monster = monster;
			this.avatar = avatar;
		}
		@Override
		public void run() {
			int x = 0;
			int y = 0;
			while(true) {
				int avatarX = avatar.getX();
				int avatarY = avatar.getY();
				int monsterX = monster.getX();
				int monsterY = monster.getY();
				if(avatarX < monsterX) {
					x = monsterX - MONSTER_MOVE;
				}else {
					x = monsterX + MONSTER_MOVE;
				}
				if(avatarY < monsterY) {
					y = monsterY - MONSTER_MOVE;
				}else {
					y = monsterY + MONSTER_MOVE;
				}
				monster.setLocation(x, y);
				
				int xGap = Math.abs(avatarX - monsterX);
				int yGap = Math.abs(avatarY - monsterY);
				if(xGap < 10 && yGap < 10) {
					avatar.setText("DEAD");
					this.interrupt();
				}
				try {
					Thread.sleep(MONSTER_DELAY);
				}catch(InterruptedException e) {
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
