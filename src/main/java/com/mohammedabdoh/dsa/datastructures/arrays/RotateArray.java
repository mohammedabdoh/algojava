package com.mohammedabdoh.dsa.datastructures.arrays;

public class RotateArray {
    public static int[] solution(int[] arr, int rotateBy) {
        arr = ReverseArray.solution(arr, 0, rotateBy - 1);
        arr = ReverseArray.solution(arr, rotateBy, arr.length - 1);
        arr = ReverseArray.solution(arr, 0, arr.length - 1);
        
        return arr;
    }
}
