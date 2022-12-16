package _Practice;

public class Append {

	public static void main(String[] args) {

		String a = "안녕";
		String b = "java";
		System.out.println(b.length()); 
		//String.length() : 문자열의 길이
		System.out.println(a.concat(b));
		//concat은 1회성으로 String타입끼리 붙인다. 객체 값이 변하는 것은 아님.
		System.out.println(a);
		System.out.println(b);
		
		//append는 어떤 타입이든 문자열로 변환해서 뒤에 붙인다.
		StringBuilder sb = new StringBuilder();
		String c = "hello";
		sb.append("할루");		
		sb.append(c);
		System.out.println(sb);
		System.out.println(sb.toString());
		sb.setChar;
		System.out.println(sb);
		System.out.println(sb.substring(3,6));
		System.out.println(sb);
		sb.replace(0, 0, c)
		System.out.println(sb);
	}

}
