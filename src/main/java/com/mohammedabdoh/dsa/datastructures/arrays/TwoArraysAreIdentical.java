package com.mohammedabdoh.dsa.datastructures.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoArraysAreIdentical {
    public static boolean solution(long A[],long B[])
    {
        Map<Long, Integer> elements = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            elements.put(A[i], elements.getOrDefault(A[i], 0) + 1);
        }

        for (int i = 0; i < B.length; i++) {
            if(elements.containsKey(B[i])) {
                int elementOccurences = elements.get(B[i]);
                if(elementOccurences - 1 == 0) {
                    elements.remove(B[i]);
                } else {
                    elements.put(B[i], elements.get(B[i]) - 1);
                }
            }
        }

        return elements.isEmpty();
    }
}
