package com.mk.leetCodePractice.leetCode_75;

public class LC75_16_maxConsecutiveOnesIII {
    // 1004. Max Consecutive Ones III

    public static int longestOnes(int[] nums, int k) {

        int zeroCount = 0;
        int left = 0;

        for (int num : nums) {
            zeroCount += num^1;

            if (zeroCount > k) {
                zeroCount -= nums[left]^1;
                left++;
            }
        }
        return nums.length - left;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(arr, 2));
    }
}
