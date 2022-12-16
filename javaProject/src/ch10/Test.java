package ch10;

public class Test {
	static int a=10;//static member
	int b=20;//nonstatic member
	void print() {//nonstatic member 메소드
		System.out.println(a);//static => 이미 메모리에 올라와 있기 때문에 문제없다.
		System.out.println(b);//nonstatic
	}
	public static void main(String[] args) {
		System.out.println(a);
		
		Test t=new Test();
		System.out.println(t.b);
		t.print();
		//t=null;//객체의 주소값을 초기화(주소값을 잃어버린다.)
		//System.out.println(t.b);
	}

}
