package com.mohammedabdoh.dsa.datastructures.arrays;

// https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArrays {
    public static void solution(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == nums2.length) {
            for (int i = nums1.length - 1; i >= 0; i--) {
                nums1[i] = nums2[i];
            }
        } else {
            int pointer1 = nums1.length - nums2.length - 1;
            int pointer2 = nums2.length - 1;

            if(pointer1 < 0)
                pointer1 = 0;

            for (int i = nums1.length - 1; i >= 0; i--) {
                // If any of the pointers goes below zero
                if(pointer2 < 0) {
                    nums1[i] = nums1[pointer1];
                    pointer1--;
                    continue;
                }
                if(pointer1 < 0) {
                    nums1[i] = nums2[pointer2];
                    pointer2--;
                    continue;
                }

                if(nums1[pointer1] > nums2[pointer2]) {
                    nums1[i] = nums1[pointer1];
                    pointer1--;
                } else {
                    nums1[i] = nums2[pointer2];
                    pointer2--;
                }
            }
        }
    }
}
