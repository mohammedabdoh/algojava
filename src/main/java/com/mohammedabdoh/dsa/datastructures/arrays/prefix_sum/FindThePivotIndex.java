package com.mohammedabdoh.dsa.datastructures.arrays.prefix_sum;

public class FindThePivotIndex {
    public static int solution(int[] nums) {

        int sumBeforeTheCurrentIndex = 0;
        int sumAfterTheCurrentIndex = 0;
        
        for ( int i = 0; i < nums.length; i++ ) {
            if(i == 0) {
                sumBeforeTheCurrentIndex = 0;
            } else {
                sumBeforeTheCurrentIndex = SumOfSubArray.solution(nums, 0, i - 1);
            }
            
            if(i == nums.length - 1) {
                sumAfterTheCurrentIndex = 0;
            } else {
                sumAfterTheCurrentIndex = SumOfSubArray.solution(nums, i + 1, nums.length - 1);
            }
            
            if(sumBeforeTheCurrentIndex == sumAfterTheCurrentIndex) {
                return i;
            }
        }
        
        return -1;
    }
}
