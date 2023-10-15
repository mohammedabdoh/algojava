package com.mohammedabdoh.dsa.algorithms.searching;

public class BinarySearchBitonicArray {
    public static int solution(int arr[], int num) {
        int low = 0, high = arr.length - 1, mid, bitonicPoint = 0;

        while (low <= high) {
            mid = (low + high) / 2;

            if (mid + 1 != arr.length - 1 && arr[mid + 1] > arr[mid]) {
                low = mid + 1;
            } else if (mid - 1 != 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            } else {
                bitonicPoint = mid;
                break;
            }
        }

        if (arr[bitonicPoint] == num) {
            return arr[bitonicPoint];
        } else if (num < arr[bitonicPoint] && num >= arr[arr.length - 1]) {
            return BinarySearchIterative.reversed(arr, bitonicPoint + 1, arr.length - 1, num);
        } else {
            return BinarySearchIterative.solution2(arr, 0, bitonicPoint - 1, num);
        }
    }
}
