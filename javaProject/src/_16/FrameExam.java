package _16;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//AWT:Java,C 개발 (점차 없어지는 추세)
//Swing : AWT를 향상시킨 버전, 자바로만 개발.
public class FrameExam {

	public static void main(String[] args) {
		Frame f = new Frame("프레임 테스트"); //윈도우창 생성
		f.setSize(300,400); //프레임 사이즈
		f.setVisible(true); //꼭 해줘야함.false하면 숨김상태가 된다.
		//		f.addWindowListener(new WindowListener() { //익명클래스로 이벤트 핸들러
		//			
		//			@Override
		//			public void windowOpened(WindowEvent e) {
		//				// TODO Auto-generated method stub
		//				
		//			}
		//			
		//			@Override
		//			public void windowIconified(WindowEvent e) {
		//				// TODO Auto-generated method stub
		//				
		//			}
		//			
		//			@Override
		//			public void windowDeiconified(WindowEvent e) {
		//				// TODO Auto-generated method stub
		//				
		//			}
		//			
		//			@Override
		//			public void windowDeactivated(WindowEvent e) {
		//				// TODO Auto-generated method stub
		//				
		//			}
		//			
		//			@Override
		//			public void windowClosing(WindowEvent e) {
		//				//프로그램 종료 처리
		//				//정상종료 : 0  , 비정상종료 : -1
		//				System.exit(0);
		//				
		//			}
		//			
		//			@Override
		//			public void windowClosed(WindowEvent e) {
		//				// TODO Auto-generated method stub
		//				
		//			}
		//			
		//			@Override
		//			public void windowActivated(WindowEvent e) {
		//				// TODO Auto-generated method stub
		//				
		//			}
		//		}); //익명클래스

		//adapter를 사용하면 코드가 간략해진다.
		f.addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent e) {};
			System.exit(0);
		}
				);
	}

}
