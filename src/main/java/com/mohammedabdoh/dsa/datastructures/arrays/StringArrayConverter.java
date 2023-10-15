package com.mohammedabdoh.dsa.datastructures.arrays;

import java.util.Arrays;

public class StringArrayConverter {
    public static int[] convertToIntArray(String arr[]) {
        return Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
    }

    public static double[] convertToDoubleArray(String arr[]) {
        return Arrays.stream(arr).mapToDouble(Double::parseDouble).toArray();
    }
}
