package _homework;

public class StudentUse {

	public static void main(String[] args) {

		SInfo s = new SInfo();
		s.name="홍길동";
		s.address="서울 강남구";
		s.email="hong@gmail.com";
		s.kor=90;
		s.eng=85;
		s.mat=79;
				
		System.out.println("===============================================");
		s.address();
		System.out.println("-----------------------------------------------");
		s.point();
		System.out.println("===============================================");
	}

}
