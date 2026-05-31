/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []a = new int[nums.length];
        
        int prefix = 1;
        //i가 0일때 a[0] = 1  
        for (int i = 0; i < nums.length; i++) {
            a[i] = prefix;
            prefix *= nums[i];
        }
        
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            a[i] *= suffix;
            suffix *= nums[i];
        }
        return a;
    }
}
// @lc code=end

