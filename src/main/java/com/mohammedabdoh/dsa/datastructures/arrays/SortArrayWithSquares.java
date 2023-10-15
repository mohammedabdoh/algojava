package com.mohammedabdoh.dsa.datastructures.arrays;

public class SortArrayWithSquares {
    public static int[] solution(int arr[]) {
        int result[] = new int[arr.length];

        int leftPointer = 0;
        int rightPointer = arr.length - 1;
        int counter = arr.length - 1;

        while (rightPointer >= leftPointer) {
            if (Math.abs(arr[leftPointer]) >= Math.abs(arr[rightPointer])) {
                result[counter--] = (int) Math.pow(arr[leftPointer], 2);
                leftPointer++;
            } else {
                result[counter--] = (int) Math.pow(arr[rightPointer], 2);
                rightPointer--;
            }
        }

        return result;
    }
}
