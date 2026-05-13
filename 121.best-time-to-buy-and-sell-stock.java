/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int[] days = prices;

        int minPrice = prices[0];
        
        int profit = 0;

        int maxProfit = 0;

        for(int i=0; i<days.length; i++) {

            minPrice = Math.min(days[i], minPrice);
            profit = days[i] - minPrice;

            maxProfit = Math.max(profit, maxProfit);

        }


        return maxProfit;
    }
}
// @lc code=end

