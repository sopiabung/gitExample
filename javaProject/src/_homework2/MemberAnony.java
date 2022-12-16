package _homework2;

public class MemberAnony {
	public static void main(String[] args) {
		Member m = new Member() {
			@Override
			public void print() {
				System.out.println("----------------------");
				System.out.println("고객번호 : "+num);
				System.out.println("이름 : "+name);
				System.out.println("이메일 : "+email);
				System.out.println("----------------------");
			}
		};
		m.print();
	}
}
