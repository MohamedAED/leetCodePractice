package com.mk.leetCodePractice.leetCode_75;

public class LC75_07_productExceptSelf {
    // 238. Product of Array Except Self
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int prefixProduct = 1;

        for (int i = 0; i < n; i++) {
            result[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        int postfixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= postfixProduct;
            postfixProduct *= nums[i];
        }

        return result;
    }
}
