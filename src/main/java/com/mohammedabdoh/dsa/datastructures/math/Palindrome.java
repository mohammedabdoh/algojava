package com.mohammedabdoh.dsa.datastructures.math;

public class Palindrome {
    public static boolean solution(int num) {
        int rev = ReverseANumber.solution(num);

        if(rev == num) return true;

        return false;
    }
}
