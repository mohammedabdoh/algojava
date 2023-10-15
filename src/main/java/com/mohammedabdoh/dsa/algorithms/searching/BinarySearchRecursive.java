package com.mohammedabdoh.dsa.algorithms.searching;

public class BinarySearchRecursive {
    public static int solution(int arr[], int high, int low, int x) {
        int mid = (high + low) / 2;
        
        if(low > high || mid >= arr.length) {
            return -1;
        }

        if(arr[mid] == x) {
            return mid;
        } else if(arr[mid] > x) {
            high = mid - 1;
            return solution(arr, high, low, x);
        }

        low = mid + 1;
        return solution(arr, high, low, x);
        
    }
}
