package _homework;

public class AuctionUse {

	public static void main(String[] args) {

//getter/setter를 활용해서 아래와 같은 결과가 출력되게 해보세요.
//(등급 : 구매금액이 10만원 이상이면 gold, 아니면 silver)
//​출력결과:
//이름     아이디    구매금액      등급
//홍길동  hong      150000        gold
		
		Auction cus = new Auction();
		cus.setName("홍길동");
		cus.setId("hong");
		cus.setPrice(150000);
		
		cus.print();
	
		
	}

}
