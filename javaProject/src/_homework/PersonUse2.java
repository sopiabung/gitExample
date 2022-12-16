package _homework;

public class PersonUse2 {

	public static void main(String[] args) {

		Person2 ph = new Person2();
		ph.setName("홍길동");
		ph.setAge(30);
		ph.seteMail("hong@naver.com");
		ph.setAddress("서울 강남구 역삼동");

		Person2 ps = new Person2();
		ps.setName("사임당");
		ps.setAge(25);
		ps.seteMail("saimdang@gmail.com");
		ps.setAddress("서울 강남구 서초동");


		ph.print();
		System.out.println();
		ps.print();
	}

}
