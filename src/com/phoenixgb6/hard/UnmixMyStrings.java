package com.phoenixgb6.hard;

/*
https://edabit.com/challenge/XRAGxXj4KtakkvD3F
 Function that switch pair of characters
 The length of a string can be odd — in this case the last character is not altered (as there's nothing to swap it with).
 HM
 */

import java.util.ArrayList;
import java.util.List;

public class UnmixMyStrings {
    public static void main(String[] args) {
        System.out.println(unmix("123456"));
        System.out.println(unmix(" Imaf eeilgna l tilt eidzz!y"));
        System.out.println(unmix("badce"));
    }

    public static String unmix(String str) {

        List<String> list = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i+2 <= str.length(); i+=2)
            list.add(str.substring(i,i+2));

        if (str.length()%2 != 0)
            list.add(""+str.charAt(str.length()-1));

        for (String temp : list)
            result.append(invert(temp));

        return result.toString();
    }
    private static String invert(String str){
        if (str.length() == 1) return str;
        return invert(str.substring(1)) + str.charAt(0);
    }

}
