/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        //배열 앞쪽으로 중복되는 숫자 없이 정렬 ex) [1,1,2,2,3] -> [1,2,3,1,2]

        int slow = 0;
        int fast = 1;

        while (fast <= nums.length-1 && slow <= nums.length-1) {
            if(nums[slow] == nums[fast]) {
                fast++;
            }else {
                nums[slow+1] = nums[fast];
                slow++;
            }
        }
        return slow+1;
    }
}
// @lc code=end

