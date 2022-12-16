package _homework;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//GridLayout
//-----------------------------------
//id       :      hong
//비밀번호   :      ****
//이메일    :      hong@daum.net
//HP       :      010-1234-5678
//-----------------------------------
public class MyGridLayout extends JFrame{
	public MyGridLayout() {
		super("GridLayout 과제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,1));
		
		c.add(new JLabel("ID"));//필드 앞 라벨이름
		c.add(new JTextField("hong"));
		c.add(new JLabel("PW"));
		c.add(new JPasswordField("****"));
		c.add(new JLabel("E-mail"));
		c.add(new JTextField("hong@daum.net"));
		c.add(new JLabel("HP"));
		c.add(new JTextField("010-1234-5678"));
		
		setVisible(true);
		setSize(250,200);
	}
	public static void main(String[] args) {
		new MyGridLayout();
	}
}
