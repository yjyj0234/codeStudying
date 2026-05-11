/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        
        int index = 0;
        
        int index2 = 0;
        int[] a = new int[nums.length];
        k = k % nums.length; 
        // k가 배열 길이보다 클수 있기 때문에 처리
        // ex)길이 7 배열 k = 10 => 7번 회전: 원상태, 남은 3번만 의미 있음
        int kk = nums.length-k;
        

        while (index < nums.length && kk < nums.length) {

            a[index] = nums[kk];

            index++;
            kk++;

        }
        
        while (index < nums.length && index2 <= nums.length-k) {
            a[index] = nums[index2];

            index++;
            index2++;
        }

        //다시 a배열 nums로 가져오기
        for(int i=0; i<nums.length; i++) {
            nums[i] = a[i];
        }
        
    
    }
}
// @lc code=end







/*
성능 올린 답안
class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = a[i];
        }
    }
}
*/
