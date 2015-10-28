package baedalMenu;

import java.sql.*;

import global.DAO;

public class MenuDAO extends DAO{
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	private MenuVO menu = new MenuVO();
	
	
	@Override
	public void selectOrderMember() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void selectOrderMenu() {
		
	}
	
	public MenuVO selectOrderMenu(String foodName) {
		MenuVO menu = new MenuVO();
		try {
			stmt = con.createStatement();
			rs= stmt.executeQuery(menu.selectMenu(foodName));
			while (rs.next()) {
				menu.setFoodName(rs.getString("foodName"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return menu;
	}


}
