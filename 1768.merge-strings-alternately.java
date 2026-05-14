/*
 * @lc app=leetcode id=1768 lang=java
 *
 * [1768] Merge Strings Alternately
 */

// @lc code=start
class Solution {
    public String mergeAlternately(String word1, String word2) {
        //문자열로 합칠때 쓰이는 StringBuilder

        StringBuilder sb = new StringBuilder();

        //둘중 짧은 글자의 길이 계산해서 for문 작성
        for(int i = 0; i< Math.min(word1.length(), word2.length()); i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        //합친 후 남은 글자(긴 글자) 마저 합침
        if (Math.max(word1.length(), word2.length()) == word1.length()) {
            for(int j = word2.length(); j<word1.length(); j++){
                sb.append(word1.charAt(j));
            }
            
        }else {
            for(int j = word1.length(); j<word2.length(); j++){
                sb.append(word2.charAt(j));
            }

        }
        
        //String 변환
        return sb.toString();
    }
}
// @lc code=end

//이렇게도 가능
//sb.append(word1.substring(minLength));
//sb.append(word2.substring(minLength)); 
