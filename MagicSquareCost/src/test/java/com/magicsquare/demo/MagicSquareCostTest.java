package com.magicsquare.demo;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MagicSquareCostTest {

	List<Integer[]> possibleMagicSquaresList;
	MagicSquareCostServiceImpl magicSqCostServiceImpl;
	MagicSquareServiceImpl magicSqServiceImpl;

	/*
	 * Set up a data
	 */
	@BeforeEach
	public void setUp() {
		magicSqCostServiceImpl = new MagicSquareCostServiceImpl();
		magicSqServiceImpl = new MagicSquareServiceImpl();
		possibleMagicSquaresList = magicSqServiceImpl.getAllPossibleMagicSqList();
	}

	/*
	 * Test if possible magic square list is not null
	 */
	@Test
	public void isNotNull() {
		assertNotNull(possibleMagicSquaresList);
	}

	/*
	 * Test when minimal cost of input matrix is correct.
	 */
	@Test
	public void testCorrectMinimalCost() {
		int[][] arr = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 9 } };
		int cost = 3;
		assertEquals(magicSqCostServiceImpl.findMinimalCost(possibleMagicSquaresList, arr), cost);
	}

	/*
	 * Test when minimal cost of input matrix is incorrect.
	 */
	@Test
	public void testInCorrectMinimalCost() {
		int[][] arr = { { 8, 1, 6 }, { 3, 8, 7 }, { 4, 9, 2 } };
		int cost = 7;
		assertNotEquals(magicSqCostServiceImpl.findMinimalCost(possibleMagicSquaresList, arr), cost);
	}

	/*
	 * Test when matrix input is correct within range of 1 to 9.
	 */
	@Test
	public void testCorrectIntegerInput() {
		Scanner s = new Scanner("8 1 6 3 8 7 4 9 2");
		assertDoesNotThrow(() -> {
			magicSqServiceImpl.createInputMatrix(s);
		});
	}

	/*
	 * Test when matrix input is not an integer
	 */
	@Test
	public void testInCorrectCharacterInput() {
		Scanner s = new Scanner("a 4 9 d 3 5 ( 8 1");
		assertThrows(InputMismatchException.class, () -> {
			magicSqServiceImpl.createInputMatrix(s);
		});
	}

	/*
	 * Test when matrix input is not in the range of 1 to 9 digit
	 */
	@Test
	public void testInCorrectIntgerInput() {
		Scanner s = new Scanner("12 4 9 2 3 5 7 18 10");
		assertThrows(InputMismatchException.class, () -> {
			magicSqServiceImpl.createInputMatrix(s);
		});
	}
}
