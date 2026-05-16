/*
 * @lc app=leetcode id=1071 lang=java
 *
 * [1071] Greatest Common Divisor of Strings
 */

// @lc code=start
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int a = str1.length();
        int b = str2.length();


        //최대공약수 구하는 식
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        if((str1 + str2).equals(str2 + str1)) {
            return str1.substring(0, a);
        }else {
            return "";
        }
    }
}
// @lc code=end

