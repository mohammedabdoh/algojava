package com.mohammedabdoh.dsa.algorithms.searching;

public class BinarySearchRotatedArray {
    public static int solution(int arr[], int num) {
        int low = 0, high = arr.length - 1, mid;

        while(low <= high) {
            mid = (low + high) / 2;

            if(arr[mid] == num) {
                return mid;
            } else if(arr[mid] > num) {
                if(num < arr[mid] && num >= arr[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else  {
                if(num > arr[mid] && num <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid -1;
                }
            }
        }

        return -1;
    }
}
