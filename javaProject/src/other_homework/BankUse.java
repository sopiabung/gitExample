package other_homework;

public class BankUse {
	public static void main(String[] args) {
	MyBank m = new MyBank();
	
	BankPlayer a1 = new BankPlayer(1,m);
	BankPlayer a2 = new BankPlayer(2,m);
	BankPlayer a3 = new BankPlayer(3,m);
	
	a1.start();	
	a2.start();
	a3.start();
	

}
}
