package com.magicsquare.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MagicSquareServiceImpl implements MagicSquareService {
	
	/**
	 * This method is used to create user input for 3*3 matrix
	 * 
	 * @param input    - User input
	 * @return int[][] - 2D array
	 */
	
	public int[][] createInputMatrix(Scanner in) {		
		int[][] inputSquare = new int[3][3];
		int input;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				input = in.nextInt();
				// Check if user input is in between 1 to 9 digit only
				if (input >= 1 && input <= 9) {
					inputSquare[i][j] = input;
				} else {
					throw new InputMismatchException();
				}
			}
		}
		return inputSquare;
	}
}
