package com.mohammedabdoh.dsa.datastructures.arrays;

public class ArrayOfProductOfAllElementsExceptItself {
    public static int[] solution(int[] arr) {
        // Calculate the product
        int productOfAllElements = 1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                productOfAllElements *= arr[i];
            }
        }

        // Replace elements in the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 0 : productOfAllElements / arr[i];
        }

        return arr;
    }
}
