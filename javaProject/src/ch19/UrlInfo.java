package ch19;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlInfo {

	//URL : url정보를 분석하는 클래스
	public static void main(String[] args) {
		try {
			URL url=new 
					URL("https://news.jtbc.co.kr/article/article.aspx?news_id=NB12106860");
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("포트 : " + url.getPort());
			System.out.println("호스트 : " + url.getHost());
			System.out.println("파일 : " + url.getFile());
			System.out.println("기타 : " + url.toExternalForm());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
