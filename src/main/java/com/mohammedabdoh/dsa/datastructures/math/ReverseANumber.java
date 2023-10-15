package com.mohammedabdoh.dsa.datastructures.math;

public class ReverseANumber {
    public static int solution(int num) {
        int rev = 0;

        while (num > 0) {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }
        
        return rev;
    }
}
