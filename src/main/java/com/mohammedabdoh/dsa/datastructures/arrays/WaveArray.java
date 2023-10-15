package com.mohammedabdoh.dsa.datastructures.arrays;

public class WaveArray {
    public static int[] solution(int arr[]) {
        if(arr.length == 1) {
            return arr;
        }

        for (int i = 0; i < arr.length && i + 1 < arr.length; i += 2) {
            int tmp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = tmp;
        }

        return arr;
    }
}
