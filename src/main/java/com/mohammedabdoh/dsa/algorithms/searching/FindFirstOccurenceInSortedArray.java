package com.mohammedabdoh.dsa.algorithms.searching;

public class FindFirstOccurenceInSortedArray {
    public static int solution(int arr[], int num) {
        int high = arr.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == num) {
                if(mid == 0 || arr[mid - 1] != num) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if(arr[mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
