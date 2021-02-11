package com.magicsquare.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface MagicSquareService {

	/**
	 * This method is used to get all possible combination list for 3*3 matrix
	 * 
	 * @param
	 * @return List<Integer[]> - List of all possible Magic Square combination
	 */
	public default List<Integer[]> getAllPossibleMagicSqList() {
		List<Integer[]> possibleMagicSqList = new ArrayList<>();
		possibleMagicSqList.add(new Integer[] { 8, 1, 6, 3, 5, 7, 4, 9, 2 });
		possibleMagicSqList.add(new Integer[] { 6, 1, 8, 7, 5, 3, 2, 9, 4 });
		possibleMagicSqList.add(new Integer[] { 4, 9, 2, 3, 5, 7, 8, 1, 6 });
		possibleMagicSqList.add(new Integer[] { 2, 9, 4, 7, 5, 3, 6, 1, 8 });
		possibleMagicSqList.add(new Integer[] { 8, 3, 4, 1, 5, 9, 6, 7, 2 });
		possibleMagicSqList.add(new Integer[] { 4, 3, 8, 9, 5, 1, 2, 7, 6 });
		possibleMagicSqList.add(new Integer[] { 6, 7, 2, 1, 5, 9, 8, 3, 4 });
		possibleMagicSqList.add(new Integer[] { 2, 7, 6, 9, 5, 1, 4, 3, 8 });
		return possibleMagicSqList;
	}

	/**
	 * This method is used to create user input for 3*3 matrix
	 */
	public int[][] createInputMatrix(Scanner input);
}
