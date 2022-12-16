package _18;

import java.io.Serializable;
public class MemberDTO implements Serializable{
	private String userid;
	private String name;
	private String passwd;
	private int age;
	private String email;

	//생성자 2개, getter,setter

	public MemberDTO() {
	}

	public MemberDTO(String userid, String name, String passwd, int age, String email) {
		super();
		this.userid = userid;
		this.name = name;
		this.passwd = passwd;
		this.age = age;
		this.email = email;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}