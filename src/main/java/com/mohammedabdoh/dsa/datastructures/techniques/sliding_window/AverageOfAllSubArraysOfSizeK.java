package com.mohammedabdoh.dsa.datastructures.techniques.sliding_window;

// https://www.educative.io/courses/grokking-the-coding-interview/7D5NNZWQ8Wr
public class AverageOfAllSubArraysOfSizeK {
    public static double[] solution(int k, int[] nums) {
        int currentWindowSum = 0;
        double[] results = new double[nums.length - k + 1];
        int windowIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            currentWindowSum += nums[i];

            if(i >= k - 1) {
                results[windowIndex] = (double) currentWindowSum / k;
                currentWindowSum -= nums[windowIndex];
                windowIndex++;
            }
        }

        return results;
    }
}
