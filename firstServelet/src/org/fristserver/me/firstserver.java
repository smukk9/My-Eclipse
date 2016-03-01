package org.fristserver.me;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class firstserver
 */
@WebServlet(description = "server extends abstract HTTpservelet class", urlPatterns = { "/firstserver" })
public class firstserver extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	//System.out.println("Hi there you are in DOGET now.");
	//returns a printwriter object.
	PrintWriter writer = response.getWriter();
	String username = request.getParameter("username");
	
	response.getWriter().println("this is from get method:"+username);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	PrintWriter writer = response.getWriter();
	String firstName = request.getParameter("firstName");
	String lastName = request.getParameter("lastName");
	String profession = request.getParameter("proffesion");
	System.out.println(firstName+ lastName + profession);
			
	writer.println("Your fullname"+ firstName+lastName +"your prog:" +profession);
	
	}
}
