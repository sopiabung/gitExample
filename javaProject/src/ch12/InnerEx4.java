package ch12;

class Outer{
		class InstanceInner{//내부클래스
		int a=100;//non-static
	}
		static class StaticInner{//static 내부클래스
		static int b=300;//static
		int a=200;//non-static
	}
		void myMethod() {//Outer의 멤버메소드
		class LocalInner{//지역중첩클래스
			int a=400;//non-static
		}//end inner class
		LocalInner l = new LocalInner(); //메서드안에 있는 지역중첩클래스의 객체 생성은 메서드 안에서 해준다.
		System.out.println("l.a : " + l.a);
	}//end method
}

public class InnerEx4 {
	public static void main(String[] args) {
		Outer oc=new Outer();
		Outer.InstanceInner i= oc.new InstanceInner();
		System.out.println("i.a : " + i.a);
		//non-static 내부클래스의 non-static 멤버를 가져올 경우
		
		System.out.println("Outer.StaticInner.b : " + Outer.StaticInner.b);
		//static 내부클래스의 static 멤버를 가져올 경우
		
		//non-static멤버는 static클래스 안에 있더라도 반드시 new를 통해 생성한 후 사용해야 한다.
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.a : " + si.a);
		//static 내부클래스의 non-static 멤버를 가져올 경우
		
		oc.myMethod();
		//non-static 외부클래스의 non-static 멤버를 가져올 경우 
	}
}
