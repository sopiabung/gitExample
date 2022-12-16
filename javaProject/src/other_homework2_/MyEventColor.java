package other_homework2_;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
//BorderLayout
//North 영역의 버튼을 클릭 : red
//East 영역의 버튼을 클릭 : green
//South 영역의 버튼 클릭 : blue
//West 영역의 버튼 클릭 : yellow
//Center영역에서 해당색상을 표시
public class MyEventColor implements ActionListener{
	//멤버변수
	private JFrame f; //contentPane 자동생성.
	private Color c;
	private Container con;

	public MyEventColor(JFrame f, Color c) {
		super();
		this.f = f;
		this.c = c;
		this.con = f.getContentPane();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);
	}
}
