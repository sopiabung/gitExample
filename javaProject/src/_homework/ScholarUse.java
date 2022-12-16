package _homework;
//'Scholar' extends 'Student' 의 실행파일
public class ScholarUse {

	public static void main(String[] args) {

		Scholar s1 = new Scholar();
		s1.input("김철수", "2203", "컴공", 1, "1종", 2500000);
		s1.print6();
		
		s1.input("홍길동", "2001", "사회", 3, null, 0);
		s1.print4();
		
		
		
	}

}
