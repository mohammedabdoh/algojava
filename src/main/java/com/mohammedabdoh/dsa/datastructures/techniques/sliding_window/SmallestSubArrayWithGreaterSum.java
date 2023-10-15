package com.mohammedabdoh.dsa.datastructures.techniques.sliding_window;

public class SmallestSubArrayWithGreaterSum {
    public static int solution(int[] arr, int sum) {
        // Kadane's algorithm
        int currentSum = 0;
        int startPointer = 0;
        int smallestSubArrayLength = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            smallestSubArrayLength++;

            while(currentSum >= sum) {
                currentSum -= arr[startPointer];
                smallestSubArrayLength = Integer.min(i - startPointer + 1, smallestSubArrayLength);
                startPointer++;
            }
        }

        return smallestSubArrayLength;
    }
}

// 2,1,5,2,3,2
/*
currentSum                  2   3   6   7   5   4   6
startPointer                0   0   1   2   3   4
smallestSubArrayLength      1   2   2   2   2   2
*/