package me.order.Bo.exception;

import java.sql.SQLException;

public class BOException extends Exception {

	public BOException(SQLException e) {
		super(e);
	}

	private static final long serialVersionUID = 1L;

}
