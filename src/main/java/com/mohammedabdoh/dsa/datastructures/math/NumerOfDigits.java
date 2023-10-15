package com.mohammedabdoh.dsa.datastructures.math;

public class NumerOfDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(123456789));
    }
    
    public static int countDigitsRecursive(int n) {
        // base case: if n is 0, return 0
        if (n == 0) return 0;
        // recursive case: return 1 + the number of digits in n / 10
        return 1 + countDigitsRecursive(n / 10);
    }
    
    public static int countDigitsIterative(int n) {
        if (n == 0) return 1;
        int count = 0; // counts the number of digits
        while (n != 0) {
            n /= 10; // remove the last digit
            count++; // increase the digit count
        }
        return count;
    }

    public static int countDigits(int n) {
        // First, we need to take the absolute value of n
        int absN = Math.abs(n);
        // Next, we need to take the log base 10 of this value.
        double logN = Math.log10(absN);
        // Finally, we need to add 1 to this value.
        int digits = (int) logN + 1;
        return digits;
    }
}
