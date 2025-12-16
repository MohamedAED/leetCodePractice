package com.mk.leetCodePractice.leetCode_75;

import java.util.HashSet;
import java.util.Set;

public class LC75_15_maxNumOfVowelsInSubStringOfK {

    // 1456. Maximum Number of Vowels in a Substring of Given Length

    public static int maxVowels(String s, int k) {

        Set<String> vowels = new HashSet<String>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");

        int n = s.length();
        int max = 0;

        int index = 0;
        while (index < k) {
            if (vowels.contains(s.substring(index, index + 1))) {
                max++;
            }
            index++;
        }

        int count = max;
        index = 1;
        int end = index + k;
        while (end <= n) {

            count -= vowels.contains(s.substring(index-1, index)) ? 1 : 0;
            count += vowels.contains(s.substring(end-1, end)) ? 1 : 0;

            if (count > max) {
                max = count;
            }

            index++;
            end++;
        }

        return max;

    }

    /**
     * Checks if a character is a vowel (a, e, i, o, u).
     *
     * @param c the character to check
     * @return true if the character is a vowel, false otherwise
     */
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static int maxVowels2(String s, int k) {
        // Count vowels in the initial window of size k
        int currentVowelCount = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowelCount++;
            }
        }

        // Initialize the maximum count with the first window's count
        int maxVowelCount = currentVowelCount;

        // Slide the window through the rest of the string
        for (int i = k; i < s.length(); i++) {
            // Add the new character entering the window
            if (isVowel(s.charAt(i))) {
                currentVowelCount++;
            }

            // Remove the character leaving the window
            if (isVowel(s.charAt(i - k))) {
                currentVowelCount--;
            }

            // Update the maximum count if current window has more vowels
            maxVowelCount = Math.max(maxVowelCount, currentVowelCount);
        }

        return maxVowelCount;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels2("weallloveyou", 7));
    }

}
