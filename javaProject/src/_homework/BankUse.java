package _homework;

public class BankUse {

	public static void main(String[] args) {
		//은행 객체 생성
		MyBank b = new MyBank();

		//회원 객체 생성
		BankPlayer p1 = new BankPlayer("홍길동",10,b);
		BankPlayer p2 = new BankPlayer("사임당",20,b);
		BankPlayer p3 = new BankPlayer("이몽룡",30,b);

		p1.start();
		p2.start();
		p3.start();
		
	}
}
