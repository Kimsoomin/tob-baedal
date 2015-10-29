package baedalOrder;

import java.util.List;

public class OrderServiceImpl implements OrderService{

	private static OrderService service = new OrderServiceImpl();
	public static OrderService getService(){
		return service;
	}
	OrderDAO dao = new OrderDAO();
	
	public String searchPrices(String seq) {
		return dao.searchPrices(seq);
	}
	public String[] searchMember(String userid) {
		String[] temp = dao.searchMember(userid);
		return temp;
	}

	@Override
	public String searchMenu(String seq) {
		return dao.searchMenu(seq);
	}
	
}
