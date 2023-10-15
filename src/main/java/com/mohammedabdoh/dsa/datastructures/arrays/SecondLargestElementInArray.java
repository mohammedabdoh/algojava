package com.mohammedabdoh.dsa.datastructures.arrays;

public class SecondLargestElementInArray {
    public static int solution(int[] arr) {
        if(arr.length < 2) {
            return 0;
        }

        if(arr.length == 2) {
            return Math.min(arr[0], arr[1]);
        }

        int largestElementInArray = arr[0];
        int secondLargestElementInArray = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largestElementInArray) {
                secondLargestElementInArray = largestElementInArray;
                largestElementInArray = arr[i];
            } else if(arr[i] != largestElementInArray) {
                if(secondLargestElementInArray == Integer.MIN_VALUE || secondLargestElementInArray < arr[i]) {
                    secondLargestElementInArray = arr[i];
                }
            }
        }

        return secondLargestElementInArray;
    }
}

/*
 * NOTE: in some cases you might want to treat the array as a stream of data
 * The current problem is a good example where new items might be added in the array
 * that might re-assign new values to the largest and the second largest numbers
 */