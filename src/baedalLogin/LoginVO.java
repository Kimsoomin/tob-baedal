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
	@Override
	public String insert() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String login() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String selectByID(String s, String s2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String selectByPass(String s1, String s2) {
		// TODO Auto-generated method stub
		return null;
	}

	
//	=================카테고리 검색==================
	@Override
	public String selectCate() {
		// TODO Auto-generated method stub
		return null;
	}

//	=================식당 검색==================
	@Override
	public String selectStore() {
		// TODO Auto-generated method stub
		return null;
	}
//	=================메뉴 검색==================
	@Override
	public String selectMenu() {
		// TODO Auto-generated method stub
		return null;
	}
//	===============마지막 주문=================
	@Override
	public String selectOrderMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String selectOrderMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String make(String s) {
		// TODO Auto-generated method stub
		return null;
	}



}
