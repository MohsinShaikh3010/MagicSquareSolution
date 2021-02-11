package com.magicsquare.demo;

import java.util.List;

public interface MagicaSquareCostService {

	/**
	 * This method is used to find the minimal cost to convert Input Square to Magic Square
	 * 
	 */
	public int findMinimalCost(List<Integer[]> list, int[][] square);

}
