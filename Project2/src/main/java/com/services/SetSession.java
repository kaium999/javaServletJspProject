package com.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.entity.User;

public class SetSession {
	private static Connection connection = null;
	public static Connection getconection() {
		if(connection!=null) {
			return connection;
		}else {
			 PreparedStatement pst = null;
			  ResultSet rs = null;
			  Statement statement = null;
			 String url = "jdbc:postgresql://localhost/finalproject";
			 String driver = "org.postgresql.Driver";
		     String user = "postgres";
		     String password = "1234";
		     try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     try {
				connection=DriverManager.getConnection(url,user,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connection;
	}
	public static User setsession(String email) {
		 String url = "jdbc:postgresql://localhost/finalproject";
		 String driver = "org.postgresql.Driver";
	     String user = "postgres";
	     String password = "1234";
	     ResultSet rs = null;
		 Statement statement = null;
		 Connection connection = null;
		 User userEntity=new User();
		 try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 connection=getconection();
		 try {
			statement=connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String query="select * from usertable where email='"+email+"';";
		 try {
			rs = statement.executeQuery(query);
			while(rs.next()) {
				
				userEntity.setFirst_name(rs.getString("first_name"));
				userEntity.setLast_name(rs.getString("last_name"));
				userEntity.setUser_name(rs.getString("user_name"));
				userEntity.setEmail(rs.getString("email"));
				userEntity.setPassword(rs.getString("password"));
				userEntity.setRole(rs.getString("role"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return userEntity;
		
	}
}
