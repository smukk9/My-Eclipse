package org.services.pck;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.services.Auth.Authservices;

/**
 * Servlet implementation class loginservice
 */
@WebServlet("/loginservice")
public class loginservice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservice() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String u_name= (String)request.getParameter("user");
		String pwd = (String) request.getParameter("pwd");
		
		Authservices Auth = new Authservices();
		boolean result = Auth.Authenticate(u_name, pwd);
		if(result){
			
			pw.write("you are logged in success full");
			
		}else
		{
			pw.write("wrong");
		}
		
		
	}

}
