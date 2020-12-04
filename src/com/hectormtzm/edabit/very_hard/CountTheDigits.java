package com.hectormtzm.edabit.very_hard;

/*
https://edabit.com/challenge/vpSCPsQKcQwnFdMS4
function that will recursively count the number of digits of a number.
Conversion of the number to a string is not allowed, thus, the approach is recursive.
HM
 */

public class CountTheDigits {

    public static void main(String[] args) {
        System.out.println(digitsCount(-231200000));
        System.out.println(digitsCount(1283939312321L));
        System.out.println(digitsCount(0));
    }

    public static int digitsCount(long n) {
        if (n/10 == 0) return 1;
        return 1 + digitsCount(n/10);
    }
}
