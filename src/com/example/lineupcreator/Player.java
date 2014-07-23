package com.example.lineupcreator;

/**
 * Individual player information
 * 
 * @author Rafi
 *
 */
public class Player {
	/**
	 * The player's name
	 */
	private String name;

	/**
	 * Default constructor
	 * 
	 * @param name player name
	 */
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
