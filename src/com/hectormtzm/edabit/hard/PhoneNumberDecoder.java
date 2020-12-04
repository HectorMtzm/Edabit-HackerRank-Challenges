package com.hectormtzm.edabit.hard;

/*
https://edabit.com/challenge/8NZaLdJBkhZCgNBc7
program that converts a phone number with letters to one with only numbers.
HM
 */

public class PhoneNumberDecoder {

    static String pNumber = "123-647-EYES";

    public static void main(String[] args) {
        System.out.println(decodePhoneNumber());
    }

    static String decodePhoneNumber(){
        if (pNumber == null) return "Not valid";
        if (pNumber.length() < 12) return "Not valid";

        char[] pNumArr = pNumber.toCharArray();

        for (int i = 0; i < pNumber.length(); i++){
            if((int) pNumArr[i] > 89);
            else if((int) pNumArr[i] > 86) pNumArr[i] = '9';
            else if((int) pNumArr[i] > 83) pNumArr[i] = '8';
            else if((int) pNumArr[i] > 79) pNumArr[i] = '7';
            else if((int) pNumArr[i] > 76) pNumArr[i] = '6';
            else if((int) pNumArr[i] > 73) pNumArr[i] = '5';
            else if((int) pNumArr[i] > 70) pNumArr[i] = '4';
            else if((int) pNumArr[i] > 67) pNumArr[i] = '3';
            else if((int) pNumArr[i] > 64) pNumArr[i] = '2';

        }
        return String.valueOf(pNumArr);
    }
}
