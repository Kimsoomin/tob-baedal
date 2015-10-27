package baedalLogin;

public interface LoginService {
	//회원가입
	public void join (String id, String pass, String name, String phone, String addr, String birth);
	// 로그인
	public String login(String id, String pass); 
	// 아이디 찾기
	public LoginVO searchById(String name, String birth);
	// 비밀번호 찾기
	public LoginVO searchByPass(String id, String birth, String Phone);
	// 중복 체크
	public boolean checkDupl(String id);
	
// 	비번 변경
//	public String changePass(String id, String pass);

	
}
