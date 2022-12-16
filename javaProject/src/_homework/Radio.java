package _homework;

public class Radio {
//라디오 상태 출력 준비물
	
	String name; //이름
	boolean onOff; //전원
	float channel; //채널
	int volume; //볼륨
	
	void logo () { //라디오 이름 출력
		System.out.println("[" + name + " 라디오]");
	}//끝 name()
	
	void power () { //전원상태 출력
		if(onOff == true) {
		System.out.println("라디오가 켜져있습니다.");
		} else {
		System.out.println("라디오가 꺼져있습니다.");
		}	
	}//끝 onOff()
	
	void ch_vol() {
		System.out.println("현재 채널은 " + channel + " 입니다.");
		System.out.println("볼륨은 "+ volume + " 입니다.");
	}//끝 ch_vol()
	
}//end class