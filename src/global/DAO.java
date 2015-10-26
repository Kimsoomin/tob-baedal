package global;

import java.util.List;

public abstract class DAO {
	public int insert (Object o){return 0;};
	public List searchById (String name, String birth){return null;}
	public List searchByPass (String id, String birth){return null;}
		
	public List selectCate(){return null;}
	
	public List selectStore(){return null;}
	
	public List selectMenu(){return null;}
	
	public List selectOrderMember(){return null;}
	public List selectOrderMenu(){return null;}
	
}
