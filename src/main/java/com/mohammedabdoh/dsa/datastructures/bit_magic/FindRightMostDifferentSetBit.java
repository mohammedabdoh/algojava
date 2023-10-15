package com.mohammedabdoh.dsa.datastructures.bit_magic;

public class FindRightMostDifferentSetBit {
    public static int solution(int n, int m) {
        if (n == m)
            return -1;
        if (n == 0) {
            return FindFirstSetBit.solution(m);
        }
        if (m == 0) {
            return FindFirstSetBit.solution(n);
        }

        int counter = 1;

        while ((n & 1) == (m & 1)) {
            counter++;
            n = n >> 1;
            m = m >> 1;
        }

        return counter;
    }
}
