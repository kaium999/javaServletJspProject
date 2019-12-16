package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.PEvent;
import com.services.UpdateEventDao;
@WebServlet("/updateEvent")
public class UpdateEvent extends HttpServlet {
	protected void doPost(HttpServletRequest request,HttpServletResponse response) {
		doGet(request,response);
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		int id=Integer.parseInt(request.getParameter("id"));
		String upeventName=request.getParameter("name");
		String upeventDepartment=request.getParameter("department");
		String upeventStartTime=request.getParameter("starttime");
		String upeventEndTime=request.getParameter("EndTime");
		String upeventDescription=request.getParameter("description");
		String upeventDate=request.getParameter("date");
		LocalDateTime datetime=LocalDateTime.now();
		PEvent NewEvent=new PEvent(id,upeventName,upeventDepartment,upeventStartTime,upeventEndTime,upeventDescription,upeventDate, datetime);
		UpdateEventDao.UpdateEvent(NewEvent);
		 try {
			response.sendRedirect("PopulateEvent");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
