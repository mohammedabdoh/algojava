package com.mohammedabdoh.dsa.algorithms.searching;

public class UnboundedBinarySearch {
    public static int solution(int arr[], int num) {
        if(arr[0] == num) return 0;
        int counter = 1;

        while(arr[counter] < num) {
            counter *= 2;
        }

        if(arr[counter] == num) return counter;

        return BinarySearchIterative.solution2(arr, (counter / 2) + 1, counter - 1, num);
    }
}
