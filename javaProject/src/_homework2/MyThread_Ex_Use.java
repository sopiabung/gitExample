package _homework2;
//class 파일 : MyThread_Ex
public class MyThread_Ex_Use { 
	
	public static void main(String[] args) {
		
		MyThread_Ex t1 = new MyThread_Ex("스레드1");//스레드 객체 이름과 함께 생성
		MyThread_Ex t2 = new MyThread_Ex("스레드2");

		t1.setPriority(10);//스레드1에 우선순위
		t2.setPriority(1);
		
		t1.start();//run();
		t2.start();
	}
}
