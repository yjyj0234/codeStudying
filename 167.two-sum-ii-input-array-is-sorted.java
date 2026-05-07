/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    // 이 방식 sum 작으면 left++
    // sum 크면 right-- 기억하기기
    public int[] twoSum(int[] numbers, int target) {
        int[] a = numbers;
        int c = 0;
        int d = 0;
        int[] result = {c,d};

        int i = 0;
        int j = a.length-1;
        while (i < a.length) {
            if((a[i] + a[j]) > target) {
                j--;
                
            }else if((a[i] + a[j]) < target){
                i++;
                
            }else {
                c=i+1;
                d=j+1;
                result[0] = c;
                result[1] = d;
                return result;

            }
            
        }
        
        return result;
    }
}
// @lc code=end

