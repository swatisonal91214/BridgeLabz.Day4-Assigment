package com.bl.snakeandladder;

public class SnakeAndLadderUC1UC2 {
	
	public static void main(String[] args) {
		final int DICE_START_RANGE = 1;
		final int DICE_END_RANGE = 6; 
		System.out.println("Welcome to Snake and Ladder GAME!!");
		System.out.println();
		System.out.println("Player is at initial position!!   Cast the dice to play the game!!!");
		System.out.println();
		int diceNumber = (int)Math.floor(Math.random()*DICE_END_RANGE+DICE_START_RANGE);
		System.out.println("The casted value is: " + diceNumber);
    }
}


