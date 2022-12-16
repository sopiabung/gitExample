package ch19;

import java.net.InetAddress;

public class InetAddressExam {

	public static void main(String[] args) {
		try {//네트워크 프로그램도 필수 try~catch 써야함
			InetAddress address= InetAddress.getByName("google.com");
			System.out.println(address);//호스트이름, ip주소
			System.out.println(address.getHostName());//호스트이름(도메인이름)
			System.out.println(address.getHostAddress());//ip주소

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
