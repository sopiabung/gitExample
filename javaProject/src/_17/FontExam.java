package _17;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JApplet;

public class FontExam extends JApplet{

	private Font font;
	private FontMetrics fm; //글꼴관련 정보를 제공하는 클래스
	private int x,y;
	private String massege;
	private Dimension dim; //특정영역의 사각형의 폭과 높이값을 관리할 수 있도록 도와주는 클래스.

	@Override
	public void init() {
		massege = "그래픽 테스트";
		font = new Font("굴림", Font.ITALIC, 30);
		//new Font("폰트", 옵션, 사이즈)

		fm = getFontMetrics(font);//폰트의 가로,세로 사이즈를 가져옴.
		setSize(500, 500);//애플릿 사이즈 설정

		dim = getSize(); //화면크기를 계산해서 Dimension에 저장.
		//글자가 화면 크기에 맞게 중앙에 위치하고자 하는 처리.

		System.out.println(dim.width);//현재화면의 가로사이즈
		System.out.println(dim.height);//현재화면의 가로사이즈

		x=(dim.width/2)-(fm.stringWidth(massege)/2);//폰트의 가로길이값 처리용
		y=(dim.height/2)-(fm.getDescent()/2);//폰트의 세로길이값 처리용
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setFont(font);//폰트 설정
		//문자열 출력
		g.drawString(massege, x, y);
	}	
}
