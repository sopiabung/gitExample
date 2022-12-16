package ch08;

public class Person {
	//멤버변수
	private String name;//"홍길동", "추신수", "박찬호", "구자욱"
	private int height;//170, 190, 185, 175
	private int weight;//60, 100, 70, 72
	//this() 다른생성자 호출
	public Person() {//기본 생성자(default constructor)
		this("홍길동",170,60);//(String,int,int)
	}
	public Person(String name) {//name="추신수"
		this(name,190,100);//(String,int,int)
	}
	public Person(String name, int height) {//name="박찬호", height=185
		this(name,height,70);
	}
	public Person(String name, int height, int weight) {//name="구자욱",height=175,weight=72
		this.name=name; //this.멤버변수 = 지역변수
		this.height=height;
		this.weight=weight;
	}
	//출력용도
	public void showInfo() {
		System.out.println("===신상 정보===");
		System.out.println("이름 : "+name);
		System.out.println("신장 : "+height);
		System.out.println("체중 : "+weight);
	}
}
