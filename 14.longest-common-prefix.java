/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        answer = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(!strs[i].startsWith(answer)) { //true 될때까지 answer줄이는 식
                answer = answer.substring(0,answer.length()-1);
                if(answer.length() == 0) {
                    break;
                }
            }
        }
        return answer;
    }
}
// @lc code=end

