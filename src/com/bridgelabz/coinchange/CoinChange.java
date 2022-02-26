package com.bridgelabz.coinchange;

public class CoinChange {

	public static void main(String[] args) {

		int[] currency = { 1, 5, 7 };
		int amount = 30;

		int minChange = minCoin(amount, currency);
		System.out.println("Min change required : " + minChange);
	}

	public static int minCoin(int amount, int[] coins) {
		if (amount == 0) {
			return 0;
		} else {
			int ans = Integer.MAX_VALUE;

			for (int i = 0; i < coins.length; i++) {
				int subAns = 0;
				if (amount - coins[i] >= 0) {
					subAns = minCoin(amount - coins[i], coins); // minCoin(1,{1,5,7});
					if (ans > subAns) {
						ans = subAns + 1;
					}
				}
			}
			System.out.println("For amount " + amount + " Answer is : " + ans);
			return ans;
		}
	}

}