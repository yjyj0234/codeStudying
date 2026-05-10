/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
       int[] a = new int[nums.length];
       int left = 0;
       int right = nums.length-1;
       int idx = nums.length-1;
   
       //Math.abs = 수의 절댓값
        while (left <= right) {
            if(Math.abs(nums[left])<Math.abs(nums[right])){
                a[idx] = nums[right] * nums[right];
                idx--;
                right--;
                
            }else {
                a[idx] = nums[left] * nums[left];
                idx--;
                left++;

            }
            
        }
        
       return a;

    }
}
// @lc code=end

