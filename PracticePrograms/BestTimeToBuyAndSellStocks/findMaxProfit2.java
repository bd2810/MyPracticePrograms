package BestTimeToBuyAndSellStocks;

/**
 * Say you have an array for which the ith elements is the price of a given
 * stock on day i Design an algorithm to find the maximum profit You may
 * complete as many transactions as you like However, you may not engate in
 * multiple transactions at the same time i.e, you have to sell the stock before
 * you buy again
 */

// Complexity: constant space, O(n) time
// just make a transaction whenever there is profit

public class findMaxProfit2 {

	public static void main(String[] args) {

		int[] prices = { 10, 20, 15, 30, 25, 50, 40 };

		System.out.println("Maximum profit could be: " + maxProfit(prices));

	}

	public static int maxProfit(int[] prices) {

		if (prices == null || prices.length == 0) {

			return 0;
		}

		int profit = 0;

		for (int i = 0; i < prices.length - 1; i++) {

			if (prices[i] < prices[i + 1]) {

				profit += prices[i + 1] - prices[i];
			}
		}

		return profit;

	}

}
