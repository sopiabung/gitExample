package _Practice;

public class ToCharArray {

	public static void main(String[] args) {

		String s = "hello";
		char[] c = s.toCharArray();
		//char[] c = {'h','e','l','l','o'};
		for(char b : c) {
			System.out.print(b+"");
		}

	}
}
