package com.mk.leetCodePractice.leetCode_75;

public class LC75_02_gcdOfStrings {
    // 1071. Greatest Common Divisor of Strings

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1+str2).equals(str2+str1))
            return "";
        int l = gcd(str1.length(), str2.length());
        return str1.substring(0, l);
    }

    private int gcd(int a, int b){
        while(b !=0 ){
            int t = b;
            b = a%b;
            a=t;
        }
        return a;
    }

}
