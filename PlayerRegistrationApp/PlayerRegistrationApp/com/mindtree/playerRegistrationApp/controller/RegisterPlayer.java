package com.mindtree.playerRegistrationApp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindtree.playerRegistrationApp.exception.Myexception;
import com.mindtree.playerRegistrationApp.services.PlayerServices;
import com.mindtree.playerRegistrationApp.services.impl.PlayerServicesImpl;

/**
 * Servlet implementation class RegisterPlayer
 */
@WebServlet("/RegisterPlayer")
public class RegisterPlayer extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		String team=request.getParameter("team");
		int count=0;
		PlayerServices playerServices= new PlayerServicesImpl();
		try {
		count=	playerServices.registerPlayer(name,age,gender,team);
		if(count>0) {
			response.sendRedirect("sucessMessage.html");
		}
		else {
			response.sendRedirect("failureMessage.html");
		}
		} catch (Myexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
