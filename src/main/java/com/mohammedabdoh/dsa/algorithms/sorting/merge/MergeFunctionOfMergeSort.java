package com.mohammedabdoh.dsa.algorithms.sorting.merge;

public class MergeFunctionOfMergeSort {
    public static void solution(int arr[], int low, int mid, int high) {
        // First we need to create 2 arrays which will hold the values
        // of both left and right arrays

        int left[] = new int[mid - low + 1];
        int right[] = new int[high - mid];

        // now we need to populate both arrays
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[low + i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + i + 1];
        }

        // We define the pointers which will be used to iterate over both arrays
        // as well as defining the counter of the current array
        int counter = low; 
        int leftPointer = 0;
        int rightPointer = 0;
        
        // Now we iterate over and copy the items from both arrays 
        // to the original array
        while(leftPointer < left.length && rightPointer < right.length) {
            if(left[leftPointer] > right[rightPointer]) {
                arr[counter++] = right[rightPointer++];
            } else {
                arr[counter++] = left[leftPointer++];
            }
        }

        while(leftPointer < left.length) {
            arr[counter++] = left[leftPointer++];
        }

        while (rightPointer < right.length) {
            arr[counter++] = right[rightPointer++];
        }
    }
}
