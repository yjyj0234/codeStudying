/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        char a ;
        String b=  "";
        String d = "";

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A'
             || s.charAt(i) == 'a'
             || s.charAt(i) =='E' 
             ||s.charAt(i) =='e'
             ||s.charAt(i) =='I'
             ||s.charAt(i) =='i'
             ||s.charAt(i) =='O'
             ||s.charAt(i) =='o'
             ||s.charAt(i) =='U'
             ||s.charAt(i) =='u') {
                a= s.charAt(i);
                b+=a;
            }

        }
        int c = b.length()-1;
            for(int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'A'
                || s.charAt(j) == 'a'
                || s.charAt(j) =='E' 
                ||s.charAt(j) =='e'
                ||s.charAt(j) =='I'
                ||s.charAt(j) =='i'
                ||s.charAt(j) =='O'
                ||s.charAt(j) =='o'
                ||s.charAt(j) =='U'
                ||s.charAt(j) =='u') {
                    d += b.charAt(c);
                    c--;
                }else {
                    d += s.charAt(j);
                }

            }
   
        return d;
    }
}
// @lc code=end

