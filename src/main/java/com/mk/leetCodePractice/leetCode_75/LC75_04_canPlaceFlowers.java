package com.mk.leetCodePractice.leetCode_75;

public class LC75_04_canPlaceFlowers {
    // 605. Can Place Flowers
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int l = flowerbed.length;
        for (int i =0; i< l; i++){
            if(flowerbed[i] == 0){
                boolean emptyLeft = (i == 0) || (flowerbed[i-1] == 0);
                boolean emptyRight = (i == l-1) || (flowerbed[i+1] == 0);

                if(emptyLeft && emptyRight){
                    count++;
                    flowerbed[i] = 1;
                    if (count >= n)
                        return true;
                }
            }
        }
        return count >=n;
    }
}
