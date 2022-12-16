package ch16;
//실행파일 : class ThreadExam2
public class MyThread2 implements Runnable {
	String str;
	public MyThread2(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.print(str);
			try { // Thread.sleep(int) : int타입이 들어가야 하기때문에 강제 형변환.
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
