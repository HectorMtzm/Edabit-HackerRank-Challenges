package com.hectormtzm.edabit.expert;

/*
https://edabit.com/challenge/XXF7YysFvEqv4FJ8n
function that accepts an array of numbers (where each number appears three times except for one which appears only once)
and finds that unique number in the array and returns it.
HM
 */

import java.util.HashMap;
import java.util.Map;

public class FindtheSingleNumber {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {0, 1, 0, 1, 0, 1, 99}));
    }

    public static int singleNumber(int[] n) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int num : n){
            if (!hashMap.containsKey(num))
                hashMap.put(num, 1);
            else
                hashMap.put(num, hashMap.get(num)+1);
        }

        for (int key : hashMap.keySet()){
            if (hashMap.get(key) < 3)
                return key;
        }

        return 0;
    }
}
