package com.mk.leetCodePractice.leetCode_75;

public class LC75_19_findPivotIndex {

    // 724. Find Pivot Index

    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int left = 0;
        int right = total-nums[0];
        if (left == right)
            return 0;

        for (int i = 1; i < n; ++i) {
            left = left + nums[i-1];
            right = right - nums[i];

            if (left == right) return i;
        }
        return -1;

    }

    public static int pivotIndex2(int[] nums) {
        // Initialize left sum as 0
        int leftSum = 0;

        // Calculate total sum of all elements (initially used as right sum)
        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }

        // Iterate through each index to find the pivot
        for (int i = 0; i < nums.length; i++) {
            // Subtract current element from right sum
            rightSum -= nums[i];

            // Check if left sum equals right sum at current index
            if (leftSum == rightSum) {
                return i;  // Found pivot index
            }

            // Add current element to left sum for next iteration
            leftSum += nums[i];
        }

        // No pivot index found
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{-1,-1,0,1,1,0}));
    }
}
