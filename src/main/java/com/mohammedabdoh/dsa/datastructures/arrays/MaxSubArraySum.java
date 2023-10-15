package com.mohammedabdoh.dsa.datastructures.arrays;

import static java.lang.Integer.MIN_VALUE;

// https://leetcode.com/problems/maximum-subarray/
public class MaxSubArraySum {
    public static int solution(int[] nums) {
        // Kadane's Algorithm

        int maxSum = MIN_VALUE;
        int currentSum = 0;

        for (int num: nums) {
            currentSum += num;

            if(maxSum < currentSum) {
                maxSum = currentSum;
            }

            if(currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}
