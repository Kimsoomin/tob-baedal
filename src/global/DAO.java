package global;

import java.util.List;

import baedalLogin.LoginVO;
import baedalMenu.MenuVO;

public abstract class DAO {
	public int insert (LoginVO o){return 0;}{}
	public String login(String id, String pass){return null;}
	public LoginVO searchById (String name, String birth){return null;}
	public LoginVO searchByPass (String id, String birth){return null;}
	
	public abstract void selectOrderMember();
	public abstract void selectOrderMenu();
	
}
