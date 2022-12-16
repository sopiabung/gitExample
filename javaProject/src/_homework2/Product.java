package _homework2;
import java.util.Scanner;
public class Product {
	//ListStudent.java 참고 //제네릭,ArrayList,스캐너 활용
	private int num; //제품번호
	private String name; //제품명
	private String company; //제조사
	private int price; //단가
	private int amount; //수량
	private int money; //금액 (단가*수량)

	public void input() { //제품 정보 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("제품번호 : ");
		num = sc.nextInt();
		System.out.print("제품명 : ");
		name = sc.next();
		System.out.print("제조사 : ");
		company = sc.next();
		System.out.print("단가 : ");
		price= sc.nextInt();
		System.out.print("수량 : ");
		amount= sc.nextInt();
		money = price*amount;
	}
	
	public void output() { //목록 양식
		System.out.println("                                  (단위 : 천원)");
		System.out.println("---------------------------------------------");
		System.out.println("제품번호\t제품명\t제조사\t단가\t수량\t금액");
		System.out.println("---------------------------------------------");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMoney() {
		return money = price*amount;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}


