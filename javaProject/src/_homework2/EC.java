package _homework2;

import java.text.DecimalFormat;
import java.text.NumberFormat;

//Map, ArrayList, *별표 , 콤마구분자
//Map, ArrayList : ProdEx, ListProdEx.java 참고
//cardNo : 5~8 자리 별표처리 //ch13_StrMethod
//pay : 3자리마다 ,구분 //ch13_FormatEX
public class EC {
	private int no; //주문번호
	private String orderDate; //주문일자
	private String product; //주문상품
	private String cardName; //카드명
	private String cardNo; //카드번호
	private int pay; //결제금액

	static public void info() { //출력 양식
		System.out.println("-------------------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
		System.out.println("-------------------------------------------------------------------");
	}
	public EC() { //기본생성자
	}
	public EC //모든 매개변수가 들어간 생성자
	(int no, String orderDate, String product, 
			String cardName, String cardNo, int pay) {
		this.no = no;
		this.orderDate = orderDate;
		this.product = product;
		this.cardName = cardName;
		this.cardNo = cardNo;
		this.pay = pay;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardNo() {
		return cardNo.replace(cardNo.substring(5,9),"****");
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getPay() {
		// 1. String 사용
		return (String)String.format("%,d", pay); 
		// 2. DecimalFormat 사용
//		DecimalFormat df = new DecimalFormat(",###"); 
//		return df.format(pay);
		// 3. NumberFormat.getInstance() 사용
//		NumberFormat nf = NumberFormat.getInstance(); 
//		return nf.format(pay);
		
	}
	public void setPay(int pay) {
		this.pay = pay;
	}




}
