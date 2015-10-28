package baedalMenu;

import java.io.Serializable;

import global.SQL;

public class MenuVO implements Serializable, SQL{
	
	private static final long serialVersionUID = 1L;
	private String temp3;
	private String tem;
	private String menuSeq;
	private String foodName;
	private String profile;
	
	public MenuVO() {
		// TODO Auto-generated constructor stub
	}
	
	public MenuVO(String temp3, String menuSeq, String foodName,
			String profile) {

			this.temp3 = temp3;
			this.menuSeq = menuSeq;
			this.foodName = foodName;
			this.profile = "default.png";

			}
	
public String getMenuSeq() {
		return menuSeq;
	}

	public String getFoodName() {
		return foodName;
	}

	public String getProfile() {
		return profile;
	}

	public void setMenuSeq(String menuSeq) {
		this.menuSeq = menuSeq;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public void setProfile(String profile) {
		this.profile = "default.png";
	}

	
	
@Override
	public String toString() {
		return "메뉴[메뉴명=" + foodName 
				+ ", 사진=" + profile
				+ "]"+"\n";
	}

// ===아이디값 받음=====

public String getTemp3() {
		return temp3;
	}

	public void setTemp3(String temp3) {
		this.temp3 = temp3;
	}

// ===가격 보냄====
	
	public String getTem() {
		return tem;
	}

	public void setTem(String tem) {
		this.tem = tem;
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

	public String selectMenu(String s) {
		String qurey = "select * from menu where food_name= "+make(s);
		return qurey;
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
