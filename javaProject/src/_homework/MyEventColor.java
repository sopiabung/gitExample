package _homework;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class MyEventColor implements ActionListener{
	//멤버변수
	private JFrame f; //contentPane 자동생성.
	private Color c;
	private Container con;
	
	public MyEventColor(JFrame f, Color c) {
		this.f = f;
		this.c = c;
		con = f.getContentPane();
	}

	//배경색 변경
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);
	}
}
