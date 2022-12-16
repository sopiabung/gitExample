package ch12;

import ch12.MemberOuter.MemberInner;

//문제1]
public class MemberOuter {
	private int num =1 ; //고객번호
	private String name = "홍길동"; //이름
	private String email = "hong@gmail.com"; //이메일
	
		class MemberInner{
			void print() {
				System.out.println("--------------------------------");
				System.out.println("고객번호 : " + num);
				System.out.println("이름 : "+ name);
				System.out.println("이메일 : "+ email);
				System.out.println("--------------------------------");
			} 
			
		}//end inner
	public static void main(String[] args) {
		MemberOuter m = new MemberOuter();
		MemberOuter.MemberInner obj = m.new MemberInner();
		obj.print();
		
	}
}
