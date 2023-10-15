package com.mohammedabdoh.dsa.datastructures.bit_magic;

public class Bitwise {
    public static void solution() {

        /**
         * 128  64  32  16  8   4   2   1
         */
        int a = 5; // 00001101
        int b = 14; // 00001110

        /**
         * AND operator
         * 1 + 0 = 0
         * 1 + 0 = 0
         * 1 + 1 = 1 (4)
         * 1 + 1 = 1 (8)
         * => 12
         * 00001101 (a * 2^4)
         */


        System.out.println(String.format("a & b is %d", a & b));
        System.out.println(String.format("a | b is %d", a | b));
        System.out.println(String.format("a ^ b is %d", a ^ b));
        System.out.println(String.format("a << 1 is %d", a << 4));
        System.out.println(String.format("a >> 1 is %d", a >> 1));
        System.out.println(String.format("~a is %d", ~a));
    }
}
