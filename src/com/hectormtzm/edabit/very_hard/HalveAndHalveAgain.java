package com.hectormtzm.edabit.very_hard;

/*
https://edabit.com/challenge/aL3SuicAGjAwgqY2d
Given two integers a and b, return how many times a can be halved while still being greater than b.
Integer a will always be able to be halved at least once in every test case.
HM
 */

public class HalveAndHalveAgain {

    public static void main(String[] args) {
        System.out.println(halveCount(1891, 4));
        System.out.println(halveCount(1756, 14));
        System.out.println(halveCount(4123, 1));
        System.out.println(halveCount(8845, 4));
    }

    public static int halveCount(int a,int b) {
        if (a <= b) return -1;
        return 1 + halveCount((int)Math.ceil((double)a/2), b);
    }
}
