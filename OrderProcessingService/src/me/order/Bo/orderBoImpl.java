	package me.order.Bo;

import java.sql.SQLException;

import me.order.Bo.exception.BOException;
import me.order.Dao.OrderDAO;
import me.order.Dto.Order;

public class orderBoImpl implements OrderBO {

	OrderDAO dao;
	
	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean pacleOrder(Order order) throws BOException {
		try {
			int result = dao.create(order);
			if(result ==0){
				return false;
			}

		} catch (SQLException e) {
			throw new BOException(e);
		}

		return true;
	}

	@Override
	public boolean cancelOrder(int id) throws BOException {

		try {
			Order read = dao.read(id);
			read.setStatus("cancel");
			int result = dao.update(read);
			if(result==0){
				return false;
			}
		} catch (SQLException e) {
			throw new BOException(e);
			
		}
		
		return true;
	}

	@Override
	public boolean deleteOrder(int id) throws BOException {
		try {
			int result = dao.delete(id);
			if(result==0){
				return false;
			}
		} catch (SQLException e) {
			throw new BOException(e);		}
		return true;
	}
	
	

}
