package com.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.entity.User;

public class ConnectionDao {
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
	public static void insertUser(User UserOne) {
		
		 ResultSet rs = null;
		 Statement statement = null;
		 Connection connection = null;
		 
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
	     connection = getconection();
	     try {
			statement=connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			String insert_query="insert into usertable(first_name,last_name,user_name,email,password,role)values('"+UserOne.getFirst_name()+"','"+UserOne.getLast_name()+"','"+UserOne.getUser_name()+"','"+UserOne.getEmail()+"','"+UserOne.getPassword()+"','"+UserOne.getRole()+"')";
			try {
				statement.executeUpdate(insert_query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
