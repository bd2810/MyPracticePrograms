/**
 * First, I wanna know how much money I could have made yesterday if I'd been
 * trading Apple stocks all day.
 * 
 * So I grabbed Apple's stock prices from yesterday and put them in an array
 * called stockPrices, where:
 * 
 * The indices are the time (in minutes) past trade opening time, which was
 * 9:30am local time. The values are the price (in US dollars) of one share of
 * Apple stock at that time. So if the stock cost $500 at 10:30am, that means
 * stockPrices[60] = 500.
 * 
 * Write an efficient method that takes stockPrices and returns the best profit
 * I could have made from one purchase and one sale of one share of Apple stock
 * yesterday.
 * 
 * For example:
 * 
 * int[] stockPrices = new int[] {10, 7, 5, 8, 11, 9};
 * 
 * getMaxProfit(stockPrices); // returns 6 (buying for $5 and selling for $11)
 * 
 * No "shorting"—you need to buy before you can sell. Also, you can't buy and
 * sell in the same time step—at least 1 minute has to pass.
 */

public class findMaxProfit4 {

	public static int maxProfit(int[] prices) {

		if (prices == null || prices.length == 0) {

			return 0;
		}

		int profit = 0;
		int lowest = prices[0];

		// Below we are considering active trading hours are 9.30 am to 4 PM
		// i.e. 390 minutes.
		// So we will check prices at every minute until 4 PM to get the maximum
		// profit.
		for (int i = 1; i < 390; i++) {

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
