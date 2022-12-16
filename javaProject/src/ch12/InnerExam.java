package ch12;

import java.awt.Frame;//GUI전용 클래스
//Frame : 윈도우 창을 띄워주는 클래스
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//Frame : 윈도우 창을 띄워주는 클래스
//무명내부클래스를 주로 사용하는 프로그램인 GUI 프로그램
public class InnerExam extends Frame {
	public InnerExam() {//기본생성자
		super("내부 클래스 테스트");//부모생성자호출겸 제목처리
		setSize(600, 800);//프레임의 기본 가로,세로 초기사이즈 설정
		setVisible(true);//프레임을 화면에 표시
	}
	public static void main(String[] args) {
		InnerExam e = new InnerExam();
		e.addWindowListener(new WindowListener() {//무명 내부 클래스, new Win + Ctrl + Spacebar 자동완성
			@Override
			public void windowOpened(WindowEvent e) {
			}
			@Override
			public void windowIconified(WindowEvent e) {
			}
			@Override
			public void windowDeiconified(WindowEvent e) {
			}
			@Override
			public void windowDeactivated(WindowEvent e) {
			}
			@Override //윈도우창이 닫힐 때 자동호출([x] 버튼을 누를 때)
			public void windowClosing(WindowEvent e) {//이벤트 핸들러(처리기)
				System.exit(0);//프로그램 종료
			}
			
//			[이벤트 처리]
//			사용자의 요청(request)에 시스템이 응답 (response)
//
//			이벤트 3대요소
//			- 이벤트 소스 : 이벤트의 대상
//			- 이벤트 리스너 : 이벤트 관찰자,감시자
//			- 이벤트 핸들러 : 이벤트 처리기
			
			@Override
			public void windowClosed(WindowEvent e) {
			}
			@Override
			public void windowActivated(WindowEvent e) {
			}
		});//end 무명내부클래스
	}
}
