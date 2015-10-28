package baedalMenu;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import global.DAO;

public class MenuDAO extends DAO{
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	private List<MenuVO> list =new ArrayList<MenuVO>(); 
	private MenuVO menu = new MenuVO();
	
	
	@Override
	public void selectOrderMember() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void selectOrderMenu() {
		
	}
	public void selectOrderMenu(String key) {
		MenuVO menu = new MenuVO();
		try {
			stmt = con.createStatement();
			rs= stmt.executeQuery(menu.selectMenu(key));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}


}
