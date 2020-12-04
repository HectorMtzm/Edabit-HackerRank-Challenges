package com.hectormtzm.edabit.hard;

/*
https://edabit.com/challenge/KgR2JhEuGD7onbMLx
Function that takes a number and returns one digit that is the result of summing all
the digits of the input number. When the sum of the digits consists of more than one digit,
repeat summing until you get one digit.
HM
 */

public class DigitsSumRoot {

    public static void main(String[] args) {
        System.out.println(digitRoot(999888777));
        System.out.println(digitRoot(1799877799877998777L));
        System.out.println(digitRoot(9876546839792379L));
    }

    public static int digitRoot(long n) {
        if (n < 10) return (int)n;
        return digitRoot(sumAllDigits(n));
    }

    private static long sumAllDigits(long n){
        long sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n/10;
        }
        return sum;
    }
}
