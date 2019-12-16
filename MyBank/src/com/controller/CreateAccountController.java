package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CreateAccountDao;
import com.model.CreateAccountModel;

/**
 * Servlet implementation class CreateAccountController
 */
public class CreateAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAccountController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Customer_Name=request.getParameter("FirstName")+(String)request.getParameter("MiddleName")+(String)request.getParameter("LastName");
		
		 String Customer_Fathers_Name=request.getParameter("FatherFirstName")+(String)request.getParameter("FatherMiddleName")+(String)request.getParameter("FatherLastName");
		 String DateOfBirth=request.getParameter("date");
		 String Gender=request.getParameter("Gender");
		 String Nationality=request.getParameter("Nationality");
		 String AadharNo=request.getParameter("AadharNo");
		 String PanCardNo=request.getParameter("PanCardNo");
		 String Local_Address=request.getParameter("LocalAddress");
		 String Permanent_Address=request.getParameter("PermanentAddress");
		 String State=request.getParameter("State");
		 String City=request.getParameter("City");		
		 String Pincode=request.getParameter("Pincode");
		 String MobileNo=request.getParameter("MobileNo");
		 String Email_Id=request.getParameter("EmailId");
		Long Mobile_No=Long.parseLong(MobileNo);
		Long Date_Of_Birth=Long.parseLong(DateOfBirth);
		int Aadhar_No=Integer.parseInt(AadharNo);
		int Pancard_No=Integer.parseInt(PanCardNo);
		int Pin_Code=Integer.parseInt(Pincode);
		
		CreateAccountModel AccModel=new CreateAccountModel();
		AccModel.setCustomer_Name(Customer_Name);
		AccModel.setCustomer_Fathers_Name(Customer_Fathers_Name);
		AccModel.setDate_Of_Birth(Date_Of_Birth);
		AccModel.setGender(Gender);
		AccModel.setNationality(Nationality);
		AccModel.setMobile_No(Mobile_No);
		AccModel.setEmail_Id(Email_Id);
		AccModel.setLocal_Address(Local_Address);
		AccModel.setPermanent_Address(Permanent_Address);
		AccModel.setCity(City);
		AccModel.setState(State);
		
		AccModel.setAadhar_No(Aadhar_No);
		AccModel.setPanCard_No(Pancard_No);
		
		List<CreateAccountModel> lst=new ArrayList<CreateAccountModel>();
	  lst.add(AccModel);
	  
	  CreateAccountDao Account_Dao=new CreateAccountDao();
	  int i=Account_Dao.Customer_Personal_details(lst);
	  if(i>0)
	  {
		  response.sendRedirect("CreateAccount.jsp");
	  }
	  
		doGet(request, response);
	}

}
