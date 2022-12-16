package _homework;
//Student 의 자식 클래스 - 실행파일 ScholarUse
public class Scholar extends Student {
	//멤버변수
	private String category;//장학금 종류
	private int money;//장학금액
	
	public void input(String name, String num, String major,
			int year, String category, int money) {
		super.setName(name);
		super.setNum(num);
		super.setMajor(major);
		super.setYear(year);
		this.category = category;
		this.money = money;
	}

	public void print6() {
	System.out.println("이름\t학번\t전공\t학년\t구분\t장학금액");
	System.out.println(getName()+"\t"+getNum()+"\t"+getMajor()
	+"\t"+getYear()+"\t"+category+"\t"+money);
	}
	
	public void print4() {
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(getName()+"\t"+getNum()+"\t"+getMajor()
		+"\t"+getYear());
	}
	
	
	
	
}

	