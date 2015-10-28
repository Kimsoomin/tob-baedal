package baedalFirst;

import java.io.Serializable;

import global.SQL;

public class FirstVO implements Serializable, SQL{
	
	private static final long serialVersionUID = 1L;
	private String temp1;
	

	public String getTemp1() {
		return temp1;
	}

	public void setTemp1(String temp1) {
		this.temp1 = temp1;
	}

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
	public String selectByID(String s1, String s2) {
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

	
	public String selectCate(String s) {
		String qurey = "select * from food_cate where store_menu = "+make(s);
		return qurey;
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
