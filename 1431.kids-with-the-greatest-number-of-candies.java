/*
 * @lc app=leetcode id=1431 lang=java
 *
 * [1431] Kids With the Greatest Number of Candies
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;

        List<Boolean> bc = new ArrayList<>();

        for(int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        for(int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies >= max) {
                bc.add(true);
            }else {
                bc.add(false);
            }
        }
        return bc;

    }
}
// @lc code=end

