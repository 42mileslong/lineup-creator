package com.example.lineupcreator;

/**
 * A single position on the field
 * 
 * @author Rafi
 */
public class Position {
	/**
	 * The player playing the position
	 */
	private Player positionPlayer = null;
	
	/**
	 * Default constructor
	 */
	private Position() {
		
	}

	/**
	 * Default getter
	 * @return player
	 */
	public Player getPositionPlayer() {
		return positionPlayer;
	}

	/**
	 * Default setter
	 * @param player the player to be set
	 */
	public void setPositionPlayer(Player player) {
		this.positionPlayer = player;
	}
}
