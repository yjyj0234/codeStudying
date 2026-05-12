/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> sMap = new HashMap<>();

        //getOrDefault() : key가 있으면 그 값을 가져오고, 없으면 기본값(default) 반환
        //c의 현재 개수 가져오기 : 없으면 0 +1 하기 다시 저장

        for(int i = 0; i< s.length(); i++) {
            char c = s.charAt(i);
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }

        for(int j = 0; j< t.length(); j++) {
            char d = t.charAt(j);
            sMap.put(d, sMap.getOrDefault(d, 0) - 1);
        }

        if (s.length() != t.length()) {
            return false;
        }

        for(int value : sMap.values()) {

            if (value!=0) {
                return false;
            }
        }

        return true;
    }
}
// @lc code=end

/*
int[] count = new int[26];
for (int i = 0; i < s.length(); i++) {
    count[s.charAt(i) - 'a']++;
    count[t.charAt(i) - 'a']--;
}

for (int c : count) {
    if (c != 0) return false;
}

return true;
*/

