package com.mohammedabdoh.dsa.datastructures.arrays;

public class PickFromBothSides {
    public static int solution(int A[], int B) {

        int sumOfLastBElements = 0;
        int maxSum = 0;

        for (int i = A.length - B; i < A.length; i++) {
            sumOfLastBElements += A[i];
        }

        maxSum = sumOfLastBElements;

        int currentIndexToStartAdd = 0;
        int currentLastIndex = A.length - B;

        for (int i = 0; i < B; i++) {
            sumOfLastBElements -= A[currentLastIndex++];
            sumOfLastBElements += A[currentIndexToStartAdd++];

            if (maxSum < sumOfLastBElements && sumOfLastBElements != 0) {
                maxSum = sumOfLastBElements;
            }
        }

        return maxSum;
    }
}
