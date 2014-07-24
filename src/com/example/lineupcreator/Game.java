package com.example.lineupcreator;

/**
 * Controls all game information
 * All other classes get called through this one
 * 
 * @author Rafi
 */
public class Game {
	/**
	 * THE team
	 */
	private static Team team = new Team();
	
	/**
	 * THE quarters
	 */
	private static Quarter[] quarters = new Quarter[4];
	
	/**
	 * Initializes everything
	 */
	public static void init() {
		//initializes quarters
		quarters[0] = new Quarter(QuarterName.Q1);
		quarters[1] = new Quarter(QuarterName.Q2);
		quarters[2] = new Quarter(QuarterName.Q3);
		quarters[3] = new Quarter(QuarterName.Q4);
	}
	
	//TODO player creator / deleter (to team)
	public static void newPlayer(String name) {
		team.addPlayer(new Player(name));
	}
	
	public static void removePlayer(Player player) {
		team.deletePlayer(player);
	}
	
	//TODO position editor
}
