package com.mk.leetCodePractice.leetCode_75;

import java.util.Arrays;

public class LC75_10_MoveZeros {
    // 283. Move Zeroes
    public static void moveZeroes(int[] numbs) {
        int len = numbs.length;
        int zeroCount = 0;
        for (int num : numbs) {
            if (num == 0)
                zeroCount++;
        }

        int j = 0 ;
        int index = 0;
        int numCount = len - zeroCount;
        while (numCount > 0) {
            if (numbs[j] != 0) {
                numbs[index++] = numbs[j];
                numCount --;
            }

            j++;
        }

        j=index;
        while (j < len) {
            numbs[j++] = 0;
        }

    }

    public void moveZeroes2(int[] nums) {
        // Pointer to track the position where next non-zero element should be placed
        int nonZeroIndex = 0;
        int arrayLength = nums.length;

        // Iterate through the entire array
        for (int currentIndex = 0; currentIndex < arrayLength; currentIndex++) {
            // If current element is non-zero, swap it with element at nonZeroIndex position
            if (nums[currentIndex] != 0) {
                // Swap current non-zero element with element at nonZeroIndex
                int temp = nums[currentIndex];
                nums[currentIndex] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;

                // Move nonZeroIndex pointer forward for next non-zero element
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbs = new int[]{0,1,0,3,12};
        moveZeroes(numbs);
        System.out.println(Arrays.toString(numbs));
    }

}
