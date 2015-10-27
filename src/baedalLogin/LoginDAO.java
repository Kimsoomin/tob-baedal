package baedalLogin;

import java.util.List;

import global.DAO;

public class LoginDAO extends DAO{
	
	@Override
	public String login(String id, String pass) {
		String result= "";
		return result;
		
	}
	@Override
	public LoginVO searchById(String name, String birth) {
		// TODO Auto-generated method stub
		return super.searchById(name, birth);
	}

	@Override
	public LoginVO searchByPass(String id, String birth) {
		// TODO Auto-generated method stub
		return super.searchByPass(id, birth);
	}

	@Override
	public void selectOrderMember() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectOrderMenu() {
		// TODO Auto-generated method stub
		
	}




}
