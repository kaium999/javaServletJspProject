package com.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


import com.entity.PEvent;
import com.entity.User;

public class EventSeeDao {
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
	public static List<PEvent> SeeEvent() {
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
	     String Showquery="select * from event order by event_time desc;";
	     List<PEvent> eventList = new ArrayList<PEvent>();
	     try {
			rs=statement.executeQuery(Showquery);
			while(rs.next()) {
				PEvent eventShow=new PEvent();
				int id=rs.getInt("id");
				String event_name=rs.getString("event_name");
				String event_department=rs.getString("event_department");
				//String UserName=rs.getString("useremail");
				String event_start=rs.getString("event_start_time");
				String event_end=rs.getString("event_end_time");
				String event_description=rs.getString("event_description");
				String event_date=rs.getString("event_date");
				String event_creator = rs.getString("event_creator");
				String user_mail=rs.getString("useremail");
				LocalDateTime date=rs.getTimestamp("event_time").toLocalDateTime();
				User users = new User();
				users.setUser_name(event_creator);
				users.setEmail(user_mail);
				eventShow.setId(id);
				eventShow.setEvent_name(event_name);
				eventShow.setDepartment_name(event_department);
				eventShow.setUser(users);
				eventShow.setStart_time(event_start);
				eventShow.setEnd_time(event_end);
				eventShow.setEvent_description(event_description);
				eventShow.setEvent_date(event_date);
				eventShow.setDatetime(date);
				eventShow.setEvent_creator(event_creator);
				eventList.add(eventShow);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     return eventList;
	    	
	}
	public static  List<PEvent> showMyEvents(String mail){
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
	     String Showquery="select * from event  where useremail ='"+mail+"' order by event_time desc;";
	     List<PEvent> eventList = new ArrayList<PEvent>();
	     try {
			rs=statement.executeQuery(Showquery);
			while(rs.next()) {
				PEvent eventShow=new PEvent();
				int id=rs.getInt("id");
				String event_name=rs.getString("event_name");
				String event_department=rs.getString("event_department");
				//String usermail=rs.getString("useremail");
				String event_start=rs.getString("event_start_time");
				String event_end=rs.getString("event_end_time");
				String event_description=rs.getString("event_description");
				String event_date=rs.getString("event_date");
				LocalDateTime date=rs.getTimestamp("event_time").toLocalDateTime();
				eventShow.setId(id);
				eventShow.setEvent_name(event_name);
				eventShow.setDepartment_name(event_department);
				//eventShow.setUser(usermail);
				eventShow.setStart_time(event_start);
				eventShow.setEnd_time(event_end);
				eventShow.setEvent_description(event_description);
				eventShow.setEvent_date(event_date);
				eventShow.setDatetime(date);
				
				eventList.add(eventShow);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     return eventList;
		
	}
	}
