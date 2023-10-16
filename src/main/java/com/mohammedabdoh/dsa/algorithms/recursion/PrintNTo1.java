package com.mohammedabdoh.dsa.algorithms.recursion;

public class PrintNTo1 {
    public static void main(String[] args) {
        solution(3);
    }

    public static void solution(int n) {
        if(n == 0) {
            return;
        }

        System.out.println(n);
        solution(n-1);
    }
}
