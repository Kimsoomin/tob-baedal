package baedalLogin;

import java.io.Serializable;

import global.SQL;

public class LoginVO implements Serializable, SQL{
	
	private String userid;		// 아이디
	private String password;	// 비번
	private String name;		// 회원이름
	private String phone;		// 전화번호
	private String addr;		// 주소
	private String birth;		// 태어난 날짜
	
	
//	================Member====================
	
	
	public LoginVO() {

	}
	
	
	
	public LoginVO(String userid, String password, String name, String phone, String addr, String birth) {
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.birth = birth;
	}
	
	
	
	

	public String insert() {
		String query = "insert into member " + "(userid, password, name , phone , addr ,birth)" + "values(?,?,?,?,?,?)";
		return query;
	}
	

	public String login() {
		String query = "select * from member where userid = "+make(this.userid);
		return query;
	}


	public String selectByID(String s, String s2) {
		String query = "select * from member where userid ="+this.make(s);
		return query;
	}

	
	public String selectByPass(String s1, String s2) {
		String query = "";
		return query;
	}

	@Override
	public String make(String s) {
		// TODO Auto-generated method stub
		return "'"+s+"'";
	}



	public String getUserid() {
		return userid;
	}



	public String getPassword() {
		return password;
	}



	public String getName() {
		return name;
	}



	public String getPhone() {
		return phone;
	}



	public String getAddr() {
		return addr;
	}



	public String getBirth() {
		return birth;
	}



	public void setUserid(String userid) {
		this.userid = userid;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public void setAddr(String addr) {
		this.addr = addr;
	}



	public void setBirth(String birth) {
		this.birth = birth;
	}



	@Override
	public String toString() {
		return "로그인 [userid=" + userid + ", password=" + password + ", name=" + name + ", phone=" + phone + ", addr="
				+ addr + ", birth=" + birth + "]";
	}



}
