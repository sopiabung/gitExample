package other_homework;
//지현코드
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyGridLayout extends JFrame {
	public MyGridLayout() {
		super("그리드과제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 1));
		
		c.add(new JLabel("ID : "));
		c.add(new JTextField("hong"));
		c.add(new JLabel("비밀번호 : "));
		c.add(new JPasswordField(20));
		c.add(new JLabel("이메일 : "));
		c.add(new JTextField("hong@daum.net", 20));
		c.add(new JLabel("HP : "));
		c.add(new JTextField("010-1234-5678", 20));
		
		
		setSize(400, 200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MyGridLayout();
	}
}
