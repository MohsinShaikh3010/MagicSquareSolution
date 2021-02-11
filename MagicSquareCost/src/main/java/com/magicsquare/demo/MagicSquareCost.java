package com.magicsquare.demo;

import java.util.List;
import java.util.Scanner;

public class MagicSquareCost {

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] inputSquare = new int[3][3];
		boolean isNumericRange = true;
		
		MagicSquareServiceImpl magicSqServiceImpl = new MagicSquareServiceImpl();
		MagicSquareCostServiceImpl magicSqCostServiceImpl = new MagicSquareCostServiceImpl();
		try {
			Scanner in = new Scanner(System.in);
			inputSquare = magicSqServiceImpl.createInputMatrix(in);
		} catch (Exception e) {
			isNumericRange = false;
		}

		if (isNumericRange) {// If input is numeric range from 1 to 9 then proceed to find minimal cost.
			List<Integer[]> possibleMagicSquaresList = magicSqServiceImpl.getAllPossibleMagicSqList();
			int cost = magicSqCostServiceImpl.findMinimalCost(possibleMagicSquaresList, inputSquare);
			if (cost == 0) {
				System.out.println("Cost of the change is 0. It is a Magic Square");
			} else {
				System.out.println("Minimal Cost for converting Input Square to a Magic Square is: " + cost);
			}
		} else {
			System.out.println("Enter the value in between digit 1 to 9 only");
		}
	}

}
