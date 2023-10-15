package com.mohammedabdoh.dsa.datastructures.arrays;

import java.util.Hashtable;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
public class TowSum {
    public static int[] solution(int[] nums, int target) {
        Map<Integer, Integer> numMap = new Hashtable<>();
        int missing_num;

        for( int i = 0, ii = nums.length; i < ii; i++ ) {
            missing_num = target - nums[i];

            if(numMap.containsKey(missing_num)) {
                return new int[]{numMap.get(missing_num), i};
            }

            numMap.put(nums[i], i);
        }
        return new int[]{1,2};
    }
}
