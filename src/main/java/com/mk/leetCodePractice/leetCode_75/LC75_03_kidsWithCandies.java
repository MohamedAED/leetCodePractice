package com.mk.leetCodePractice.leetCode_75;

import java.util.ArrayList;
import java.util.List;

public class LC75_03_kidsWithCandies {
    // 1431. Kids With the Greatest Number of Candies

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies)
            max = Math.max(candy, max);

        List<Boolean> result = new ArrayList<>();

        for (int candy : candies)
            result.add((candy + extraCandies) >= max);
        return result;
    }
}
