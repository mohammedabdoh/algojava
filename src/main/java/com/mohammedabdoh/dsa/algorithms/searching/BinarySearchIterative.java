package com.mohammedabdoh.dsa.algorithms.searching;

public class BinarySearchIterative {
    public static int solution (int arr[], int num) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = (high + low) / 2;

            if(arr[mid] == num) {
                return mid;
            } else if(arr[mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static int solution2(int arr[], int low, int high, int num) {
        while (low <= high) {
            int mid = (high + low) / 2;

            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

        public static int reversed(int arr[], int low, int high, int num) {
            while (low <= high) {
                int mid = (high + low) / 2;

                if (arr[mid] == num) {
                    return mid;
                } else if (arr[mid] > num) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            return -1;
        }
}
