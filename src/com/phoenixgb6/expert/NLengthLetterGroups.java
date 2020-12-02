package com.phoenixgb6.expert;

/*
https://edabit.com/challenge/DbqdoQDMv88NHSgi4
Function that returns an array of strings populated from the slices of n-length characters of the
given word (a slice after another while n-length applies onto the word).
Return an empty array if the given string is less than n.
recursive approach.
HM
 */

import java.util.ArrayList;
import java.util.Arrays;

public class NLengthLetterGroups {

    public static void main(String[] args) {
        Arrays.stream(collect("intercontinentalisationalism", 6)).forEach(System.out::println);
        Arrays.stream(collect("strengths", 3)).forEach(System.out::println);
        Arrays.stream(collect("pneumonoultramicroscopicsilicovolcanoconiosis", 15)).forEach(System.out::println);
    }

    public static String[] collect(String s, int n) {
        if (n > s.length()) return new String[0];

        ArrayList<String> list = new ArrayList<>();
        list.add(s.substring(0, n));
        list.addAll(Arrays.asList(collect(s.substring(n), n)));
        return list.stream().sorted().toArray(String[]::new);
    }

}
