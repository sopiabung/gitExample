package _homework;
public class MEMO {
	/*
	12/2.금
	어제과제 2번
	복습
1. 디버깅
3. MyThread - Thread.sleep(1000); 이걸 왜쓰나?
try ~ catch는 try문이 오류일때.? 왜 여기에?
4. 왜 .start() => run()이 실행되나?
5.InterruptedException 은 영원히 sleep할 경우를 대비?
5-2. MyThread1,2 - Thread.sleep((int)(Math.random() * 1000));
	왜 (int)로 강제형변환?
6.ThreadExam1 - start()외의 다른 실행문들이 있을 땐 순서가?
노트북으로 파일 옮기고, F3키 정상작동 만들기
	 */
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
		System.out.println((int)(Math.random()*7)+75); //75부터 (7-1)개의 정수 => 75~81
//		System.out.println((int)(Math.random()*n)+min); //min <= x <min+n
		}
	}
}
