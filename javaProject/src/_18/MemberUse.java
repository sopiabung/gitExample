package _18;

import java.io.FileOutputStream;
import java.io.ObjectOutput;

public class MemberUse {

	public static void main(String[] args) {
		FileOutputStream fos = null;//파일저장
		ObjectOutput oos = null;//메모리에 있는 객체를 파일로 저장
		MemberDTO m1 = new MemberDTO("kim", "김길동", "1234",30,"kim@gmail.com");
		MemberDTO m2 = new MemberDTO("l", "이길동", "1234",30,"kim@gmail.com");
		MemberDTO m3 = new MemberDTO("p", "박길동", "1234",30,"kim@gmail.com");
		try {
			fos = 
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}

}
