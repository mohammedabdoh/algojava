package com.mohammedabdoh.dsa.datastructures.arrays;

public class MissingNumberInArray {
    public static int solution(int arr[]) {
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;

        int missingNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                continue;
            }

            missingNumber = missingNumber ^ arr[i];
            
            if (arr[i] < start) {
                start = arr[i];
            }

            if (arr[i] > end) {
                end = arr[i];
            }
        }

        for (int i = start; i <= end; i++) {
            missingNumber = missingNumber ^ i;
        }

        return missingNumber == 0 ? end + 1 : missingNumber;
    }
}
