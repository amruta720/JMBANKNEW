package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.model.LogInModel;

public class LogInDao {
	public static Connection con;
	public static PreparedStatement ps;
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:XE";
	private String username="System";
	private String password="123456789";
	public Connection getConnection(){
		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url,username,password);
			System.out.println("connectio="+con);
		}catch(Exception e){
			System.out.println(e);
		}return con;
		
	}
    public int LogInData(List <LogInModel> lst){
    	int i=0;
    	int cnt=0; 
    	con=getConnection();
    	LogInModel LogModel=(LogInModel) lst.get(0);
    	try{
    		ps=con.prepareStatement("insert into LogInData values(?,?)");
    		ps.setString(1, LogModel.getUserName());
    		ps.setString(2, LogModel.getPassword());
    		i=ps.executeUpdate();
    	}catch(Exception e){
    		System.out.println(e);
    	}if(i>0)
    	{
    		cnt=1;
    	}
    	return cnt; 
    }
	
	
	
	
	
	
	
	
}
