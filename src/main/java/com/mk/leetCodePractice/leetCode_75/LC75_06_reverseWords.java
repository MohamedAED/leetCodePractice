package com.mk.leetCodePractice.leetCode_75;

public class LC75_06_reverseWords {
    // 151. Reverse Words in a String
    public String reverseWords(String s) {
        s=s.trim();
        if (s.isEmpty())
            return s;

        int n = s.length();
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i =n-1; i>=0; i--){
            if (s.charAt(i) != ' '){
                word.append(s.charAt(i));
            }else {
                if (!word.isEmpty()){
                    result.append(word.reverse()).append(" ");
                    word.setLength(0);
                }
            }
        }
        if (!word.isEmpty())
            result.append(word.reverse());
        return result.toString().trim();
    }
}
