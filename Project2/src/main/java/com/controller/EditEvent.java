package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.PEvent;
import com.services.EventEditDao;
@WebServlet("/edit")
public class EditEvent extends HttpServlet {
	protected void doPost(HttpServletRequest request,HttpServletResponse response) {
		doGet(request,response);
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		int id=Integer.parseInt(request.getParameter("id"));
		PEvent exisEvent=EventEditDao.EditEvent(id);
		request.setAttribute("event", exisEvent);
		RequestDispatcher rd=request.getRequestDispatcher("/views/EventEditForm.jsp");
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
// eita ui te ektu edit kor