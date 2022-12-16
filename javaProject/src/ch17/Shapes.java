package ch17;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

public class Shapes extends JApplet {
	
	@Override
	public void init() {//반드시 초기화
		setSize(500, 500);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2=(Graphics2D)g;
		
		//setColor()를 안쓰면 검정색이 기본
		g2.setStroke(new BasicStroke(5));//선굵기 조절
		g.drawLine(10, 10, 200, 10);
		
		g.setColor(Color.YELLOW);
		g2.setStroke(new BasicStroke(1));
		g.drawRect(120, 40, 90, 50);
		
		g.setColor(Color.CYAN);
		g.fillRect(120, 140, 90, 50);
		
		g.setColor(Color.RED);
		//fillRoundRect(x, y, w, h, 가로라운드길이, 세로라운드길이)
		g.fillRoundRect(120, 240, 90, 50, 30, 30);
		
		g.setColor(Color.BLUE);
		g.drawOval(0, 40, 90, 55);//타원 그리기
		
		g.setColor(Color.PINK);
		g.fillOval(0, 140, 90, 55);
		
		int[] x= {10, 30, 50, 40, 20};
		int[] y= {257, 240, 257, 280, 280};
		//fillPolygon(x[], y[], 꼭지점의 수)
		g.fillPolygon(x, y, x.length);//다각형 그리기
		
	}

}
