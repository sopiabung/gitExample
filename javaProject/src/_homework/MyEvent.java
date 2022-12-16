//BorderLayout
//North 영역의 버튼을 클릭 : red
//East 영역의 버튼을 클릭 : green
//South 영역의 버튼 클릭 : blue
//West 영역의 버튼 클릭 : yellow
//Center영역에서 해당색상을 표시
package _homework;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
public class MyEvent extends JFrame{
	private JButton button1,button2,button3,button4;
	public MyEvent() {//기본생성자 안에서 코드작성
		setTitle("BorderLayout 과제");
		setSize(500,500);//프레임 크기
		setVisible(true);//프레임 나타나게
		setDefaultCloseOperation(EXIT_ON_CLOSE);//창이 없어짐
		button1 = new JButton("red");
		button2 = new JButton("green");
		button3 = new JButton("blue");
		button4 = new JButton("yello");
		//버튼을 프레임에 붙인다.
		add(button1,"North");
		add(button2,"East");
		add(button3,"South");
		add(button4,"West");
		//버튼을 누르면 배경색이 변하는 이벤트를 넣는다.
		button1.addActionListener(new MyEventColor(this,Color.red));
		button2.addActionListener(new MyEventColor(this,Color.green));
		button3.addActionListener(new MyEventColor(this,Color.blue));
		button4.addActionListener(new MyEventColor(this,Color.yellow));
	}
	public static void main(String[] args) {
		new MyEvent();
	}
}
