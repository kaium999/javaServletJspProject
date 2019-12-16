package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.PEvent;
import com.services.EventSeeDao;
@WebServlet("/PopulateEvent")
public class PopulateEvent extends HttpServlet {
	protected void doPost(HttpServletRequest request,HttpServletResponse response) {
		doGet(request,response);
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		List<PEvent>eventList=EventSeeDao.SeeEvent();
		
		/*try {
			PrintWriter out = response.getWriter();
			for(PEvent events : eventList) {
				out.println(events.getUser().getUser_name());
				out.println("event's name :"+events.getEvent_name());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		
		
		request.setAttribute("eventShow", eventList);
		RequestDispatcher rd=request.getRequestDispatcher("views/EventTablePopulate.jsp");
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
