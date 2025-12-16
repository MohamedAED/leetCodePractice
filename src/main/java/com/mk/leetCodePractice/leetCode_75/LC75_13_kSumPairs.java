package com.mk.leetCodePractice.leetCode_75;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LC75_13_kSumPairs {
    // 1679. Max Number of K-Sum Pairs

    public static int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        int i = 0;
        int j = n-1;

        while(i<j){
            if(nums[i]+nums[j]==k){
                count++;
                i++;
                j--;
            } else if(nums[i]+nums[j]>k){
                j--;
            } else  if(nums[i]+nums[j]<k){
                i++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2}, 3));
    }
}
