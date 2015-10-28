package baedalLogin;

public interface LoginService {
	//회원가입
	
	public void join (String userid, String pass, String name, String phone, String addr, String birth, String que , String ans);
	
	// 로그인
	public String login(String userid, String pass); 
	
	
	// 아이디 찾기
	
	public LoginVO searchById(String name, String birth,String findname,String findbirth);
	
	
	// 비밀번호 찾기
	
	public LoginVO searchByPass(String id, String que, String ans, String id2, String que2, String ans2);
	
	
	// 중복 체크
	public boolean checkDupl(String userid);
	
// 	비번 변경
//	public String changePass(String id, String pass);

	
}

