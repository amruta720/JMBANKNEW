package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.model.CreateAccountModel;

public class CreateAccountDao {
	public static Connection con;
    public static PreparedStatement ps;
    private String driver="oracle.jdbc.OracleDriver";
    private String url="jdbc:oracle:thin:@localhost:1521:XE";
    private String username="System";
    private String password="123456789";
    public Connection getConnection()
    {
   	 
  try  {
   	 Class.forName(driver);
   	 con=DriverManager.getConnection(url,username,password);
   	 System.out.println("Connection "+con);
    }catch(Exception e)
  {
System.out.println(e);	
}return con;
}
     public int Customer_Personal_details(List <CreateAccountModel> lst){
    	 int i=0;
    	 int cnt=0;
    	 con=getConnection();
    	 CreateAccountModel Account_Model= (CreateAccountModel) lst.get(0);
    	 try{
    		 ps=con.prepareStatement("insert into Customer_Personal_details values(?,?,?,?,?,?,?)");
    	 ps.setString(1,Account_Model.getCustomer_Name());
    	 ps.setString(2,Account_Model.getCustomer_Fathers_Name());
    	 ps.setLong(3,Account_Model.getDate_Of_Birth());
    	 ps.setString(4,Account_Model.getGender());
    	 ps.setString(5,Account_Model.getNationality());
    	 ps.setLong(6,Account_Model.getMobile_No());
    	 ps.setString(7,Account_Model.getEmail_Id());
    	 i=ps.executeUpdate();
    	 
    	 
    	 
    	 
    	 }catch(Exception e){
    		 System.out.println(e);
    	 }if(i>0)
    	 {
    		 cnt=1;
    	 }
     return cnt;
}}
