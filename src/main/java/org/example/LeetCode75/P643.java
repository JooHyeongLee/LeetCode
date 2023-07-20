package org.example.LeetCode75;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;


public class P643 {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; ++i)
            sum += nums[i];
        double ans = sum;

        for (int i = k; i < nums.length; ++i) {
            sum += nums[i] - nums[i - k];
            ans = Math.max(ans, sum);
        }

        return ans / k;

        // int maxIdx = nums.length - k + 1;
        // List<Double> sumList = new ArrayList<>();
        //
        // if(nums.length == 0 || nums.length < k ) {
        //     return 0;
        // }
        // for(int i=0; i<maxIdx; i++) {
        //     double sum = 0;
        //
        //     for(int j=i; j < i+k; j++) {
        //         sum += nums[j];
        //     }
        //     sumList.add((sum/k));
        // }
        // return Collections.max(sumList);
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
