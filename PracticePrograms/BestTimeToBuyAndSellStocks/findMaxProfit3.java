/**
 * Say you have an array for which the ith element if the price of a given stock
 * on day i Design an algorithm to find the maximum profit You may complete at
 * most two transactions
 */

// If for each i, we know the max profit of one transaction before day i and
// another after day i,
// then we can solve this problem easily.
// So we use an array aux to record max profit of a transaction after day i
// Complexity: O(n) time and space

public class findMaxProfit3 {

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
