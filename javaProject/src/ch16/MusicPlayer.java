package ch16;
//음악을 듣는 사람
public class MusicPlayer extends Thread {
	
	int type;
	MusicBox musicBox;

	public MusicPlayer(int type, MusicBox musicBox) {
		this.type = type;
		this.musicBox = musicBox;
	}

	@Override
	public void run() {
		switch (type) {
		case 1 : musicBox.playMusicA();	break;
		case 2 : musicBox.playMusicB();	break;
		case 3 : musicBox.playMusicC();	break;
		}
	}
	
//	@Override
//	public void run() {
//		switch (type) {//type이 무엇이냐에 따라서 MusicBox의 메소드가 다르게 호출
//		case 1: musicBox.playMusicA(); break;
//		case 2: musicBox.playMusicB(); break;
//		case 3: musicBox.playMusicC(); break;
//		}
//	}
}
