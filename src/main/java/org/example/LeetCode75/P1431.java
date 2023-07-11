package org.example.LeetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
 *
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
 *
 * Note that multiple kids can have the greatest number of candies.
 */
public class P1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        for(int candy : candies) {
            if(candy + extraCandies >= Arrays.stream(candies).max().getAsInt()) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        P1431 p = new P1431();
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> result = p.kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }
}
