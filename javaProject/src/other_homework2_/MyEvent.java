package other_homework2_;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
//BorderLayout
//North 영역의 버튼을 클릭 : red
//East 영역의 버튼을 클릭 : green
//South 영역의 버튼 클릭 : blue
//West 영역의 버튼 클릭 : yellow
//Center영역에서 해당색상을 표시
public class MyEvent extends JFrame{

	public MyEvent() {//기본생성자 안에서 코드작성

		setTitle("BorderLayout 과제");
		setSize(500,150);//프레임 크기
		setVisible(true);//프레임 나타나게

		//setLayout(new BorderLayout());//BorderLayout은 기본 레이아웃
		JButton button1 = new JButton("red");
		JButton button2 = new JButton("green");
		JButton button3 = new JButton("blue");
		JButton button4 = new JButton("yello");

		//버튼을 프레임에 붙인다.
		add(button1,"North");
		add(button2,"East");
		add(button3,"South");
		add(button4,"West");
		
		
		button1.addActionListener(new MyEventColor(this,Color.red));
		button2.addActionListener(new MyEventColor(this,Color.green));
		button3.addActionListener(new MyEventColor(this,Color.blue));
		button4.addActionListener(new MyEventColor(this,Color.yellow));

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new MyEvent();
	}
}
