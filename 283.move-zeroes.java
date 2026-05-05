/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        while (i < nums.length && j<nums.length) {
            if (nums[j]!=0) {
              nums[i] = nums[j];
              i++;
              j++; // j 가 1에서 nums[0] = nums[1] i =1 j= 2 ,/j =3에서 i=1일때 j=4에서 i=2일때
            }else {
                j++;
               
            }
        }
        while (i < nums.length) {
            nums[i]=0;
            i++;
        }
        //
        
    }
}
// @lc code=end

