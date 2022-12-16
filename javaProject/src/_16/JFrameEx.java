package _16;
//팝업창 띄우기
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class JFrameEx extends JFrame{
	public JFrameEx() {
		super("jframe");
		setSize(400, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JFrameEx();
		
		
		
	}

}
