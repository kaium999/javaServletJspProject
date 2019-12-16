package com.entity;

import java.time.LocalDateTime;

public class PEvent {
	private int id;
	private String Event_name;
	private String Department_name;
	private String Start_time;
	private String end_time;
	private String event_description;
	private String event_date;
	private LocalDateTime datetime;
	private User user;
	private String event_creator;
	public PEvent(User user) {
		super();
		this.user = user;
	}
	
	public PEvent(String event_name, String department_name, String start_time, String end_time,
			String event_description, String event_date, LocalDateTime datetime, User user, String event_creator) {
		super();
		Event_name = event_name;
		Department_name = department_name;
		Start_time = start_time;
		this.end_time = end_time;
		this.event_description = event_description;
		this.event_date = event_date;
		this.datetime = datetime;
		this.user = user;
		this.event_creator = event_creator;
	}

	public PEvent(int id, String event_name, String department_name, String start_time, String end_time,
			String event_description,String event_date, LocalDateTime datetime) {
		super();
		this.id = id;
		Event_name = event_name;
		Department_name = department_name;
		Start_time = start_time;
		this.end_time = end_time;
		this.event_description = event_description;
		this.event_date=event_date;
		this.datetime = datetime;
	}
	
	public PEvent(int id, String event_name, String department_name, String start_time, String end_time,
			String event_description, String event_date, LocalDateTime datetime, User user, String event_creator) {
		super();
		this.id = id;
		Event_name = event_name;
		Department_name = department_name;
		Start_time = start_time;
		this.end_time = end_time;
		this.event_description = event_description;
		this.event_date = event_date;
		this.datetime = datetime;
		this.user = user;
		this.event_creator = event_creator;
	}
	public PEvent(String event_name, String department_name, String start_time, String end_time,
			String event_description,String event_date, LocalDateTime datetime) {
		super();
		Event_name = event_name;
		Department_name = department_name;
		Start_time = start_time;
		this.end_time = end_time;
		this.event_description = event_description;
		this.event_date=event_date;
		this.datetime = datetime;
	}
	public PEvent(int id, String event_name, String department_name, String start_time, String end_time,
			String event_description,String event_date) {
		super();
		this.id = id;
		Event_name = event_name;
		Department_name = department_name;
		Start_time = start_time;
		this.end_time = end_time;
		this.event_date=event_date;
		this.event_description = event_description;
	}
	public PEvent(String event_name, String department_name, String start_time, String end_time,
			String event_description,String event_date) {
		super();
		Event_name = event_name;
		Department_name = department_name;
		Start_time = start_time;
		this.end_time = end_time;
		this.event_description = event_description;
		this.event_date=event_date;
	}
	public PEvent(String event_date) {
		super();
		this.event_date = event_date;
	}
	
	public PEvent(int id) {
		super();
		this.id = id;
	}
	public PEvent() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEvent_name() {
		return Event_name;
	}
	public void setEvent_name(String event_name) {
		Event_name = event_name;
	}
	public String getDepartment_name() {
		return Department_name;
	}
	public void setDepartment_name(String department_name) {
		Department_name = department_name;
	}
	public String getStart_time() {
		return Start_time;
	}
	public void setStart_time(String start_time) {
		Start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getEvent_description() {
		return event_description;
	}
	public void setEvent_description(String event_description) {
		this.event_description = event_description;
	}
	public String getEvent_date() {
		return event_date;
	}
	public void setEvent_date(String event_date) {
		this.event_date=event_date;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User userName) {
		this.user = userName;
	}
	public void setUser(String userName) {
		// TODO Auto-generated method stub
		
	}
	public String getEvent_creator() {
		return event_creator;
	}
	public void setEvent_creator(String event_creator) {
		this.event_creator = event_creator;
	}
	
	
	
	
}
