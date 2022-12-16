package _homework;

class Pa3 {

	int num = 10;
	String name = "홍길동";

	public void input() {
		System.out.println("사번 : "+num);
		System.out.println("이름 : "+name);
	}
}

class Ch3 extends Pa3 {

	String email = "hong@gmail.com";
	String ph = "010-1234-5678";

	@Override
	public void input() {
		super.input();
		System.out.println("이메일 : "+email);
		System.out.println("전화 : "+ph);
	}
}

public class Poly3 {
	public static void main(String[] args) {
		
		String address = "서울 강남구 역삼동";
		
		Pa3 a = new Ch3();
		a.input();
		System.out.println("주소 : "+address);


	}
}
