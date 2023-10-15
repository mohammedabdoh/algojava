package com.mohammedabdoh.dsa.algorithms.sorting.bubble;

public class BubbleSort {
    public static void solution(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            boolean swabable = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j + 1] < arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    swabable = true;
                }
            }
            if(!swabable) break;
        }
    }
}
