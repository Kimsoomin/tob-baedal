package baedalLogin;

public class LoginServiceImpl implements LoginService{
	LoginDAO dao = LoginDAO.getInstance();
	
	private static LoginServiceImpl instance = new LoginServiceImpl();
	public static LoginServiceImpl getInstance() {
		return instance;
	}
	@Override
	public void join(String id, String pass, String name, String phone, String addr, String birth) {
		LoginVO vo = new LoginVO(id,pass,name,phone,addr,birth);
		dao.insert(vo);
	}

	@Override
	public String login(String id, String pass) {
		return 	dao.login(id, pass);
	}

	@Override
	public LoginVO searchById(String name, String birth) {
		LoginVO vo = new LoginVO();
		return  dao.searchById(name, birth);
	}

	@Override
	public LoginVO searchByPass(String id, String birth, String Phone) {
		LoginVO vo = new LoginVO();
		return dao.searchByPass(id, birth);
	}

	@Override
	public boolean checkDupl(String id) {
		
		
		return false;
	}



}
