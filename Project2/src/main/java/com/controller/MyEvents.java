package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.PEvent;
import com.services.EventSeeDao;
@WebServlet("/myevents")
public class MyEvents extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String mail = (String) session.getAttribute("email");	
		EventSeeDao event =new EventSeeDao();
		List<PEvent> eventlist = event.showMyEvents(mail);
		request.setAttribute("eventlist", eventlist);
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/myOwnEventSee.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	
}
