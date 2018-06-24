package BestTimeToBuyAndSellStocks;

/**
 * Say you have an array for which the ith element is the price of a given stock
 * on day i If you were only permitted to complete at most one transaction i.e.
 * by one and sell one share of the stock design an algorithm to find the
 * maximum profit
 */

// Complexity: constant space, O(n) time
// need to maximize prices[j] - prices[i] with j > i
// but we can use a variable to store the lowest price before day j

public class findMaxProfit {

	public static void main(String[] args) {

		int[] prices = { 10, 20, 15, 30, 25, 50, 40 };

		System.out.println("Maximum profit could be: " + maxProfit(prices));

	}

	public static int maxProfit(int[] prices) {

		if (prices == null || prices.length == 0) {

			return 0;
		}

		int profit = 0;
		int lowest = prices[0];

		for (int i = 1; i < prices.length; i++) {

			if (prices[i] < lowest) {
				lowest = prices[i];
			}

			if (profit < (prices[i] - lowest)) {
				profit = prices[i] - lowest;
			}
		}

		return profit;

	}

}
