package ch13;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatEX {
	public static void main(String[] args) {
		//3자리수 콤마 표시
		//1) String을 활용
		int val = 1234000000;
		String str = String.format("%,d", val);
		System.out.println("String.format(\"%,d\", val) => "+str);
		
		//2) DecimalFormat을 활용
		DecimalFormat df = new DecimalFormat("###,###.##");
		String num = df.format(1234000000.123456);
		System.out.println("DecimalFormat(\"###,###.##\") => "+num);
		
		DecimalFormat df1 = new DecimalFormat(",####.#");
		String num1 = df1.format(1234000000.123456);
		System.out.println("DecimalFormat(\",####.#\") => "+num1);
		
		//3) NumberFormat을 활용
		NumberFormat nf = NumberFormat.getInstance();
		String num2 = nf.format(1234000000.123456);
		System.out.println("NumberFormat.getInstance() => "+num2);
		
		//getInstance(Locale.국가) - 해당국가 표기법, 기본은 Locale.US이다.
		NumberFormat nf2 = NumberFormat.getInstance(Locale.ITALY);
		String num3 = nf2.format(1234000000.123456);
		System.out.println("NumberFormat.getInstance(Locale.ITALY) => "+num3);
	}
}
