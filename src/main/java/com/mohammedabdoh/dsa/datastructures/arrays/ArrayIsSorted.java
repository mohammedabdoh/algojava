package com.mohammedabdoh.dsa.datastructures.arrays;

public class ArrayIsSorted {
    public static boolean solution(int[] arr) {
        if(arr.length <= 1) {
            return true;
        }

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }

        return true;
    }
}
