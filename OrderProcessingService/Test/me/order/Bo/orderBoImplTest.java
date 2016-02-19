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
	
	public static final int ORDER_ID = 123;
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
	
	@SuppressWarnings("unchecked")
	@Test(expected=BOException.class)
	public void should_Thorw_BOexception() throws SQLException, BOException{
		
		Order order = new Order();	
		when(dao.create(order)).thenThrow(SQLException.class);
		boolean result = bo.pacleOrder(order);
		 	
	}
	
	
	@Test
	public void should_cancel_order() throws SQLException, BOException{
		
		Order order = new Order();
		when(dao.read(ORDER_ID)).thenReturn(order);
		when(dao.update(order)).thenReturn(new Integer(1));
		boolean result = bo.cancelOrder(ORDER_ID);
		assertTrue(result);
		verify(dao).read(ORDER_ID);
		verify(dao).update(order);
		}

	@Test
	public void should_Not_cancel_order() throws SQLException, BOException{
		
		Order order = new Order();
		when(dao.read(ORDER_ID)).thenReturn(order);
		when(dao.update(order)).thenReturn(new Integer(0));
		boolean result = bo.cancelOrder(ORDER_ID);
		assertFalse(result);
		verify(dao).read(ORDER_ID);
		verify(dao).update(order);
		}	
	
	

	@SuppressWarnings("unchecked")
	@Test(expected=BOException.class)
	public void should_ThrowBoException_read_cancel_order() throws SQLException, BOException{
		
		//Order order = new Order();
		when(dao.read(ORDER_ID)).thenThrow(SQLException.class);
		
		boolean result = bo.cancelOrder(ORDER_ID);
		
		}
	
	@SuppressWarnings("unchecked")
	@Test(expected=BOException.class)
	public void should_ThowBOEXception_update_cancel_order()throws SQLException, BOException{
		
		Order order  = new Order();
		when(dao.read(ORDER_ID)).thenReturn(order);
		when(dao.update(order)).thenThrow(SQLException.class);
		 bo.cancelOrder(ORDER_ID);
	}
	
	@Test
	public void should_delete_Order()throws SQLException, BOException{
		
		//Order order = new Order();
		when(dao.delete(ORDER_ID)).thenReturn(1);
		boolean result = bo.deleteOrder(ORDER_ID);
		assertTrue(result);
		verify(dao).delete(ORDER_ID);
		
		
	}
	
	@SuppressWarnings("unchecked")
	@Test(expected=BOException.class)
	public void should_throwException_delete_order()throws SQLException,BOException{
	
		//Order order  = new Order();
		when(dao.delete(ORDER_ID)).thenThrow(SQLException.class);
		 bo.deleteOrder(ORDER_ID);
		
	}
	
	@Test
	public void should_NOT_delete_Order()throws SQLException, BOException{
		
		//Order order = new Order();
		when(dao.delete(ORDER_ID)).thenReturn(0);
		boolean result = bo.deleteOrder(ORDER_ID);
		assertFalse(result);
		verify(dao).delete(ORDER_ID);
		
		
	}
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

