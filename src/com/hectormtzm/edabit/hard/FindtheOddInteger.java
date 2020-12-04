package com.hectormtzm.edabit.hard;

/*
https://edabit.com/challenge/8SHAyg8kdX8y72S3z
function that takes an array and finds the integer which appears an odd number of times.
There will always only be one integer that appears an odd number of times.
HM
 */

import java.util.HashMap;

public class FindtheOddInteger {

    public static void main(String[] args) {
        System.out.println(findOdd(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
        System.out.println(findOdd(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
        System.out.println(findOdd(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
    }

    public static int findOdd(int[] arr) {
        HashMap<Integer, Integer> repeatedTimes = new HashMap<>();
        for (int v : arr){
            if (repeatedTimes.containsKey(v)) repeatedTimes.replace(v, repeatedTimes.get(v) + 1);
            else repeatedTimes.put(v, 1);
        }
        for (Integer k : repeatedTimes.keySet()){
            if (repeatedTimes.get(k) % 2 != 0) return k;
        }
        return 0;
    }
}
