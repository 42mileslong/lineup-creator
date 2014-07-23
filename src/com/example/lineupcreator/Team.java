package com.example.lineupcreator;

import java.util.ArrayList;

/**
 * All team information
 * 
 * @author Rafi
 */
public class Team {
	/**
	 * A set of players
	 */
	private ArrayList<Player> players = new ArrayList<Player>();
	
	/**
	 * Default constructor
	 * Takes no arguments
	 */
	public Team() {
		
	}
	
	/**
	 * Constructor
	 * @param players a list of players
	 */
	public Team(ArrayList<Player> players){
		this.players = players;
	}
	
	/**
	 * Returns the nth player
	 * @param n variable
	 * @return nth player
	 */
	public Player getPlayer(int n) {
		return players.get(n);
	}
	
	/**
	 * Adds the player to the players
	 * @param player the player to be added
	 */
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	/**
	 * Returns all players
	 * @return players in an array format
	 */
	public Player[] getPlayers() {
		return (Player[]) players.toArray();
	}
}
