package _homework;

public class Member {

	//멤버변수
	private String name; //이름
	private String id; //id
	private int pay; //구매금액
	private String grade; //등급

	public Member(String name, String id, int pay) { //매개변수가 있는 생성자
		this.name = name;
		this.id = id;
		this.pay = pay;
		if(pay >= 10) {
			grade = "gold";
		}else {
			grade = "silver";
		}
	}

	//출력용
	public void print(){ 
		System.out.println("--------------------------------------------");
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println("--------------------------------------------");
		System.out.println(name +"\t"+ id +"\t"+ pay +"\t"+ grade);
	}

}
