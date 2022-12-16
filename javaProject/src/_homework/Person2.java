package _homework;

public class Person2 {

	private String name;
	private int age;
	private String eMail;
	private String address;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>150 || age<0) {
			System.out.println("잘 못 입력하셨습니다.");
		}else {
			this.age = age;
		}
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public void print() {
		System.out.println("이름 : " + name +"\n"+ "나이 : " + 
	age +"\n"+ "이메일 : " + eMail +"\n"+ "주소 : " + address);
	}
}
