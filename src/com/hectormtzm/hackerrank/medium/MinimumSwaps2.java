package com.hectormtzm.hackerrank.medium;

/*
https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=arrays&h_r=next-challenge&h_v=zen
 */

import java.util.Arrays;

public class MinimumSwaps2 {

    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[]{1,3,5,2,4,6,7}));
    }

    static int minimumSwaps(int[] arr) {
        int swaps = 0;

        for (int i = 0, v = 1; i < arr.length; i++, v++){
            if (arr[i] != v){
                int correctIndexValue = findCorrectIndex(arr, v);
                int temp = arr[i];
                arr[i] = arr[correctIndexValue];
                arr[correctIndexValue] = temp;
                swaps++;
            }
        }

        return swaps;
    }

    private static int findCorrectIndex(int[] arr, int v) {
        for (int i =0; i < arr.length; i++){
            if (arr[i] == v){
                return i;
            }
        }
        return 0;
    }
}
