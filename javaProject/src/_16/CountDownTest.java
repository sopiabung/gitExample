package _16;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame{

	private JLabel label;
	class MyThread extends Thread {//중첩클래스
		@Override
		public void run() {
			for(int i=0; i>=0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();				
				}
				label.setText(i+"");
			}
		}
	}//중첩클래스 끌

public CountDownTest() {
	setTitle("카운트다운");
	setSize(300, 200);//프레임 사이즈 설정
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 닫기처리
	
	label = new JLabel ("Start");
	label.setFont(new Font("Serif", Font.BOLD, 1002));
	
}
}
