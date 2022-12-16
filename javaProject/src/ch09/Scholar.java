package ch09;
//Student 의 자식 클래스 - 실행파일 ScholarUse
public class Scholar extends Student {
	//멤버변수
	private String category;//장학금 종류
	private int money;//장학금액
	
	public void input(String name, String num, String major, 
			int year, String category, int money) {
		super.input(name, num, major, year);//부모의 input메소드
		this.category = category;//자녀의 멤버변수
		this.money = money;//자녀의 멤버변수
	}
	public void print() { //부모의 멤버변수들이 default라서 맘대로 쓸 수 있음.
		System.out.println("이름\t학번\t전공\t학년\t구분\t장학금액");
		System.out.println(name+"\t"+num+"\t"+major+"\t"+year+"\t"
		+category+"\t"+money);
	}
	public void print2() {
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(name+"\t"+num+"\t"+major+"\t"+year);
	}
}
