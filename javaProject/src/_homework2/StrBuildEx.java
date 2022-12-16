package _homework2;

public class StrBuildEx {

	StringBuilder str1 = new StringBuilder("I am a ");
	StringBuilder str2 = new StringBuilder("Java Programmer");
	
	void print() {
		System.out.println("----------------------------------------------");
		System.out.println("append() 메소드를 활용 : \""+str1.append(str2)+"\"");
		System.out.println("replace() 메소드를 활용 : \""+str1.replace(7, 11, "JSP")+"\"");
		System.out.println("substring() 메소드를 활용 : \""+str1.substring(7)+"\"");
		System.out.println("----------------------------------------------");
	}

	public static void main(String[] args) {
		StrBuildEx s = new StrBuildEx();
		s.print();

	}
}
