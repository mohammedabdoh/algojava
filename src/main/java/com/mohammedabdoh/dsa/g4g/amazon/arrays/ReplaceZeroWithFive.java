package com.mohammedabdoh.dsa.g4g.amazon.arrays;

/**
 * https://www.geeksforgeeks.org/batch/Amazon-Test-Series/track/amazon-arrays/problem/replace-all-0s-with-5
 */

public class ReplaceZeroWithFive {
    public static int solution(int num){
        int replacedNumber = 0;
        int multiplier = 1;

        while(num > 0) {
            int rem = num % 10;
            replacedNumber += (rem == 0 ? 5 : rem) * multiplier;
            multiplier *= 10;
            num /= 10;
        }

        return replacedNumber;
    }
}
