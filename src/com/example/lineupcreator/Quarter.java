package com.example.lineupcreator;

import java.util.ArrayList;

/**
 * Various quarters
 * 
 * @author Rafi
 */
enum QuarterName{
	Q1, Q2, Q3, Q4;
}

/**
 * The field with containing all playing players
 * 
 * @author Rafi
 */
public class Quarter {
	/**
	 * The name of the quarter
	 */
	private QuarterName quarter;
	
	/**
	 * The players in various positions
	 */
	private ArrayList<ArrayList<Position>> field = new ArrayList<ArrayList<Position>>();
	
	/**
	 * Default constructor
	 */
	public Quarter(QuarterName quarter) {
		this.quarter = quarter;
	}
	
	/**
	 * Adds the player to a position
	 * @param player the player to be added
	 * @param row the row the player is in (top to bottom)
	 * @param column the column the player is in (left to right)
	 */
	public void setPlayer(Player player, int row, int column) {
		field.get(row).get(column).setPositionPlayer(player);
		player.addQuarter(quarter);
	}
	
	/**
	 * Gets a player from a position
	 * @param row 
	 * @param column
	 * @return
	 */
	public Player getPlayer(int row, int column) {
		return field.get(row).get(column).getPositionPlayer();
	}
}
