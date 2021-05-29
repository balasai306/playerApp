package com.mindtree.playerRegistrationApp.model;

//Considering a player wants to resgister his identity for a team. 
//Player has the attributes like id, name, age, gender, team.
public class Player {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String team;

	public Player() {
	super();
	}

	public Player(int id, String name, int age, String gender, String team) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.team = team;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", team=" + team + "]";
	}

//	@Override
//	public int compareTo(Player player) {
//		if((this.name).equals(player.name) ) {
//			return 1;
//			
//		}
//		else {
//			return -1;
//		}
		
//	}

	
}
