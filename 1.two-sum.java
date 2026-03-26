/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=0;
        for( i = 0; i<nums.length; i++){
            if(nums.length < 2) {
                break;
            }else {
                for(j = i+1; j<nums.length; j++) {
                    if(nums[i]+nums[j]==target) {
                        return new int[]{i, j};
                        
                    }
                }
            }
        }
            

        return new int[]{};
    }
}
// @lc code=end

