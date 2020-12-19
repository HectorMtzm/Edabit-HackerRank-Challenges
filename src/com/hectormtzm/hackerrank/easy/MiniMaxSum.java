package com.hectormtzm.hackerrank.easy;

/*
https://www.hackerrank.com/challenges/mini-max-sum/problem
HM
 */

import java.util.Arrays;

public class MiniMaxSum {

    public static void main(String[] args) {
        miniMaxSum(new int[]{5,2,3,4,1});
    }

    static void miniMaxSum(int[] arr) {
        arr = Arrays.stream(arr).sorted().toArray();

        System.out.println(
                Arrays.stream(arr).mapToLong(i -> i).limit(arr.length-1).sum() +
                " " +
                Arrays.stream(arr).mapToLong(i -> i).skip(1).sum());
    }
}
