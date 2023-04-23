package com.coder1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class second
 */
@WebServlet("/second")
public class second extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public second() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String mname=req.getParameter("mname");
		String dob=req.getParameter("dob");
		String add=req.getParameter("add");
		String email=req.getParameter("email");
		String contact=req.getParameter("cont");
		out.print(fname+" "+mname+" "+lname+" "+dob+" "+add+" "+email+" "+contact);
		
	}

}
