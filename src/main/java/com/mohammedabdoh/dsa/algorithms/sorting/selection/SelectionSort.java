package com.mohammedabdoh.dsa.algorithms.sorting.selection;

public class SelectionSort {
    public static void solution(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestAt = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < arr[smallestAt]) {
                    smallestAt = j;
                }
            }
            int tmp = arr[smallestAt];
            arr[smallestAt] = arr[i];
            arr[i] = tmp;
        }
    }
}
