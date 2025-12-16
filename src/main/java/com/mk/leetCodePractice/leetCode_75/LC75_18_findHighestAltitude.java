package com.mk.leetCodePractice.leetCode_75;

public class LC75_18_findHighestAltitude {

    // 1732. Find the Highest Altitude

    public static int largestAltitude(int[] gain) {

        // Track the maximum altitude reached
        int maxAltitude = 0;

        // Track the current altitude as we traverse
        int currentAltitude = 0;

        // Iterate through each altitude change
        for (int altitudeChange : gain) {
            // Update current altitude by adding the change
            currentAltitude += altitudeChange;

            // Update maximum altitude if current is higher
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-5,1,5,0,-7};
        System.out.println(largestAltitude(nums));
    }
}
