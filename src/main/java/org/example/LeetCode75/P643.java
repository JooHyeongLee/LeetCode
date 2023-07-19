package org.example.LeetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class P643 {
    private List<List<Integer>> global = new ArrayList<>();
    public double findMaxAverage(int[] nums, int k) {
        List<Integer> intList
                = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        return 0;
    }

    /**
     * You are given an integer array nums consisting of n elements, and an integer k.
     *
     * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
     * @param args
     */
    public static void main(String[] args) {
        P643 p = new P643();
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        p.findMaxAverage(nums, k);
    }
}
