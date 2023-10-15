package com.mohammedabdoh.dsa.algorithms.searching;

public class SquareRootFloor {
    public static long solution(int x) {
        long low = 0, high = x, answer = -1, mid, result;

        while (low <= high) {
            mid = (low + high) / 2;
            result = mid * mid;

            if (result > x) {
                high = mid - 1;
            } else if (result <= x) {
                low = mid + 1;
                answer = mid;
            }
        }

        return answer;
    }
}
