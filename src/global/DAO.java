package global;

import java.util.List;

import baedalLogin.LoginVO;
import baedalMenu.MenuVO;

public abstract class DAO {
	public int insert (LoginVO o){return 0;}{}
	public abstract void login(String id, String pass);
	public String searchById (String name, String birth){return null;}
	public String searchByPass (String id, String birth){return null;}
		
	public abstract void selectCate();
	
	public abstract void selectStore();
	
	public abstract void selectMenu();
	
	public abstract void selectOrderMember();
	public abstract void selectOrderMenu();
	
}
