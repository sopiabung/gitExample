package ch07;

public class Television {
	//멤버변수(전역,필드)
	int channel; //채널 7 | 다른메모리에 9  | 11
	int volume; //볼륨 9  |   "      12 
	boolean onOff; //전원 상태 true |  false
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}
	int getChannel() {
		return channel;
	}
	void setChannel(int ch) {
		channel = ch;
	}
}
