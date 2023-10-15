package com.mohammedabdoh.dsa.algorithms.searching;

public class CountOccurenceInSortedArray {
    public static int solution(int arr[], int num) {
        int firstOccurence = FindFirstOccurenceInSortedArray.solution(arr, num);
        int lastOccurence = FindLastOccurenceInSortedArray.solution(arr, num);

        return firstOccurence == -1 || lastOccurence == -1 ? 0 : lastOccurence - firstOccurence + 1;
    }
}
