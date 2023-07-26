package org.example.LeetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class P2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        List<Integer> list1 = List.copyOf(set1);
        List<Integer> list2 = List.copyOf(set2);

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for (int i=0; i<list1.size(); i++) {
            if (!list2.contains(list1.get(i))) {
                l1.add(list1.get(i));
            }
        }

        for (int j=0; j<list2.size(); j++) {
            if (!list1.contains(list2.get(j))) {
                l2.add(list2.get(j));
            }
        }
        result.add(l1);
        result.add(l2);
        return result;
    }
}
