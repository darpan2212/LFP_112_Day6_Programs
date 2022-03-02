package com.bridgelabz.coinchange;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class CoinChangeTest {

	@Test
	public void minCoin5() {
		int amount = 51;
		int expectedOp = 9;
		int ds[] = new int[amount + 1];
		Arrays.fill(ds, -1);
		
		assertEquals(expectedOp, CoinChange.minCoin(amount, new int[] { 1, 5, 7 }, ds));
	}
}