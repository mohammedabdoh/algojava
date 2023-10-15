package com.mohammedabdoh.dsa.datastructures.arrays;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static int[] solution(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> similarItemsArray = new ArrayList<>();

        int pointer1 = 0;
        int pointer2 = 0;

        int maxIteration = Math.max(nums1.length, nums2.length);

        for (int i = 0; i < maxIteration; i++) {
            if(pointer1 == nums1.length || pointer2 == nums2.length)
                break;

            while(nums1[pointer1] < nums2[pointer2]) {
                if(pointer1 + 1 < nums1.length) {
                    pointer1++;
                } else {
                    break;
                }
            }

            while(nums2[pointer2] < nums1[pointer1]) {
                if(pointer2 + 1 < nums2.length) {
                    pointer2++;
                } else {
                    break;
                }
            }

            if(nums1[pointer1] == nums2[pointer2]) {
                similarItemsArray.add(nums1[pointer1]);
                pointer1++;
                pointer2++;
            }
        }

        return similarItemsArray.stream().mapToInt(Integer::intValue).toArray();
    }
}
