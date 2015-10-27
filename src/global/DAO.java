package global;

import java.util.List;

import baedalLogin.LoginVO;
import baedalMenu.MenuVO;

public abstract class DAO {
	public int insert (Object o){return 0;}{}
	public List<LoginVO> login(String id, String pass){return null;}
	public List<LoginVO> searchById (String name, String birth){return null;}
	public List<LoginVO> searchByPass (String id, String birth){return null;}
		
	public Object selectCate(){return null;}
	
	public Object selectStore(){return null;}
	
	public Object selectMenu(){return null;}
	
	public Object selectOrderMember(){return null;}
	public Object selectOrderMenu(){return null;}
	
}
