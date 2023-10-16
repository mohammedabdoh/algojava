package com.mohammedabdoh.dsa.algorithms.recursion;

public class Print1ToN {
    public static void main(String[] args) {
        solution(6);
    }

    public static void solution(int n) {
        if(n == 0) {
            return;
        }

        solution(n-1);
        System.out.println(n);
    }
}
