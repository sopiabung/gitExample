package _homework2;
public class WrapperEx3 {
	String a = "Hello 1234";
	char[] sep = new char [a.length()];//배열화
	void seper() { //한글자씩 대소문자,숫자,특수문자 구분하는 메소드
		for(int i=0; i<sep.length; i++) { //배열을 이용한 향상된 for문
			sep[i] = a.charAt(i);
			if(Character.isUpperCase(sep[i])) {
				System.out.println(sep[i]+"는 대문자입니다.");
			}else if(Character.isLowerCase(sep[i])) {
				System.out.println(sep[i]+"는 소문자입니다.");
			}else if(Character.isDigit(sep[i])) {
				System.out.println(sep[i]+"는 숫자입니다.");
			}else {
				System.out.println(sep[i]+"는 특수문자입니다.");
			}
		}
	}
	String dig = a.substring(6); //"1234"
	int idig = Integer.parseInt(dig); //String -> int로 형변환 //1234
	void charDig() { //문자숫자 구분하는 메소드
		System.out.println("문자 "+dig+"입니다.");		
		System.out.println("숫자 "+idig+"입니다.");
		System.out.println("숫자 "+idig+" + 2 = "+(idig+2)+"입니다.");
	}

	public static void main(String[] args) {
		WrapperEx3 w = new WrapperEx3(); //객체생성
		w.seper(); //구분하는 메소드
		System.out.println();
		w.charDig(); //문자숫자 구분하는 메소드
	}
}
/*-------------------------------------
(Character 사용)
H는 대문자입니다.
e는 소문자입니다.
l는 소문자 입니다.
.
.
4는 숫자입니다.
(Integer 사용)
문자 1234입니다.
숫자 1234입니다.
숫자 1234 + 2 = 1236 입니다.
--------------------------------------*/		
/* 1. "Hello 1234" 문자 하나씩 나누기 String.charAt(), String.substring()
 * 2. 대소문자,숫자 구분하기 : Character.isUP, LOW, DIGIT.
 * 4. 문자->숫자로 바꾸기 : Integer.parseInt
 * 5. 연산하기	 */
