package _homework;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JApplet;

public class MyEventImg extends JApplet implements MouseListener, MouseMotionListener, KeyListener {
	private int x, y; 
	private int width, height; 
	private Image img; 
	private boolean flag = false; 

	@Override
	public void init() {
		setSize(1500, 700);
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("cuttiibbozzack.png"));
		//중요코드!!!현재 클래스에 마우스 이벤트 기능을 추가!
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);

		setFocusable(true);

		requestFocus();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		width = img.getWidth(null);
		height = img.getHeight(null);
		System.out.println(width+" , "+height);
		if(flag) {
			g.drawImage(img, x, y, this);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());//키 코드값
		System.out.println(e.getKeyChar());//키 문자값

		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			y=Math.max(0, y-5); break;
		case KeyEvent.VK_DOWN: 
			y=Math.min(500-height, y+5); break;
		case KeyEvent.VK_LEFT: 
			x=Math.max(0, x-5); break;
		case KeyEvent.VK_RIGHT: 
			x=Math.min(500-width, x+5); break;
		}
		repaint();//그래픽 갱신요청		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouse drag : x="+x+", y="+y);

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		System.out.println("mouse move : x="+x+" , y="+y);
		repaint();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		flag=true;
		
		x = e.getX();
		y = e.getY();
		
		repaint();

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}