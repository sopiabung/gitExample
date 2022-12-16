package _homework;

public class RadioTest {

	public static void main(String[] args) {

	Radio br = new Radio(); //객체 생성
	br.name = "브리츠"; //라디오 이름
	br.onOff = true;
	br.channel = 89.1f;
	br.volume = 12;
	
	Radio ir = new Radio();
	ir.name = "아이리버";
	ir.onOff = false;
	ir.channel = 95.1f;
	ir.volume = 9;
	
	//출력
	br.logo();
	br.power();
	br.ch_vol();
	
	System.out.println();
	ir.logo();
	ir.power();
	ir.ch_vol();
			
	}

}
