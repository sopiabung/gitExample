package _homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductUse extends Product{

	public static void main(String[] args) {
		//Product에서만 쓰이는 모든 자료형들 받을 준비
		List <Product> list = new ArrayList <> ();

		System.out.println("2건의 제품정보를 입력하세요."); //입력안내
		Product p1 = new Product(); //첫번째 제품 정보 입력받을 곳
		p1.input(); //정보입력
		Product p2 = new Product(); //두번째 제품 정보 입력받을 곳
		p2.input(); //정보입력

		list.add(p1); //list에 넣음
		list.add(p2);
		
		//출력
		p1.output(); //목록 양식
		for(Product p : list) { //입력값 불러오기
			System.out.println(p.getNum()+"\t"+p.getName()
			+"\t"+p.getCompany()+"\t"+p.getPrice()+"\t"
			+p.getAmount()+"\t"+p.getMoney());
		}
		System.out.println("---------------------------------------------");
		











	}

}
