package org.services.pck;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.services.dto.User;
import org.sevices.db.MockDB;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		User user = new User();
		user.setUser_Name(request.getParameter("u_name"));
		user.setE_mail(request.getParameter("e_mail"));
		user.setPhone_Number((Integer.parseInt(request.getParameter("p_number"))));
		user.setCountry(request.getParameter("country_name"));
		MockDB mockdb = new MockDB();
		boolean result = mockdb.addDB(user);
		if(result){
			
			pw.write(user.getUser_Name() +"you have registred succesfully");
		}
		else
		{
			pw.write("something went wrong");
		}
	}

}
