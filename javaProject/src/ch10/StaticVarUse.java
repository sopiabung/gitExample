package ch10;

public class StaticVarUse {

	public static void main(String[] args) {
		//다른클래스의 static 변수로 접근할때는
		//클래스이름.static member
		System.out.println(StaticVar.a);
	}

}
