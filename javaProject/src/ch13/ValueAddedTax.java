package ch13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValueAddedTax {
	public static double valueOfSupply;//공급가액
	public static int vatRate = 10; //부가세율
	public static double getVat() {//부가세계산
		return valueOfSupply / vatRate;
	}
	public static double getTotal() {//부가세포함합계
		return valueOfSupply + getVat();
	}
	
	public static void main(String[] args) {
		DecimalFormat decFormat = new DecimalFormat("###,###");
		Scanner sc = new Scanner(System.in);
		System.out.print("공급가액을 입력하세요 : ");
		ValueAddedTax.valueOfSupply = Double.parseDouble(sc.nextLine());
		try {//에러가 날 수 있는 코드 영역
			System.out.println("**********************************");
			System.out.println("공급가액 : " + decFormat.format((int)valueOfSupply) + "원");
			System.out.println("부가가치세율 : " + vatRate + "%");
			System.out.println("부가가치세 : " + decFormat.format((int)getVat()) + "원");
			System.out.println("합계 : " + decFormat.format((int)getTotal())+ "원");
			System.out.println("**********************************");
			
		} catch (Exception e) {//에러가 났을때 수행할 코드 영역
			System.out.println("프로그램이 정상처리 되지 않았습니다.");
		}
		sc.close();
	}
}
