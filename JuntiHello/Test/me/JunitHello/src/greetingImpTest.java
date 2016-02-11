package me.JunitHello.src;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class greetingImpTest {

	private Greetings grt;

	@Before
	public void Setup(){
		System.out.println("setup()");
		grt = new greetingImp();
	}

	@Test
	public void greetingShouldGiveVaild() {

		//Greetings grt = new greetingImp();
		System.out.println("greetingShouldGivevaild()");
		String greet = grt.greet("Junit");
		assertNotNull(greet);
		assertEquals("HelloJunit", greet);

	}
	@Test(expected = IllegalArgumentException.class)
	public void ShouldReturn_ExceptionforTest(){
		System.out.println("ShouldReturn_ExceptionforTes()");
		//Greetings grt = new greetingImp();
		grt.greet(null);
	}
	@Test(expected = IllegalArgumentException.class)
	public void ShouldReturn_ExceptionforBlankSpace(){
		System.out.println("ShouldReturn_ExceptionforBlankSpace()");
		//Greetings grt = new greetingImp();
		grt.greet("");
	}

	@After
	public void tearDown(){
		System.out.println("clean up()");
		grt = null;
	}
}


