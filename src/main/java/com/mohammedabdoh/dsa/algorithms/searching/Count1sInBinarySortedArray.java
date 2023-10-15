package com.mohammedabdoh.dsa.algorithms.searching;

public class Count1sInBinarySortedArray {
    public static int solution(int arr[]) {
        int firstOccurenceOf1 = FindFirstOccurenceInSortedArray.solution(arr, 1);

        return firstOccurenceOf1 == -1 ? 0 : arr.length - firstOccurenceOf1;
    }
}
