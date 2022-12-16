package other_homework;

public class BankPlayer extends Thread {
	int type;
	MyBank mybank;
	
	public BankPlayer(int type, MyBank mybank) {
		this.type = type;
		this.mybank = mybank;
	}
	
	@Override
	public void run() {
		switch (type) {
		case 1: mybank.mA();break;
		case 2: mybank.mB();break;
		case 3: mybank.mC();break;

		}
	}

}