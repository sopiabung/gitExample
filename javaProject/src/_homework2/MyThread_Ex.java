package _homework2;
//실행파일 : MyThread_Ex_Use
public class MyThread_Ex extends Thread {

	public MyThread_Ex(String name) { //thread 이름으로 사용
		super(name);
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+"==>"+i);
		}
	}
}
