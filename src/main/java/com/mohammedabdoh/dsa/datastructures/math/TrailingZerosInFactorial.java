package com.mohammedabdoh.dsa.datastructures.math;

public class TrailingZerosInFactorial {
    public static int solution(int num) {
        // all the way up to the number you might have 
        // numbers that have 5 as its prime factor. We need
        // to count those 5s
        
        int countOfTrailingZeros = 0;

        for (int i = 5; i <= num; i *= 5) {
            countOfTrailingZeros += num / i;
        }

        return countOfTrailingZeros;
    }
}
