package _homework;
//공유객체
public class MyBank {
	//잔고확인 출력
	public synchronized void cal(String name, int balance) {
		for(int i=0; i<5; i++) {
			System.out.println(name+"님 통장잔고는 "+balance+"만원입니다.");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance += 10; //10만원씩 추가
		}//for
		System.out.println(); //각 회원 출금안내 사이에 띄어쓰기.
	}//cal()
}
