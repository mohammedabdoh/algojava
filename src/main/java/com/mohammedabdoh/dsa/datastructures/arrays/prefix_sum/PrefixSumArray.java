package com.mohammedabdoh.dsa.datastructures.arrays.prefix_sum;

public class PrefixSumArray {
    public static int[] solution(int[] arr) {
        if(arr.length <= 1) {
            return arr;
        }

        int[] prefixSumArray = new int[arr.length];
        prefixSumArray[0] = arr[0];
        
        for (int i = 1; i < prefixSumArray.length; i++) {
            prefixSumArray[i] = prefixSumArray[i - 1] + arr[i];
        }

        return prefixSumArray;
    }
}