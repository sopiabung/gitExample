package ch10;

public class OverloadEx {
	//overload : 메소드이름은 같고 자료형 또는 매개변수갯수는 달라야함.
	public void putData(String a) {
		System.out.println(a);
	}
	public void putData(int a) {
		System.out.println(a);
	}
	public void putData(double a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		OverloadEx o = new OverloadEx();
		o.putData("hello");
		o.putData(5);
		o.putData(3.5);
	}

}
