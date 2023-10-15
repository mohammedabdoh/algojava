package com.mohammedabdoh.dsa.datastructures.math;

public class FactorialOfANumber {
    public static double solution(int num) {
        double result = 1;
        
        while(num > 0) {
            result *= num--;
        }

        return result;
    }
}
