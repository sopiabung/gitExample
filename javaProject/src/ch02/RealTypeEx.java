package ch02;

public class RealTypeEx {

	public static void main(String[] args) {
		double d = 0.1234;//double도 숫자뒤에는 D 나 d를 써야하지만 생략가능하다.
		double e = 1234E-4;//1234E-4 = 1234x10-4이므로 0.1234와 동일
		float f = 0.1234F; //float형 만큼은 숫자 뒤에 F 또는 f를 꼭 명시해야 한다.
		double w = .1234; //.1234는 0.1234이다.
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(w);
	}

}
