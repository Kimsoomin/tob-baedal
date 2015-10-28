package baedalLogin;

public class LoginServiceImpl implements LoginService{
	LoginDAO dao = LoginDAO.getInstance();
	
	private static LoginServiceImpl instance = new LoginServiceImpl();
	public static LoginServiceImpl getInstance() {
		return instance;
	}
	@Override
	public void join(String id, String pass, String name, String phone, String addr, String birth,String que, String ans) {
		LoginVO vo = new LoginVO(id,pass,name,phone,addr,birth,que,ans);
		dao.insert(vo);
	}

	@Override
	public String login(String id, String pass) {
		return 	dao.login(id, pass);
	}

	@Override
	public LoginVO searchById(String name, String birth,String findName,String findBirth) {
		LoginVO vo = new LoginVO();
		return  dao.searchById(name, birth,findName,findBirth);
	}

	public LoginVO searchByPass(String id, String que, String ans, String id2, String que2, String ans2) {
		LoginVO vo = new LoginVO();
		return dao.searchByPass(id, que ,ans,id2,que2,ans2);
	}

	@Override
	public boolean checkDupl(String userid) {
		boolean exist = false;
		if (dao.checkDupl(userid)) {
			exist = true;
		}else {
			exist = false;
		}
		
		return exist;
	}



}
