package com.mk.leetCodePractice.leetCode_75;

public class LC75_01_MergeAlternately {
    // 1768. Merge Strings Alternately

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result= new StringBuilder();

        int n1 = word1.length();
        int n2 = word2.length();
        int n = Math.max(n1, n2);

        for (int i=0; i<n; i++){
            if (i<n1){
                result.append(word1, i, i+1);
            }
            if (i<n2){
                result.append(word2, i, i+1);
            }
        }

        return result.toString();
    }
}
