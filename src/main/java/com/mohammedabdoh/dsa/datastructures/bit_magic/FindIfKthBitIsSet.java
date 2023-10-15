package com.mohammedabdoh.dsa.datastructures.bit_magic;

public class FindIfKthBitIsSet {
    public static boolean solution(int n, int k) {
        // Using the left shifting operator

        if((n & (1 << (k-1))) != 0) {
            return true;
        }

        return false;
    }

    public static boolean solution2(int n, int k) {
        // Using the right shifting operator

        if ((1 & (n >> (k - 1))) == 1) {
            return true;
        }

        return false;
    }
}
