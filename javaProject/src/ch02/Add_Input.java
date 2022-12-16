package ch02;

import java.util.Scanner;

public class Add_Input {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//지역변수 선언만
		int x;
		int y;
		int sum;
		
		//지역변수 초기화(변수에 값을 저장)
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		x = input.nextInt();//정수형int는 nextInt()로 받는다.
		System.out.print("두 번째 숫자를 입력하세요 : ");
		y = input.nextInt();
		
		sum = x+y;
		System.out.println(sum);
		input.close();


	}

}
