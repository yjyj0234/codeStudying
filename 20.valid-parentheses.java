/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char answer;
        
        for(char c : s.toCharArray()){
            if(c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                answer = stack.pop();
                if(!((answer == '{' && c == '}') || (answer == '[' && c == ']') || (answer == '(' && c == ')'))) {
                    return false;
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }
}
// @lc code=end

