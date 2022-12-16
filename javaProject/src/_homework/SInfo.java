package _homework;

public class SInfo implements Student { 

	String name,address,email;
	int kor,eng,mat,tot;
 	double avg;

	@Override
	public void address() {
		System.out.println("이름\t\t주소\t\t이메일");
		System.out.println(name+"\t\t"+address+"\t\t"+email);
	}

	@Override
	public void point() {
		tot = kor+eng+mat;
		avg = tot/3.0;
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"
		+mat+"\t"+tot+"\t"+String.format("%.1f",avg));
	}

}
