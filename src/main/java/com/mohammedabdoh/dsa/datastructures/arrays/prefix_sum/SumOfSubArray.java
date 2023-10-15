package com.mohammedabdoh.dsa.datastructures.arrays.prefix_sum;

public class SumOfSubArray {
    public static int solution(int[] arr, int fromIndex, int toIndex) {
        // Check if fromIndex is not less that 0
        if(fromIndex < 0) {
            throw new IllegalArgumentException(
                String.format("fromIndex %d is invalid", fromIndex)
            );
        }

        // Check if toIndex is not greater than or equal number of elements in array
        if(toIndex >= arr.length) {
            throw new IllegalArgumentException(
                String.format("toIndex %d is invalid", toIndex)
            );
        }

        // Check if fromIndex is not greater than toIndex
        if(fromIndex > toIndex) {
            throw new IllegalArgumentException(
                String.format("fromIndex %d is greater than toIndex %d", fromIndex, toIndex)
            );
        }


        // Check if the array has one element
        if(arr.length == 1) {
            return arr[0];
        }

        // Calculae the sum of the subarrays using the formula prefixSumArray[toIndex] - prefixSumArray[fromIndex-1]
        int sumUntiToIndex = PrefixSumArray.solution(arr)[toIndex];
        int sumBeforeFromIndex = fromIndex == 0 ? 0 : PrefixSumArray.solution(arr)[fromIndex - 1];
        
        return sumUntiToIndex - sumBeforeFromIndex;
    }
}
