package com.example.lineupcreator;

import java.util.ArrayList;

import com.example.lineupcreator.Quarter.QuarterName;

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
	private ArrayList<QuarterName> quartersInGame = new ArrayList<QuarterName>();

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
	 * Returns all quarters the player is in
	 * @return the quarters the player is in
	 */
	public Quarter[] getQuarters() {
		return (Quarter[]) quartersInGame.toArray();
	}

	/**
	 * Adds a quarter to their list of quarters
	 * @param quarter the quarter to be added
	 */
	public void addQuarter(QuarterName quarter) {
		quartersInGame.add(quarter);
	}
}
