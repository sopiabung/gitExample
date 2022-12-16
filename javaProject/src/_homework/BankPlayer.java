package _homework;

public class BankPlayer extends Thread {

	public String name;//회원이름
	public int balance;//잔고
	MyBank bank;//은행

	//매개변수가 있는 생성자
	public BankPlayer(String name, int balance, MyBank bank) {
		this.name = name;
		this.balance = balance;
		this.bank = bank;
	}

	@Override
	public void run() {
		bank.cal(name, balance);
	}

}
