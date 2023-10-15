package com.mohammedabdoh.dsa.datastructures.arrays;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate/
public class HasDuplicate {
    public static boolean solution(int[] nums) {
        Set<Integer> arrayItems = new HashSet<>();

        for (int num : nums) {
            if (arrayItems.contains(num)) {
                return true;
            }
            arrayItems.add(num);
        }

        return false;
    }
}
