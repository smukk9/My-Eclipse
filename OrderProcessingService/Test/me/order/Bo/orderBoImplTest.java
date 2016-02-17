package me.order.Bo;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.MockitoAnnotations.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.sql.SQLException;

import me.order.Bo.exception.BOException;
import me.order.Dao.OrderDAO;
import me.order.Dto.Order;

public class orderBoImplTest {
	
	@SuppressWarnings("deprecation")
	@Mock
	OrderDAO dao ;
	private orderBoImpl bo;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
		bo = new orderBoImpl();
		bo.setDao(dao);
	}

	@Test
	public void should_create_neworder()throws SQLException, BOException {
		Order order = new Order();
		when(dao.create(order)).thenReturn(new Integer(1));
		boolean result = bo.pacleOrder(order);
		assertTrue(result);
		verify(dao).create(order);
	}

	@Test
	public void should_Not_Create()throws SQLException, BOException {
		
		Order order = new Order();
		when(dao.create(order)).thenReturn(new Integer(0));
		boolean result = bo.pacleOrder(order);
		assertFalse(result);
		verify(dao).create(order);
	}
}
