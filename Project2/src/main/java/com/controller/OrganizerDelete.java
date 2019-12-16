package com.controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.entity.PEvent;
import com.services.DeleteEventDao;
@WebServlet("/orgaDelete")
public class OrganizerDelete extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response) {
		doGet(request,response);
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		int id=Integer.parseInt(request.getParameter("id"));
	    PEvent event=new PEvent();
		event.setId(id);
		DeleteEventDao.DeleteBook(event);
		try {
			response.sendRedirect("myevents");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
