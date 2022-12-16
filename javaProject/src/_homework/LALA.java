package _homework;

public class LALA {

	public static void main(String[] args) {
		
//		LALA l = new LALA();
//		System.out.println(l);
//		
//		Character c = new Character('b');
//		System.out.println(c);
//		
//		StringBuilder bb = new StringBuilder("안녕");
//		System.out.println(bb);
//		System.out.println(System.identityHashCode(bb));
//		
		StringBuilder str1 = new StringBuilder("hi");
		StringBuilder str2 = new StringBuilder("hello");
		StringBuilder str3 = new StringBuilder("hi");
		StringBuilder str4 = new StringBuilder("hello");
		
		System.out.println(str1.append(str2));
		System.out.println(str1);
		System.out.println("-------------------");
		str3.append(str4);
		System.out.println(str3);
		
	}
}
