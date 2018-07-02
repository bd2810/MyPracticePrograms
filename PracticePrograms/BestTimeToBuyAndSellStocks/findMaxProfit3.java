package BestTimeToBuyAndSellStocks;

import java.util.Arrays;

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
		//System.out.println("Maximum profit 2 could be: " + maxProfit2(prices));
		//System.out.println("Maximum profit 3 could be: " + maxProfit3(prices));

	}

	// If for each i, we know the max profit of one transaction before day i and another after day i,
	// then we can solve this problem easily.
	// So we use an array aux to record max profit of a transaction after day i
	// Complexity: O(n) time and space
	public static int maxProfit(int[] prices) {
		
        if (prices == null || prices.length < 2) {			// If length is less than 2, than no transactions could occur
        	
        	return 0;
        }
        
        int n = prices.length;
        int[] aux = new int[n];
        int highest = prices[n-1];		// Let's assume the highest price in array is the last day price
        int lowest = prices[0]; 		// let's assume the lowest price in array is the first day price
        int profit = 0;					// Initially profit is 0
        
        // Build aux array by calculating profit of each day starting from last day transacting the price of that day from highest price
        
        for (int i = n - 1; i >= 0; i--) {		
        	
            if (profit < highest - prices[i]) {
            	
            	profit = highest - prices[i];		// Update 'profit' i.e. highest value from single transaction so far
            }
            
            aux[i] = profit;			// Update that day's max profit if the buy happened on or after that day
            
            if (highest < prices[i]) {
            	
            	highest = prices[i];		// Update highest stock price comparing it with previous highest
            }
        }
        
        System.out.println("aux[] is: " + Arrays.toString(aux));
        
        // for each i, find max profit
        for (int i = 0; i < n; i++) {
        	
            if (profit < aux[i] + prices[i] - lowest) {
            	
            	profit = aux[i] + prices[i] - lowest; 	// Total profit is: Transaction 1: Highest profit that could happen if the buy occurred on or after that
            											// day + Transac 2: That day's price minus lowest stock price
            }
            
            if (lowest > prices[i]) {
            	
            	lowest = prices[i];			// Update lowest stock price comparing it with previous lowest
            }
        }
        
        return profit;
    }
	
	public static int maxProfit2(int[] prices) {  
        int hold1 = Integer.MIN_VALUE, hold2 = Integer.MIN_VALUE;
        System.out.println(hold1);
        int release1 = 0, release2 = 0;
        for(int i:prices){                              // Assume we only have 0 money at first
            release2 = Math.max(release2, hold2+i);     // The maximum if we've just sold 2nd stock so far.
            hold2    = Math.max(hold2,    release1-i);  // The maximum if we've just buy  2nd stock so far.
            release1 = Math.max(release1, hold1+i);     // The maximum if we've just sold 1nd stock so far.
            hold1    = Math.max(hold1,    -i);          // The maximum if we've just buy  1st stock so far. 
        }
        return release2; ///Since release1 is initiated as 0, so release2 will always higher than release1.
    }
	
	public static int maxProfit3(int[] prices) {
        int buyOne = Integer.MAX_VALUE;
        int SellOne = 0;
        int buyTwo = Integer.MAX_VALUE;
        int SellTwo = 0;
        for(int p : prices) {
            buyOne = Math.min(buyOne, p);
            System.out.println("buyOne is: "+buyOne);
            
            SellOne = Math.max(SellOne, p - buyOne);
            System.out.println("SellOne is: "+SellOne);
            
            buyTwo = Math.min(buyTwo, p - SellOne);
            System.out.println("buyTwo is: "+buyTwo);
            
            SellTwo = Math.max(SellTwo, p - buyTwo);
            System.out.println("SellTwo is: "+SellTwo);
            
            System.out.println("");
            System.out.println("#####################");
            System.out.println("");
        }
        return SellTwo;
    }

}
