package com.mohammedabdoh.dsa.datastructures.bit_magic;

public class FindMissingAndRepeatingNumber {
    public static int[] solution(int arr[], int n) {
        // Define a result variable
        int result = 0;

        // Xoring all items in the array by the result
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }

        // Xoring the range from 1 to n
        for (int i = 1; i <= n; i++) {
            result = result ^ i;
        }

        // Now the result is xoring the left 2 items (the repeated and the missing)
        // Lets find the lsb (least set bit)
        int lsb = result & ~(result - 1);
        int l = 0, r = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & lsb) != 0) {
                l = l ^ arr[i];
            } else {
                r = r ^ arr[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            if ((i & lsb) != 0) {
                l = l ^ i;
            } else {
                r = r ^ i;
            }
        }

        return new int[]{l,r};
    }

    public static int[] twoRepeatedNumbers(int arr[], int n) {
        // Define a result variable
        int result = 0;

        // Xoring all items in the array by the result
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }

        // Xoring the range from 1 to n
        for (int i = 1; i <= n; i++) {
            result = result ^ i;
        }

        // Now the result is xoring the left 2 items (the repeated and the missing)
        // Lets find the lsb (least set bit)
        int lsb = result & ~(result - 1);
        int l = 0, r = 0;

        for (int i = 0; i < arr.length; i++) {
            if((arr[i] & lsb) != 0) {
                l = l ^ arr[i];
            } else {
                r = r ^ arr[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            if ((i & lsb) != 0) {
                l = l ^ i;
            } else {
                r = r ^ i;
            }
        }

        int lComesAt = -1;
        int rComesAt = -1;
        int lEndsAt = -1;
        int rEndsAt = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == l && lComesAt == -1) {
                lComesAt = i;
            } else if(arr[i] == r && rComesAt == -1) {
                rComesAt = i;
            } else if(arr[i] == l) {
                lEndsAt = i;
            } else if(arr[i] == r) {
                rEndsAt = i;
            }
        }
        
        int output[] = new int[2];
        
        if(lComesAt < rComesAt) {
            if(lEndsAt < rComesAt || lEndsAt < rEndsAt) {
                output[0] = l;
                output[1] = r;
            } else {
                output[0] = r;
                output[1] = l;
            }
        } else {
            if(rEndsAt < lComesAt || rEndsAt < lEndsAt) {
                output[0] = r;
                output[1] = l;
            } else {
                output[0] = l;
                output[1] = r;
            }
        }
        
        return output;
    }
}
