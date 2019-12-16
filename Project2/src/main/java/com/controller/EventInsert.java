package com.controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.PEvent;
import com.entity.User;
import com.services.EventCreateDao;
@WebServlet("/eventInsertControl")
public class EventInsert extends HttpServlet {
	protected void doPost(HttpServletRequest request,HttpServletResponse response) {
		doGet(request,response);
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		HttpSession session = request.getSession();
		String mail = (String) session.getAttribute("email");
		String event_name=request.getParameter("event_name");
		String event_department=request.getParameter("event_department");
		String event_Start_time=request.getParameter("start_time");
		String event_end_time=request.getParameter("end_time");
		String event_description=request.getParameter("event_description");
		String event_date=request.getParameter("event_date");
		String event_creator = (String) session.getAttribute("userName");
		LocalDateTime datetime=LocalDateTime.now();
		User user = new User();
		user.setEmail(mail);
		user.setUser_name(event_creator);
		//dao class ta koi
		PEvent event=new PEvent();
		event.setEvent_name(event_name);
		event.setDepartment_name(event_department);
		event.setStart_time(event_Start_time);
		event.setEnd_time(event_end_time);
		event.setEvent_description(event_description);
		event.setEvent_date(event_date);
		event.setDatetime(datetime);
		event.setUser(user);
		EventCreateDao eventCreate=new EventCreateDao();
		eventCreate.insertEvent(event);
		RequestDispatcher rd=request.getRequestDispatcher("/views/EventSuccess.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
