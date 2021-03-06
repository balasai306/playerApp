package com.mindtree.playerRegistrationApp.services.impl;

import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.taglibs.standard.tag.common.core.ForEachSupport;

import com.mindtree.playerRegistrationApp.Dao.PlayerDao;
import com.mindtree.playerRegistrationApp.Dao.Impl.PlayerDaoImpl;
import com.mindtree.playerRegistrationApp.exception.Myexception;
import com.mindtree.playerRegistrationApp.model.Player;
import com.mindtree.playerRegistrationApp.services.PlayerServices;

public class PlayerServicesImpl implements PlayerServices {

	PlayerDao playerDao = new PlayerDaoImpl();

	@Override
	public int registerPlayer(String name, int age, String gender, String team) throws Myexception {
		return playerDao.registerPlayer(name, age, gender, team);

	}

	@Override
	public List<Player> displayPlayer() throws Myexception {
		// TODO Auto-generated method stub
		List<Player> players;
		try {
			players = playerDao.displayPlayers();
		} catch (SQLException | Myexception e) {
			// TODO Auto-generated catch block
			throw new Myexception("error in services");

		}
		List<Player> playersSorted = sort(players);
		return playersSorted;

	}

	private List<Player> sort(List<Player> players) {
		Collections.sort(players, new Comparator<Player>() {

			@Override
			public int compare(Player player1, Player player2) {
				if ((player1.getTeam()).compareTo(player2.getTeam()) > 0) {
					return 1;
				} else if ((player1.getTeam()).compareTo(player2.getTeam()) == 0) {
					if (player1.getName().compareTo(player2.getName()) > 0) {
						return 1;
					} else {
						return -1;
					}

				}

				else {
					return -1;
				}

			}

		});

		return players;

	}

	
}
