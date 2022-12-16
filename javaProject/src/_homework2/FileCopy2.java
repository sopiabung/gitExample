package _homework2;
/*
입력한 결과를 abc.tx로 저장 후 바로 abcCopy.txt파일로도 복사본을 만드는 프로그램을 만들어 보세요.
출력결과 :이것
입력하세요 : 
제이름은 홍길동입니다.
[파일이 저장되었습니다.]
[파일 복사가 완료되었습니다.]
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class FileCopy2 {
	public static void main(String[] args) {
		FileCopy2.fileWrite();
		FileCopy2.fileCopy();
	}
	static void fileWrite() {
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:\\test\\abc.txt");
			System.out.println("입력하세요 : ");
			while(true) {
				int a = System.in.read();
				if(a == 13) break;
				os.write(a);
			}
			System.out.println("[파일이 저장되었습니다.]");
		} catch (Exception e) {
			System.out.println("[파일 저장에 실패하였습니다.]");
			e.printStackTrace();
		}
	}

	static void fileCopy() {
		String str =""; 
		String filed1 = "C:\\test\\abc.txt"; 
		String filed2 = "C:\\test\\abcCopy.txt";

		BufferedReader br=null;
		BufferedWriter bw=null;

		try {
			br = new BufferedReader(new FileReader(new File(filed1)));
			bw = new BufferedWriter(new FileWriter(new File(filed2)));

			while(true) {
				str=br.readLine();
				if(str==null)break;
				bw.write(str);
			}
			System.out.println("[파일 복사가 완료되었습니다.]");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();{
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(bw != null) bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
