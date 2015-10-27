package baedalLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import global.DAO;

public class LoginDAO extends DAO{
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private List<LoginVO>list = new ArrayList<LoginVO>();
	private LoginVO login = new LoginVO();
	
	private static LoginDAO instance = new LoginDAO();
	public static LoginDAO getInstance() {
		return instance;
	}
	
	//--------------- 회원가입
		@Override
		public int insert(LoginVO o) {
			int result = 0;
			try {
				pstmt = con.prepareStatement(login.insert());
				pstmt.setString(1, login.getUserid());
				pstmt.setString(2, login.getPassword());
				pstmt.setString(3, login.getName());
				pstmt.setString(4, login.getPhone());
				pstmt.setString(5, login.getAddr());
				pstmt.setString(6, login.getBirth());
				result = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return result;
		}
	
	@Override     //-----------------로그인
	public String login(String id, String pass) {
		String result= "";
		LoginVO temp = new LoginVO();
		
		try {
			stmt = con.createStatement();
			temp.setUserid(id);
			temp.setPassword(pass);
			rs = stmt.executeQuery(temp.login());
			while (rs.next()) {
				temp.setUserid(rs.getString("userid"));
				temp.setPassword(rs.getString("password"));
				temp.setName(rs.getString("name"));
				temp.setPhone(rs.getString("phone"));
				temp.setAddr(rs.getString("addr"));
				temp.setBirth(rs.getString("birth"));
			}	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (temp.getUserid() == null) {
			return null;
		}if (temp.getPassword().equals(pass)) {
			
			 return "환영합니다. "+temp.getName()+"님";
			 
		}else{
			return null;
		}
	}
	
	
	
	@Override      //---------- 아이디 찾기
	public LoginVO searchById(String name, String birth) {
	LoginVO result = new LoginVO();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(login.selectByID(name,birth));
		while (rs.next()) {
			
			result.setUserid(rs.getString("userid"));
			result.setPassword(rs.getString("password"));
			result.setName(rs.getString("name"));
			result.setPhone(rs.getString("phone"));
			result.setAddr(rs.getString("addr"));
			result.setBirth(rs.getString("birth"));
		/*	list.add(result);*/
		}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override          //-----------비밀번호 찾기
	public LoginVO searchByPass(String id, String birth) {
		LoginVO result = new LoginVO();
		
		return result;
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
