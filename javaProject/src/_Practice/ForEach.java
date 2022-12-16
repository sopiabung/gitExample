package _Practice;

public class ForEach {

	public static void main(String[] args) {
		int sum = 0;
		int[] n= {1,2,3,4,5};
		for(int k : n) {
			sum += k;
		}
		System.out.println(sum);

		String s = "";
		char[] a = {'1','2','3','4','5'};
		for( char b : a ) {
			System.out.print(b+" ");
		}
	}
}