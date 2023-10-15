package com.mohammedabdoh.dsa.datastructures.bit_magic;

public class FindFirstSetBit {
    public static int solution(int n) {
        int counter = 1;

        if (n == 0)
            return 0;

        while ((1 & n) != 1) {
            counter++;
            n = n >> 1;
        }

        return counter;
    }
}
