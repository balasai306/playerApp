package com.mindtree.playerRegistrationApp.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.mindtree.playerRegistrationApp.Dao.PlayerDao;
import com.mindtree.playerRegistrationApp.exception.Myexception;
import com.mindtree.playerRegistrationApp.model.Player;
import com.mindtree.playerRegistrationApp.utility.ClosingResources;
import com.mindtree.playerRegistrationApp.utility.Connector;

public class PlayerDaoImpl implements PlayerDao {

	Connector connection = new Connector();
	ClosingResources closingResource = new ClosingResources();

	@Override
	public int registerPlayer(String name, int age, String gender, String team) throws Myexception {
		final String SQL = "insert into player (name,age,gender,team) values(?,?,?,?)";
		Connection connect = null;
		PreparedStatement preparedStatement = null;
		int count = 0;
		try {
			connect = connection.getConnector();
			preparedStatement = connect.prepareStatement(SQL);
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, age);
			preparedStatement.setString(3, gender);
			preparedStatement.setString(4, team);
			count = preparedStatement.executeUpdate();
		
		} catch (Myexception | SQLException e) {
			throw new Myexception(" Exception occured while insertion of data");
		}
		finally {
			closingResource.closeConnection(preparedStatement);
			closingResource.closeConnection(connect);
		}
		return count;

	}

	
	@Override
	public List<Player> displayPlayers() throws Myexception  {
		final String SQL = "select * from player";
		Connection connect=null;
		Statement statement = null;
		ResultSet resultSet=null;
		List<Player> players=new LinkedList<Player>();
		
			try {
				connect = connection.getConnector();
				statement=connect.createStatement();
				resultSet=statement.executeQuery(SQL);
				while(resultSet.next()) {
					Player player=new Player();
					player.setId(resultSet.getInt(1));
					player.setName(resultSet.getString(2));
					player.setAge(resultSet.getInt(3));
					player.setGender(resultSet.getString(4));
					player.setTeam(resultSet.getString(5));
					players.add(player);
				}
				
				
				
			}catch (Myexception | SQLException e) {
				throw new Myexception(" Exception occured while fetching  of data");
			}
			finally {
				closingResource.closeConnection(resultSet);
				closingResource.closeConnection(statement);
				closingResource.closeConnection(connect);
			}
		
		
	return players;
	}
		

	}


