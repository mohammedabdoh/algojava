package com.mohammedabdoh.dsa.datastructures.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromSortedArrat {
    public static int[] solution(int[] arr) {
        // Using hashing (HashSet) -> Space complexity will be O(N)
        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : arr) {
            uniqueElements.add(num);
        }

        return uniqueElements.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int[] arr) {
        int arrSize = arr.length;

        if(arrSize <= 1) {
            return arr;
        }

        int leftPointer = 0;
        int rightPointer = leftPointer + 1;

        while(true) {
            while(arr[leftPointer] == arr[rightPointer]) {
                arr[rightPointer++] = Integer.MIN_VALUE;
            }
            leftPointer = rightPointer;
            rightPointer++;
            
            if(leftPointer == arrSize - 1 || rightPointer == arrSize - 1) {
                break;
            }
        }

        leftPointer = 0;
        rightPointer = arrSize -1;

        // while(leftPointer <= rightPointer) {
        //     if(arr[leftPointer] == Integer.MIN_VALUE) {
        //         leftPointer++;
        //     } else {
        //         if(arr[rightPointer] != Integer.MIN_VALUE) {
        //             arr[leftPointer] = arr[rightPointer];
        //             arr[rightPointer] = 0;
        //             leftPointer++;
        //             rightPointer--;
        //         }
        //     }
        // }

        return arr;
    }
}
