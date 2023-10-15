package com.mohammedabdoh.dsa.algorithms.sorting.merge;

public class MergeTwoSortedArrays {

    public static int[] solution(int arr1[], int arr2[]) {
        
        int resultArraySize = arr1.length + arr2.length;
        int result[] = new int[resultArraySize];
        int arr1Pointer = 0;
        int arr2Pointer = 0;
        int counter = 0;

        while(arr1Pointer < arr1.length && arr2Pointer < arr2.length) {
            if(arr1[arr1Pointer] > arr2[arr2Pointer]) {
                result[counter++] = arr2[arr2Pointer++];
            } else {
                result[counter++] = arr1[arr1Pointer++];
            }
        }

        while(arr1Pointer < arr1.length) {
            result[counter++] = arr1[arr1Pointer++];
        }

        while (arr2Pointer < arr2.length) {
            result[counter++] = arr2[arr2Pointer++];
        }

        return result;
    }

}
