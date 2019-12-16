package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.User;
import com.services.SetSession;
@WebServlet("/setsession")
public class SessionSet extends HttpServlet {
	protected void doPost(HttpServletRequest request,HttpServletResponse response) {
		doGet(request,response);
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		String email = request.getParameter("email");
		SetSession set = new SetSession();
		User user = set.setsession(email);
		
		/*try {
			PrintWriter out = response.getWriter();
			out.println(user.getRole());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		HttpSession session = request.getSession();
		session.setAttribute("userName",user.getUser_name());
		//session.setAttribute("password", user.getPassword());
		session.setAttribute("Role", user.getRole());
		session.setAttribute("email", email);
		
		String role = (String) session.getAttribute("Role");
		if(role.equals("Admin")) {
			RequestDispatcher rd=request.getRequestDispatcher("views/welcome.jsp");
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
		else if(role.equals("Organizer")) {
			RequestDispatcher rd =request.getRequestDispatcher("views/OrganizerHomePage.jsp");
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
		else if(role.equals("User")){
			RequestDispatcher rd=request.getRequestDispatcher("SeeEventControl");
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
		else {
			RequestDispatcher rd=request.getRequestDispatcher("views/wrongPage.jsp");
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
}
