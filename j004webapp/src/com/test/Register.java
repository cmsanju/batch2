package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String fname = request.getParameter("fname");
		String name = request.getParameter("user");
		String pass = request.getParameter("pwd");
		
		if(name.equals("admin") && pass.equals("admin"))
		{
			out.println("register success...");
		}
		else
		{
			out.println("register failed.");
		}
	}

}
