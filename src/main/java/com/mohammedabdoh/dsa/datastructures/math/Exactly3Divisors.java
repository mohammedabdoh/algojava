package com.mohammedabdoh.dsa.datastructures.math;

public class Exactly3Divisors {
    public static int solution(int N)
    {
        int countOfNumbers = 0;
        for (int i = 2; i * i <= N; i++) {
            if(isPrime(i)) {
                if(i * i <= N) {
                    countOfNumbers++;   
                }
            }
        }
        return countOfNumbers;
    }
    
    private static boolean isPrime(int N) {
        
        if(N == 2 || N == 3) {
            return true;
        }
        
        if(N % 2 == 0 || N % 3 == 0 || N <= 1) {
            return false;  
        }
        
        for (int i = 5; i * i <= N; i += 6) {
            if (N % i == 0 || N % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }
}
