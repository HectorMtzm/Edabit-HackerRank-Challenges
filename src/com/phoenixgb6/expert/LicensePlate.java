package com.phoenixgb6.expert;

/*
https://edabit.com/challenge/qafJTrENQeMq6apgy
Function that can format the dmv number into a plate number with correct grouping.
The function input consists of string s and group length n. The output has to be upper case
characters and digits. The new groups are made from right to left and connected by '-'.
The original order of the dmv number is preserved.
recursive approach.
HM
 */

public class LicensePlate {

    public static void main(String[] args) {
        System.out.println(licensePlate("1234567890", 3));
        System.out.println(licensePlate("2-5g-3-J", 2));
        System.out.println(licensePlate("2-4A0r7-4k", 3));
    }

    public static String licensePlate(String code, int len) {
        if (code.length() <= len) return code;

        if (code.contains("-"))
            code = code.replaceAll("-", "").toUpperCase();

        return ((code.length()%len == 0) ? (code.substring(0,len) + "-" + licensePlate(code.substring(len), len))
                : (code.substring(0, code.length()%len)) + "-" + licensePlate(code.substring(code.length()%len), len));
    }
}
