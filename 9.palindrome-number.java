/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int y = x;
        while (x > 0) {
            int digit = x % 10;  //0 0 2
            rev = rev * 10 + digit;  //0 0 2
            x = x / 10; //x= 120 12 1
        }
        return y == rev ? true : false;
            
    }
}
// @lc code=end.