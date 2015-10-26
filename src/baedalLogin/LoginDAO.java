package baedalLogin;

import java.util.List;

import global.DAO;

public class LoginDAO extends DAO{

	@Override
	public int insert(Object o) {
		// TODO Auto-generated method stub
		return super.insert(o);
	}

	@Override
	public List searchById(String name, String birth) {
		// TODO Auto-generated method stub
		return super.searchById(name, birth);
	}

	@Override
	public List searchByPass(String id, String birth) {
		// TODO Auto-generated method stub
		return super.searchByPass(id, birth);
	}

}
