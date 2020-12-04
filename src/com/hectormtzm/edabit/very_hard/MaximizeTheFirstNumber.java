package com.hectormtzm.edabit.very_hard;

/*
Function that makes the first number as large as possible by swapping out its digits for digits in the second number.
    Each digit in the second number can only be used once.
    Zero to all digits in the second number may be used.
HM
 */

import java.util.Arrays;

public class MaximizeTheFirstNumber {
    public static void main(String[] args) {
        System.out.println(maxPossible(523, 76));
    }

    public static int maxPossible(int n1, int n2) {
        char[] num1 = ("" + n1).toCharArray();
        char[] num2 = ("" + n2).toCharArray();
        boolean[] used = new boolean[num2.length];

        Arrays.sort(num2);

        for (int i = 0; i < num1.length; i++){
            for (int j = num2.length-1; j > -1; j--){
                if (num1[i] < num2[j] && !used[j]){
                    num1[i] = num2[j];
                    used[j] = true;
                }
            }
        }

        return Integer.parseInt(String.valueOf(num1));
    }
}