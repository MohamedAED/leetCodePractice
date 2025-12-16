package com.mk.leetCodePractice.leetCode_75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC75_20_FindDifferenceOfTwoArrays {

    // 2215. Find the Difference of Two Arrays

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Convert arrays to sets to remove duplicates and enable O(1) lookup
        Set<Integer> set1 = convertArrayToSet(nums1);
        Set<Integer> set2 = convertArrayToSet(nums2);

        // Initialize result lists for storing unique elements
        List<Integer> uniqueInNums1 = new ArrayList<>();
        List<Integer> uniqueInNums2 = new ArrayList<>();

        // Find elements in set1 that are not present in set2
        for (int value : set1) {
            if (!set2.contains(value)) {
                uniqueInNums1.add(value);
            }
        }

        // Find elements in set2 that are not present in set1
        for (int value : set2) {
            if (!set1.contains(value)) {
                uniqueInNums2.add(value);
            }
        }

        // Return both lists as a single result
        return List.of(uniqueInNums1, uniqueInNums2);
    }

    /**
     * Converts an integer array to a HashSet.
     * This removes duplicates and allows for O(1) contains() operations.
     *
     * @param nums the integer array to convert
     * @return a HashSet containing all unique elements from the array
     */
    public static Set<Integer> convertArrayToSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int value : nums) {
            set.add(value);
        }
        return set;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3};
        int[] nums2 = new int[]{2,4,6};
        System.out.println(findDifference(nums1, nums2));
    }
}
