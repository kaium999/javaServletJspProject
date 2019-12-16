package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.services.LoginDao;
@WebServlet("/login")
public class LogIn extends HttpServlet {
	protected void doPost(HttpServletRequest request,HttpServletResponse response) {
		doGet(request,response);
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		//String  id=request.getParameter(id).toString();
		//String Name=request.getParameter("FName");
		//String LName=request.getParameter("lname");
		String email=request.getParameter("email");
		String Password=request.getParameter("password");
		//String Role=request.getParameter("role");
		request.setAttribute("email", email);
		if(LoginDao.validate(email, Password)) {
		RequestDispatcher rd=request.getRequestDispatcher("setsession");
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
			RequestDispatcher rd=request.getRequestDispatcher("/views/Home.jsp");
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
