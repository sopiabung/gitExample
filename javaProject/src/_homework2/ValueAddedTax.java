package _homework2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ValueAddedTax {
	public static double valueOfSupply;//공급가액
	public static int vatRate = 10;//부가세율
	public static double getvat() {//부가세계산
		return valueOfSupply / vatRate;
	}
	public static double getTotal() {
		return valueOfSupply + getvat();
	}

	public static void main(String[] args) {
		DecimalFormat decFormat = new DecimalFormat("###,###");
		Scanner sc = new Scanner(System.in);
		System.out.print("공급가액을 입력하세요 : ");
		ValueAddedTax.valueOfSupply = Integer.parseInt(sc.nextLine());
		System.out.println("공급가액 : "+decFormat.format((int)valueOfSupply)+"원");
		System.out.println("부가가치세율 : "+ vatRate + "%");
		//오류라인
		try {
			System.out.println("부가가치세 : " + decFormat.format((int)getvat()+"원"));
		}
		catch (Exception e) {
			System.out.println("프로그램 실행 중에 문제가 발생했습니다.");
			System.out.println("문제를 해결하고 다시 시도합니다.");
			System.out.println("부가가치세 : " + decFormat.format((int)getvat())+"원");
		}
		System.out.println("합계 : "+decFormat.format((int)getTotal())+"원");
		System.out.println("*********************************");
		sc.close(); 
	}
}
