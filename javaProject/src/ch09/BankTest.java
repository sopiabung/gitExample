package ch09;

class Bank { //부모클래스
	//멤버 메소드
	double getInterestRate() {
		return 0.0;
	}
}

class BadBank extends Bank { //자식클래스1
	//@ : 어노테이션(Annotation)이라고 하며 컴파일러에게 추가적인 정보를 제공해주는 메타데이터로 
	//,주석으로 활용하거나 또는 프로그램에게 특정기능을 정의하거나 실행하도록 정보 제공용으로 사용한다. 스프링에서는 본격적으로 활용한다.
	@Override
	double getInterestRate() {//메소드 오버라이딩(재정의)
		return 10.0;
	}
}
class NormalBank extends Bank { //자식클래스2
	@Override
	double getInterestRate() {//메소드 오버라이딩(재정의)
		return 5.0;
	}
}
class GoodBank extends Bank { //자식클래스3
	@Override
	double getInterestRate() {//메소드 오버라이딩(재정의)
		return 3.0;
	}
}
public class BankTest {
	public static void main(String[] args) {
		
		BadBank b1 = new BadBank();//객체생성, 인스턴스화
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		System.out.println("BadBank의 이자율 : " + b1.getInterestRate());
		System.out.println("NormalBank의 이자율 : " + b2.getInterestRate());
		System.out.println("GoodBank의 이자율 : " + b3.getInterestRate());
	}
}
