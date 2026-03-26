/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        
        int answer = 0;
           Map<Character, Integer> map = new HashMap<>(); // character 는 소따옴표
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);
        for(int i = 0; i < s.length(); i++) {

            int curr = map.get(s.charAt(i)); //현재 문자 값 가져오기
            if((i+1)<s.length()){
                int next = map.get(s.charAt(i+1));

                if(curr < next) {
                    answer -= curr;
                }else {
                    answer += curr;
                }
            }else {
                answer += curr;
            }
            
        }
        return answer;
    }
}
// @lc code=end

