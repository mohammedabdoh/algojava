package com.mohammedabdoh.dsa.datastructures.arrays;

public class ReverseArray {
    public static int[] solution(int[] arr) {
        if(arr.length <= 1) {
            return arr;
        }

        int leftPointer = 0;
        int rightPointer = arr.length - 1;

        while(leftPointer <= rightPointer) {
            int tmp = arr[leftPointer];
            arr[leftPointer] = arr[rightPointer];
            arr[rightPointer] = tmp;
            leftPointer++;
            rightPointer--;
        }

        return arr;
    }

    public static int[] solution(int[] arr, int start, int end) {
        if (arr.length <= 1) {
            return arr;
        }

        while (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }

        return arr;
    }
}
