package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.User;
import com.services.ConnectionDao;
@WebServlet("/signTwo")
public class SignUpTwo extends HttpServlet {
	protected void doPost(HttpServletRequest request,HttpServletResponse response) {
		doGet(request,response);
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		String userFirstName=request.getParameter("Fname");
		String userLastName=request.getParameter("Lname");
		String userName=request.getParameter("uname");
		String useremail=request.getParameter("email");
		String userpassword=request.getParameter("password");
		String userRole=request.getParameter("role");
		User userOne=new User();
		userOne.setFirst_name(userFirstName);
		userOne.setLast_name(userLastName);
		userOne.setUser_name(userName);
		userOne.setEmail(useremail);
		userOne.setPassword(userpassword);
		userOne.setRole(userRole);
		ConnectionDao connection=new ConnectionDao();
		connection.insertUser(userOne);
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
