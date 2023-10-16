package com.mohammedabdoh.dsa.algorithms.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int total = sumOfDigits(361);
        System.out.println(total);
    }

    public static int sumOfDigits(int n) {
        if(n < 0)
            n = Math.abs(n);
        if(n == 0)
            return n;
        return n % 10 + sumOfDigits(n / 10);
    }
}
