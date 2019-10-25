package com.sampleservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppendServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname = request.getParameter("fname");
		String lastname = request.getParameter("lname");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor='yellow'><h2>");
		
		if(!firstname.isEmpty() && !lastname.isEmpty()) {
			String fullname = lastname + ", " + firstname;		
			out.println(fullname);
			
		}
		else {
			out.println("Make sure fields are not empty.");
		}
		
		out.println("</h2></body></html>");
		
		
	}

}
