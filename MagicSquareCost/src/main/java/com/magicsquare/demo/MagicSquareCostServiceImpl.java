package com.magicsquare.demo;

import java.util.List;
import java.util.stream.IntStream;

public class MagicSquareCostServiceImpl implements MagicaSquareCostService {

	
	/**
	 * This method is used to find the minimal cost to convert Input Square to Magic
	 * Square.
	 * 
	 * @param list   - List of possible Magic Square Integer array
	 * @param square - Input array
	 * @return int   - Minimal cost 
	 */
	@Override
	public int findMinimalCost(List<Integer[]> list, int[][] square) {
		Integer[] magicSqArray = IntStream.range(0, 3).flatMap(i -> IntStream.range(0, 3).map(j -> square[i][j])).boxed()
				.toArray(Integer[]::new);
		// Find the minimal cost to convert input square to Magic Square
		int minimalCost = list.stream().mapToInt(t -> {
			return IntStream.range(0, 9).map(i -> Math.abs(magicSqArray[i] - t[i])).sum();
		}).min().orElse(0);
		return minimalCost;
	}

}
