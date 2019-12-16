package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.PEvent;
import com.services.EventSeeDao;
import com.services.SearchDateDao;
@WebServlet("/search")
public class SearchEvent extends HttpServlet {
	protected void doPost(HttpServletRequest request,HttpServletResponse response) {
		doGet(request,response);
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		String event_date=request.getParameter("date_event");
		PEvent event = new PEvent();
		event.setEvent_date(event_date);
		List<PEvent>eventList=SearchDateDao.searchDate(event.getEvent_date());
		request.setAttribute("eventShow", eventList);
		RequestDispatcher rd=request.getRequestDispatcher("/views/EventSearch.jsp");
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
