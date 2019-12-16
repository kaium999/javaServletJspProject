package com.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	public static boolean validate(String Email,String Password) {
	    boolean status = false;
	    Connection conn = null;
	    PreparedStatement pst = null;
	    ResultSet rs = null;
	    
		 String url = "jdbc:postgresql://localhost/finalproject";
		 String driver = "org.postgresql.Driver";
	     String user = "postgres";
	     String password = "1234";
	     try {
			Class.forName(driver);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	     try {
	    	
			conn=DriverManager.getConnection(url,user,password);
			pst=conn.prepareStatement("select * from usertable where email=? and password=?");
			pst.setString(1, Email);
			pst.setString(2, Password);
			
			rs=pst.executeQuery();
		    status = rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     return status;
		}
}
