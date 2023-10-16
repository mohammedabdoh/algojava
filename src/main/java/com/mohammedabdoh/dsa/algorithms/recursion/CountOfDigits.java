package com.mohammedabdoh.dsa.algorithms.recursion;

public class CountOfDigits {
    public static void main(String[] args) {
        int total = countOfDigits(361);
        System.out.println(total);
    }

    public static int countOfDigits(int n) {
        if(n < 10)
            return 1;
        return 1 + countOfDigits(n / 10);
    }
}
