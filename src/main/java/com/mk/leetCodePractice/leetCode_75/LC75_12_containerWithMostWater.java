package com.mk.leetCodePractice.leetCode_75;

public class LC75_12_containerWithMostWater {
    //    11. Container With Most Water

    public static int maxArea(int[] height) {
        int n = height.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int h = Math.min(height[i], height[j]);
                int l = j-i;
                int c = h*l;
                if (c >  max) {
                    max = c;
                }
            }
        }
        return max;
    }

    public static int maxArea2 (int[] height) {
        // Initialize two pointers at the start and end of the array
        int leftPointer = 0;
        int rightPointer = height.length - 1;

        // Variable to track the maximum area found so far
        int maxAreaFound = 0;

        // Continue until the two pointers meet
        while (leftPointer < rightPointer) {
            // Calculate current area: minimum height * width between pointers
            int currentHeight = Math.min(height[leftPointer], height[rightPointer]);
            int currentWidth = rightPointer - leftPointer;
            int currentArea = currentHeight * currentWidth;

            // Update maximum area if current area is larger
            maxAreaFound = Math.max(maxAreaFound, currentArea);

            // Move the pointer with smaller height inward
            // This greedy approach works because moving the larger height
            // can never increase the area (width decreases, height is limited by smaller side)
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return maxAreaFound;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(array));
    }

}
