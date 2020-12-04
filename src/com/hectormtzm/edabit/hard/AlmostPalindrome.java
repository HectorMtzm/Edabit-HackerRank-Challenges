package com.hectormtzm.edabit.hard;

/*
https://edabit.com/challenge/E9AHcnWg7fDfardLF
A string is an almost-palindrome if, by changing only one character, you can make it a palindrome.
Function that returns true if a string is an almost-palindrome and false otherwise.
Return false if the string is already a palindrome.
HM
 */

public class AlmostPalindrome {

    public static void main(String[] args) {
        System.out.println(almostPalindrome("abcdcbg"));
        System.out.println(almostPalindrome("GIGGG"));
        System.out.println(almostPalindrome("1234312"));
    }

    public static boolean almostPalindrome(String str) {
        int count = 0;

        for (int i = 0, end = str.length()-1; i < str.length()/2; i++, end--){
            if (str.charAt(i) != str.charAt(end))
                count++;
        }
        return (count == 1);
    }
}
