package com.mohammedabdoh.dsa.datastructures.math;

public class GPTerm {
    public static double solution(int A, int B, int N) {
        
        double commonRatio = B / A;
        double nthTerm = A * Math.pow(commonRatio, (N - 1));

        return nthTerm;
    }
}
