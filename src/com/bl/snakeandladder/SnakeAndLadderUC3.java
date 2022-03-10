package com.bl.snakeandladder;

public class SnakeAndLadderUC3 {
	public static void main(String[] args) {
		int position = 0;
	    final int DICE_START_RANGE = 1;
		final int DICE_END_RANGE = 6-DICE_START_RANGE;
		System.out.println("Welcome to Snake and Ladder GAME!!");
		System.out.println();
		int diceNumber = (int)Math.floor(Math.random()*DICE_END_RANGE) + DICE_START_RANGE;
		int option = (int) Math.floor(Math.random() *3);
		if (option == 0) {
			System.out.println("Player position is: " + position);
		} else if ( option == 1 ) {
			position = position + diceNumber;
			System.out.println("Player in Ladder position : " +position);
		} else if (option == 2) {
			position = diceNumber;
			System.out.println("Player is bitten by Snake so position will be 0.");
			System.out.println("Wait for your next turn !!! "); //  UC3 can't be implemented in this program because player position is 0
		}														// position will be negative if we subtract the dicenumber. 
	}															// The proper UC3 is applied in the next program where the complete game is played.
}																//Here it is just implemented in the point of option imagining that there is a snake at option 2.
	
	
