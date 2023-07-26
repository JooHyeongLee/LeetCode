package org.example.LeetCode75;

import java.util.*;
import java.util.stream.Collectors;

public class P1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        Set<Integer> result = new HashSet<>();
        set.forEach(value->{
            int count = 0;
            for (int i=0; i<arr.length; i++) {
                if (value.intValue() == arr[i]) {
                    count++;
                }
            }
            result.add(count);
        });
        if (set.size() == result.size()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        P1207 p = new P1207();
        // int[] arr = {1,2,2,1,1,3};
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        p.uniqueOccurrences(arr);
    }
}
