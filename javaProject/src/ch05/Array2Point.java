package ch05;

public class Array2Point {

	public static void main(String[] args) {
		//5행5열 (국어,영어,수학,총점,평균순서의 데이터 초기화)
		int[][] point= {{80,90,100,0,0},{70,60,95,0,0},{88,77,66,0,0}
		,{99,89,95,0,0},{100,60,50,0,0}};
		//정석으로 표현
		//~
		
		for(int i=0; i<5; i++) {
			point[i][3]=point[i][0]+point[i][1]+point[i][2];
			point[i][4]=point[i][3]/3;
		}
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<5; i++) {
			System.out.println(point[i][0]+"\t"+point[i][1]+"\t"+point[i][2]+"\t"
		+point[i][3]+"\t"+point[i][4]);
		}
	}
}
