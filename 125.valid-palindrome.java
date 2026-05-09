/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1; //s 전체 길이-1

        while (left<right) {
           
            //특수문자는 카운트만 하고 비교는 안하기 위해 바로 continue
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            if( Character.toLowerCase(s.charAt(left))==Character.toLowerCase(s.charAt(right))) {
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
        

    }
}
// @lc code=end

