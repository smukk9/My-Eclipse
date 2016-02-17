package me.order.Dao;

import java.sql.SQLException;

import me.order.Dto.Order;

public interface OrderDAO {

	public int create(Order order)throws SQLException;
	public int delete(int id) throws SQLException;
	public Order read(int id) throws SQLException;
	public int update(Order order) throws SQLException;
}
