package com.mohammedabdoh.dsa.algorithms.searching;

public class FindLastOccurenceInSortedArray {
    public static int solution(int arr[], int num) {
        int high = arr.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == num) {
                if(mid == arr.length - 1 || arr[mid + 1] != num) {
                    return mid;
                } else {
                    low = mid + 1;
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
