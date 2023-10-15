package com.mohammedabdoh.dsa.datastructures.techniques.sliding_window;

import java.util.LinkedList;
import java.util.Queue;

public class MaxSumSubArrayOfSizeK {
    public static int solution(int[] nums, int k) {
        if(k > nums.length) {
            throw new IllegalArgumentException("Number of items in array is less than window size");
        }

        Queue<Integer> queue = new LinkedList<>();
        int maxSum = 0;
        int currentWindowSum = 0;

        for (int i = 0; i < k; i++) {
            queue.add(nums[i]);
            maxSum += nums[i];
        }

        currentWindowSum = maxSum;

        for (int i = k; i < nums.length; i++) {
            currentWindowSum = currentWindowSum - queue.poll() + nums[i];
            if(maxSum < currentWindowSum) {
                maxSum = currentWindowSum;
            }
            queue.add(nums[i]);
        }

        return maxSum;
    }
}
