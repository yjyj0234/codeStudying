/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        //단어 순서만 뒤집어야함, 문자 전체 뒤집기 x
        char[] c = s.toCharArray();

        //뒤에서 부터 시작하기기
        int right = s.length() - 1;

        

        //자른 단어 추가용
        StringBuilder sb = new StringBuilder();
        
        while (right >= 0 ) {
      
            //뒤 공백 제거
            while (right >= 0 && c[right] == ' ') {
                right--;
            }
            //right 가 0보다 작으으면 루프 탈출
            if (right < 0) {
                break;
            }
            //공백 제외 후 단어 끝 저장(blue 의 e부분)
            int end = right;

            //단어 시작점 찾기 (blue 의 b부분이 끝나면 공백위치)
            while (right >= 0 && c[right] != ' ') {
                right--;
            }
            //첫단어X, 다음 단어 부터 공백 생성
            //마지막 단어 까지 처리 후 공백 생겨서 단어 추출 전 처리
            if (sb.length() > 0) {
                sb.append(' ');
            }
            //단어 추출
            sb.append(s.substring(right+1, end+1));

        }

        return sb.toString();
    }
}
// @lc code=end

