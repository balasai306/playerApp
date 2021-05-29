package com.mindtree.playerRegistrationApp.services;

import java.sql.SQLException;
import java.util.List;

import com.mindtree.playerRegistrationApp.exception.Myexception;
import com.mindtree.playerRegistrationApp.model.Player;

public interface PlayerServices {
	int registerPlayer(String name, int age, String gender, String team) throws Myexception;

	List<Player> displayPlayer() throws SQLException, Myexception;
}
