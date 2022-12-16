package ch18;

import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx2 {

	public static void main(String[] args) {
		int var=0;
		// new InputStreamReader(InputSream)나 마찬가지임
		Reader input=new InputStreamReader(System.in);
		System.out.println("입력하세요 : ");
		try {
			while (true) {
				var = input.read();//1문자를 읽어들임
				if(var == 13) break;//엔터키가 들어오면 종료
				System.out.println(var+"==>"+(char)var);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
