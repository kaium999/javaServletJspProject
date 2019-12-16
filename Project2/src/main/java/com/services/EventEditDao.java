package com.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.entity.PEvent;

public class EventEditDao {
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
	public static PEvent EditEvent(int id) {
		 String url = "jdbc:postgresql://localhost/BookInformation";
		 String driver = "org.postgresql.Driver";
	     String user = "postgres";
	     String password = "1234";
	     ResultSet rs = null;
		 Statement statement = null;
		 Connection connection = null;
		 PEvent pevent=new PEvent();
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
		 String EditQuery="select *from event where id='"+ id+ "'";
		 try {
			rs=statement.executeQuery(EditQuery);
			while(rs.next()) {
				pevent.setId(rs.getInt("id"));
				pevent.setEvent_name(rs.getString("event_name"));
				pevent.setDepartment_name(rs.getString("event_department"));
				pevent.setStart_time(rs.getString("event_start_time"));
				pevent.setEnd_time(rs.getString("event_end_time"));
				pevent.setEvent_description(rs.getString("event_description"));
				pevent.setEvent_date(rs.getString("event_date"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return pevent;
	}
}
