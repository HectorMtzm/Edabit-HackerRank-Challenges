package com.phoenixgb6.hard;

/*
https://edabit.com/challenge/MYtinBHDSk4Bk7HnH
Function that will return the longest word in a sentence.
In cases where more than one word is found, return the first one.
Special characters and symbols don't count as part of the word.
Return the longest word found in lowercase letters.
HM
 */

import java.util.Arrays;

public class FindTheLongestWord {

    public static void main(String[] args) {
        
        System.out.println(findLongest("Hello darkness my old friend."));
        System.out.println(findLongest("Yourself is your soul's captain and fate's master."));
        System.out.println(findLongest("\"Strengths\" is the longest and most commonly used word that contains only a single vowel."));
    }

    public static String findLongest(String sentence) {
        String[] arr = sentence.replaceAll("([.,\"]|'s)", "").split(" ");
        return Arrays.stream(arr).reduce((a, b) -> (a.length() > b.length()) ? a : b).get().toLowerCase();
    }
}
