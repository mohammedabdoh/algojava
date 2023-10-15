package com.mohammedabdoh.dsa.datastructures.arrays;

public class RearrangeArrayAlternatively {
    public static void solution(long arr[], int n) {
        long result[] = new long[n];

        int start = 0;
        int end = n - 1;
        int counter = 0;

        while (start < end) {
            result[counter++] = arr[end--];
            result[counter++] = arr[start++];
        }

        if (start == end) {
            result[counter] = arr[start];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }
}
