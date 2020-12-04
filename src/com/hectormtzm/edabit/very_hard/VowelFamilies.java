package com.hectormtzm.edabit.very_hard;

/*
https://edabit.com/challenge/9P6yDuSZxYTihMtT6
Write a function that selects all words that have all the same vowels
(in any order and/or number) as the first word, including the first word.
Words will contain only lowercase letters, and may contain whitespaces.
Frequency does not matter.
HM
 */

import java.util.ArrayList;
import java.util.List;

public class VowelFamilies {

    public static void main(String[] args) {
        System.out.println(sameVowelGroup(new String[]{"hoops", "chuff", "bot", "bottom"}));
        System.out.println(sameVowelGroup(new String[]{"crop", "nomnom", "bolo", "yodeller"}));
        System.out.println(sameVowelGroup(new String[]{"semantic", "aimless", "beautiful", "meatless icecream"}));
    }

    public static String[] sameVowelGroup(String[] words) {

        List<String> list = new ArrayList<>();
        StringBuilder goodVowels = new StringBuilder();
        String badVowels =  "aeiou";

//        String goodVowels = "";
//        goodVowels = Arrays.stream(words[0].split("")).filter(v -> v.matches("[aeiou]")).distinct().collect(Collectors.joining());

        for (char c : words[0].toCharArray()){
            switch (c){
                case 'a': case 'e': case 'i':
                case 'o': case 'u':
                    if (goodVowels.indexOf(String.valueOf(c)) == -1)
                        goodVowels.append(c);
            }
        }

        badVowels = badVowels.replaceAll("[" + goodVowels + "]", "");

        for (String w : words){
            if (w.matches(".*[" + goodVowels.toString() + "]+.*") && !w.matches(".*[" + badVowels + "]+.*"))
                list.add(w);
        }
        return list.toArray(String[]::new);
    }
}
