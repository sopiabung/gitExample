package _homework;

public class StaticMethod2 {
	//멤버변수
	static int num=10; //사번
	static String name="홍길동"; //이름
	String email="hong@gmail.com"; //이메일
	String hp="010-1234-5678"; //번호
	String addr="서울 강남구 역삼동"; //주소
	
	
	public static void printA() {
		System.out.println("====printA()====");
		System.out.println("사번 : "+num);
		System.out.println("이름 : "+name);
		StaticMethod2 a = new StaticMethod2();
		System.out.println("이메일 : "+a.email);
		System.out.println("전화 : "+a.hp);
		System.out.println("주소 : "+a.addr);
	}

	public void printB() {
		System.out.println("====printB()====");
		System.out.println("사번 : "+num);
		System.out.println("이름 : "+name);
		System.out.println("이메일 : "+email);
		System.out.println("전화 : "+hp);
		System.out.println("주소 : "+addr);
	}
	public static void main(String[] args) {
		
		printA();
		System.out.println();
		StaticMethod2 a = new StaticMethod2();
		a.printB();
	}
	
}
