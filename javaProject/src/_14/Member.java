package _14;

public class Member {

	private String userid; //id
	private String passwd; //비번
	private String name; //이름
	private String tel; //연락처
	private String email; //이메일
	
	//생성자2개
	public Member() {
	}
	public Member(String userid, String passwd, String name, String tel, String email) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.tel = tel;
		this.email = email;
	}

	//getter,setter
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
