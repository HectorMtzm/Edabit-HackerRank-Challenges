package com.hectormtzm.edabit.expert;

/*
https://edabit.com/challenge/RdwGosFoQQT6Z82sm
recursive function that takes a string input and returns the string in a reversed case and order.
No empty strings and will neither contain special characters nor punctuation.
HM
 */

public class CaseAndIndexInverter {

    public static void main(String[] args) {
        System.out.println(invert("This string is CASE and INDEX reversed"));
    }

    public static String invert(String str) {
        if (str.isEmpty()) return str;
        return invert(str.substring(1)) + ((str.charAt(0) == 32) ? ' ': (char)(str.charAt(0)^32)); //0x20 XOR operation
    }
}
