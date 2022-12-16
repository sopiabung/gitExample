package _homework2;

public class MyThread_Im_Use {

	public static void main(String[] args) {
		MyThread_Im r1 = new MyThread_Im(); //객체 생성
		 
		//스레드 객체 생성후 MyThread_Im 객체 넣어주기
		Thread t1 = new Thread(r1, "스레드1");
		Thread t2 = new Thread(r1, "스레드2");
		
		//우선순위 주기
		t1.setPriority(Thread.MIN_PRIORITY);//최소 우선순위
		t2.setPriority(Thread.MAX_PRIORITY);//최우선순위
		
		//출력
		t1.start();
		t2.start();
	}

}
