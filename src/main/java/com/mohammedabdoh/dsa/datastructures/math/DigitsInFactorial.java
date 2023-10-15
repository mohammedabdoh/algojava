package com.mohammedabdoh.dsa.datastructures.math;

public class DigitsInFactorial {
    public static int solution(int N) {
        return numberOfDigits(factorial(N));
    }

    private static double factorial(int N) {
        double result = 1;

        while(N > 0) {
            result *= N--;
        }

        return result;
    }

    private static int numberOfDigits(double num) {
        return (int) Math.floor(Math.log10(num) + 1);
    }
}
