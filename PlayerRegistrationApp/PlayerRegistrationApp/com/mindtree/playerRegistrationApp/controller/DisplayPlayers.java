package com.mindtree.playerRegistrationApp.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindtree.playerRegistrationApp.exception.Myexception;
import com.mindtree.playerRegistrationApp.model.Player;
import com.mindtree.playerRegistrationApp.services.PlayerServices;
import com.mindtree.playerRegistrationApp.services.impl.PlayerServicesImpl;

/**
 * Servlet implementation class DisplayPlayers
 */
@WebServlet("/DisplayPlayers")
public class DisplayPlayers extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PlayerServices playerServices= new PlayerServicesImpl();
		try {
			List<Player> players=playerServices.displayPlayer();
			ListIterator li=players.listIterator();
			while(li.hasNext()) {
				System.out.println(li.next());
			}
		if(players!=null) {
			request.setAttribute("players", players);
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("/players.jsp");
			requestDispatcher.forward(request, response);
			
			
		}
		else {
			System.out.println("no players data");
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Myexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
