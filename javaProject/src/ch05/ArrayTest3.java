package ch05;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] numbers = {10,20,30};
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("=============");
		
		//향상된 for문(for~each문, 확장for문)으로 바꿔보세요~
		for(int value : numbers) {//객체를 다룰때 유용한 기법
			System.out.println(value);
		}

	}

}
