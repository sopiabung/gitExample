package ch07;

public class BookSotreUse {

	public static void main(String[] args) {
		BookStore bs=new BookStore();//객체생성과 동시에 기본생성자 호출 , 생성자는 메소드이다.
		//데이터입력
		bs.setBookName("Java");
		bs.setAuthor("김선생");
		bs.setPress("영진");
		bs.setYear(2022);
		bs.setAmount(10);
		bs.setPrice(30000);
		//출력
		bs.print();
	}

}
