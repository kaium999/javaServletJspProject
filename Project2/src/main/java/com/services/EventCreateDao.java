package com.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.entity.PEvent;



public class EventCreateDao {
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
	public static void insertEvent(PEvent event) {
		
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

			String insert_query="insert into event(event_name,event_department,event_start_time,event_end_time,event_description,event_time,event_date,useremail,event_creator)values('"+event.getEvent_name()+"','"+event.getDepartment_name()+"','"+event.getStart_time()+"','"+event.getEnd_time()+"','"+event.getEvent_description()+"','"+event.getDatetime()+"','"+event.getEvent_date()+"','"+event.getUser().getEmail()+"','"+event.getUser().getUser_name()+"')";
			try {
				statement.executeUpdate(insert_query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
