package com.hectormtzm.edabit.very_hard;

/*
https://edabit.com/challenge/PkqSq3ea2bfJvF6Tk
return a sorted array of words formed from the first three letters, then the next three letters,
shifting by only one
 */

import java.util.Arrays;
import java.util.stream.Stream;

public class TripleLetterGroupings {

    public static void main(String[] args) {
        threeLetterCollection("slap");
    }

    public static String[] threeLetterCollection(String s) {
        if (s.length() < 3) return new String[0];

        String[] arr = new String[1];
        arr[0] = s.substring(0,3);

        return Stream.concat(Arrays.stream(arr), Arrays.stream(threeLetterCollection(s.substring(1)))).sorted().toArray(String[]::new);
    }
}
