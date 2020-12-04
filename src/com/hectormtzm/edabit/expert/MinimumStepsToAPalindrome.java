package com.hectormtzm.edabit.expert;

/*
https://edabit.com/challenge/SYTk43tp4y6oA5zGn
Given an incomplete palindrome as a string, return the minimum letters needed to be
added on to the end to make the string a palindrome.
Trivially, words which are already palindromes should return 0.
HM
 */

public class MinimumStepsToAPalindrome {

    public static void main(String[] args) {
        System.out.println(minPalindromeSteps("rorr"));
        System.out.println(minPalindromeSteps("pole"));
        System.out.println(minPalindromeSteps("madam"));
        System.out.println(minPalindromeSteps("mirror"));
    }

    public static int minPalindromeSteps(String str) {
        if (str.equals(invert(str))) return 0;
        return (1 + minPalindromeSteps(str.substring(1)));
    }

    public static String invert(String str) {
        if (str.isEmpty()) return str;
        return invert(str.substring(1)) + str.charAt(0);
    }
}
