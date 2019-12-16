package com.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.entity.PEvent;

public class UpdateEventDao {
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
	public static void UpdateEvent(PEvent upevent) {
		 String url = "jdbc:postgresql://localhost/BookInformation";
		 String driver = "org.postgresql.Driver";
	     String user = "postgres";
	     String password = "1234";
	     ResultSet rs = null;
		 Statement statement = null;
		 Connection connection = null;
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
		String updateQuery="update event set event_name='"+upevent.getEvent_name()+"',event_department='"+upevent.getDepartment_name()+"',event_start_time='"+upevent.getStart_time()+"',event_end_time='"+upevent.getEnd_time()+"',event_description='"+upevent.getEvent_description()+"',event_time='"+upevent.getDatetime()+"',event_date='"+upevent.getEvent_date()+"' where id='"+upevent.getId()+"';";
		try {
			statement.executeUpdate(updateQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
