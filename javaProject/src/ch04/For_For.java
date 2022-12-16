package ch04;

//중첩 for문
public class For_For {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			}
			System.out.println();//줄바꿈(개행)
		}
	}//end main(프로그램 종료)
}
