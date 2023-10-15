package com.mohammedabdoh.dsa.datastructures.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfElementsFrom1ToN {
    public static int[] solution(int arr[], int N, int P)  {
        Map<Integer, Integer> frequencies = new LinkedHashMap<>();

        for (int i = 1; i <= N; i++) {
            frequencies.put(i, 0);
        }

        for (int i = 0; i < N; i++) {
            if(frequencies.containsKey(arr[i])) {
                frequencies.put(arr[i], frequencies.get(arr[i]) + 1);
            }
        }

        int counter = 0;
        for (int value : frequencies.values()) {
            arr[counter++] = value;
        }

        return arr;
    }
}
