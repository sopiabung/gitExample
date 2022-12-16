package _14;

import java.util.ArrayList;
import java.util.List;

public class ListBook {

	public static void main(String[] args) {
		List<Book> li = new ArrayList<>();
		System.out.println("3건의 도서 자료를 입력하세요! ");
		
		Book b1 = new Book();
		b1.input();
		Book b2 = new Book();
		b2.input();
		Book b3 = new Book();
		b3.input();
		
		li.add(b1);
		li.add(b2);
		li.add(b3);
		
		System.out.println("도서명\t출판사\t단가\t수량\t금액");
		for(Book b : li) {
			System.out.println(b.getBookName()+"\t"+b.getPress()+"\t"+b.getPrice()+"\t"+b.getAmount()+"\t"+b.getMoney());
		}
	}
}
