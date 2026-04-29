/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;

        while (fast <= nums.length-1) {
            
            if(nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }else {
                
                fast++;
            }
            
        }
        return slow;
        
    }
}
// @lc code=end

