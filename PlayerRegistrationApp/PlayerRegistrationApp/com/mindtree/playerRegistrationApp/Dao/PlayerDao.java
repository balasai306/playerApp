package com.mindtree.playerRegistrationApp.Dao;

import java.sql.SQLException;
import java.util.List;

import com.mindtree.playerRegistrationApp.exception.Myexception;
import com.mindtree.playerRegistrationApp.model.Player;

public interface PlayerDao {
	int registerPlayer(String name, int age, String gender, String team) throws Myexception;

	List<Player> displayPlayers() throws SQLException, Myexception;

}
