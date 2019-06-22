package com.app.controller;

import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;

public class AdditionAction extends HttpServlet{
	
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req,HttpServletResponse res) 
	{
		 
		
		
		try {
			int value1=Integer.parseInt(req.getParameter("fNumber"));
		int value2=Integer.parseInt(req.getParameter("sNumber"));
		int val=value1+value2;
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
ServletConfig con=getServletConfig();
		
		out.println(con.getServletName());
		out.println(val);
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
}

	
