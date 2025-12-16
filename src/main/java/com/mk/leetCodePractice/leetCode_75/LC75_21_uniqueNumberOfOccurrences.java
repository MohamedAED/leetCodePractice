package com.mk.leetCodePractice.leetCode_75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC75_21_uniqueNumberOfOccurrences {

    // 1207. Unique Number of Occurrences

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else  {
                map.put(num, 1);
            }
        }

        Set<Integer> set = new HashSet<>();
        for (int num : map.values()) {
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
        }
        return true;
    }

    public static boolean uniqueOccurrences2(int[] arr) {
        // Create a map to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count occurrences of each element in the array
        for (int element : arr) {
            frequencyMap.merge(element, 1, Integer::sum);
        }

        // Check if all occurrence counts are unique
        // by comparing the size of unique occurrence values with total number of elements
        return new HashSet<>(frequencyMap.values()).size() == frequencyMap.size();
    }

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }

}
