package me.order.Bo;

import me.order.Bo.exception.BOException;
import me.order.Dto.Order;

public interface OrderBO {

	public boolean pacleOrder(Order order)throws BOException;
	public boolean cancelOrder(int id)throws BOException;
	public boolean deleteOrder(int id) throws BOException;
}
