/*
 * @lc app=leetcode id=605 lang=java
 *
 * [605] Can Place Flowers
 */

// @lc code=start
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;

        while (n > 0 && i < flowerbed.length) {
            //boolean 으로 왼쪽이 비어있는지 오른쪽이 비어있는지 체크
            boolean leftEmpty = (i == 0) || flowerbed[i - 1] == 0;
            boolean rightEmpty = (i == flowerbed.length - 1) || flowerbed[i + 1] == 0;

           if(leftEmpty && rightEmpty && flowerbed[i] == 0){
                flowerbed[i] = 1;
                n--;
                i++;
            }else {
                i++;
            }
        }
        if (n != 0 ) {
            return false;
        }else {
            return true;

        }
    }
}
// @lc code=end

