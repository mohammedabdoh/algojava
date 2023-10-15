package com.mohammedabdoh.dsa.algorithms.greedy;

public class MinimumSwitchesToTurnAllBulbsOn {
    public static int solution(int arr[]) {
        int cost = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (cost % 2 == 0) {
                arr[i] = arr[i];
            } else {
                arr[i] = arr[i] == 0 ? 1 : 0;
            }
            
            if(arr[i] % 2 == 1) {
                continue;
            } else {
                cost++;
            }
        }
        
        return cost;
    }
}
