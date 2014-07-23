package com.example.lineupcreator;

import java.util.ArrayList;

/**
 * Individual player information
 * 
 * @author Rafi
 */
public class Player {	
	/**
	 * The player's name
	 */
	private String name;
	
	/**
	 * An ArrayList of the quarters the player is in the game
	 */
	private ArrayList<Quarter> quartersInGame = new ArrayList<Quarter>();

	/**
	 * Default constructor
	 * 
	 * @param name player name
	 */
	public Player(String name) {
		this.name = name;
	}

	/**
	 * Returns the player's name
	 * @return the player's name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Adds a quarter to the player's list
	 * @param quarter the quarter to be added
	 */
	public void addQuarter(Quarter quarter) {
		this.quartersInGame.add(quarter);
	}
	
	/**
	 * Returns all quarters the player is in
	 * @return the quarters the player is in
	 */
	public Quarter[] getQuarters() {
		return (Quarter[]) quartersInGame.toArray();
	}
}
