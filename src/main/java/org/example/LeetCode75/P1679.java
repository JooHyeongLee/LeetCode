package org.example.LeetCode75;

import java.util.*;
import java.util.stream.Collectors;

public class P1679 {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> numCount = new HashMap<>();
        int result = 0;

        for (int num : nums) {
            int complement = k - num;
            if (numCount.containsKey(complement) && numCount.get(complement) > 0) {
                result++;
                numCount.put(complement, numCount.get(complement) - 1);
            } else {
                numCount.put(num, numCount.getOrDefault(num, 0) + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        P1679 p1679 = new P1679();
        // int result = p1679.maxOperations(new int[]{1,2,3,4},  5);
        int result = p1679.maxOperations(new int[]{3,1,3,4,3},  6);
        // int result = p1679.maxOperations(new int[]{2,2,2,3,1,1,4,1},  4);
        // int result = p1679.maxOperations(new int[]{2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2},  3);
        System.out.println(result);
    }
}
