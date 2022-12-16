package other_homework;

public class MyBank {
	
	public synchronized void mA() {
		for(int i=1; i<6; i++) {
			System.out.println("홍길동님의 통장잔고는 "+i*10+"만원 입니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	public synchronized void mB() {
		for(int i=2; i<7; i++) {
			System.out.println("사임당님의 통장잔고는 "+i*10+"만원 입니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	public synchronized void mC() {
		for(int i=3; i<8; i++) {
			System.out.println("이몽룡님의 통장잔고는 "+i*10+"만원 입니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}


}
