package _17;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JApplet;

public class RanmdomLine extends JApplet{

	private Random random;
	@Override //applet은 항상 처음에 init 오버라이딩 해줘야함
	public void init() {
		setSize(500, 500);
		random = new Random();				
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for(int i=0; i<100; i++) {
			int red=random.nextInt(256); //0~255
			int green=random.nextInt(256);
			int blue=random.nextInt(256);
			//색상표현방법1) Color.상수
//					   2) Color.(r,g,b)
			g.setColor(new Color(red, green, blue));
			//컬러값을 rgb패턴으로 다양한 색을 출력
			
			int x1=random.nextInt(300); //0~299
			int y1=random.nextInt(300); //0~299
			int x2=random.nextInt(300); //0~299
			int y2=random.nextInt(300); //0~299
			g.drawLine(x1, y1, x2, y2);
		}
	}
}
