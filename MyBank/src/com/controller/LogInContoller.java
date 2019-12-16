package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.LogInDao;
import com.model.LogInModel;

/**
 * Servlet implementation class LogInContoller
 */
public class LogInContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	List<LogInModel> lst=null;
	public void init()
	{
		lst=new LinkedList<LogInModel>();
	}
    public LogInContoller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String UserName=request.getParameter("UserName");
		String Password=request.getParameter("Password");
		LogInModel LogModel=new LogInModel();
		LogModel.setUserName(UserName);;
		LogModel.setPassword(Password);
		LogInDao LogDao=new LogInDao();
	
		
		lst.add(LogModel);
		
		PrintWriter pw=response.getWriter();
		pw.println("LogIn successful");
		//HttpSession session=request.getSession(true);
		//session.setAttribute("LogIn",lst);
		//pw.println("new user?");
		//pw.println("<a href='AcountRegistration.jsp'>create account a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
