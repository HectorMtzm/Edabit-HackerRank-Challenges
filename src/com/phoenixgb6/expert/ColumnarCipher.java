package com.phoenixgb6.expert;

/*
https://edabit.com/challenge/Gqs4Rzdq5tXNH7RKX
function that takes a string and a keyword. Return the ciphertext if the string is in plaintext (i.e. broken up into normal English words and punctuated), or the deciphered message if the string is in ciphertext. The resulting deciphered message will not have spaces.
HM
 */

public class ColumnarCipher {
    public static void main(String[] args) {
        System.out.println(cipher("Meet me by the lake at midnight. Bring shovel.","python"));
        System.out.println(cipher("meeanbsleyamgioxebltirhxttkihnvxmhedtgex","monty"));
    }

    public static String cipher(String msg, String keyword) {

        if(msg.split(" ").length == 1)
            return decipher(msg, keyword);

        char[] letters = msg.replaceAll("\\s", "")
                .replaceAll("\\.", "")
                .toLowerCase()
                .toCharArray();
        int[] order = findOrder(keyword);
        String encryptedMsg = "";

        char[][] cipher = new char[(int) Math.ceil(letters.length/(double)keyword.length())][keyword.length()];

        //Add message to the cipher
        for (int i = 0, charNum = 0; i < cipher.length; i++){
            for (int j = 0; j < cipher[i].length; j++, charNum++){
                try{
                    cipher[i][j] = letters[charNum];
                } catch (Exception e){
                    cipher[i][j] = 'x';
                }
            }
        }

        // Add the columns in order to the encrypted message
        for (int k = 0; k < keyword.length(); k++){
            String tempWord = "";
            for (int o = 0; o < keyword.length(); o++){
                if (k == order[o]){
                    for (char[] chars : cipher) {
                        tempWord += chars[o];
                    }
                    encryptedMsg += tempWord;
                }
            }
        }

        return encryptedMsg;
    }

    // Finds the order of the characters of the keyword
    private static int[] findOrder(String keyword) {
        int[] order = new int[keyword.length()];
        char[] keywordArr = keyword.toCharArray();
        char smallest;
        int j = 0;
        int smallestPointer;

        for (int i = 0; i < keywordArr.length; i++){
            smallest = keywordArr[0];
            smallestPointer = 0;
            for (; j < keywordArr.length; j++){
                if (keywordArr[j] < smallest) {
                    smallest = keywordArr[j];
                    smallestPointer = j;
                }
            }
            keywordArr[smallestPointer] = '~';
            order[smallestPointer] = i;
            j = 0;
        }
        return order;
    }

    private static String decipher(String msg, String keyword){
        int[] order = findOrder(keyword);
        char[] messageArr = msg.toCharArray();
        StringBuilder message = new StringBuilder();
        int messageArrayPointer = 0;

        char[][] cipher = new char[(int) Math.ceil(msg.length()/(double)keyword.length())][keyword.length()];

        // Add the message to the cipher in the correct order
        for (int i = 0; i < cipher[i].length; i++){
            for (int j = 0; j < order.length; j++){
                if (i == order[j]){
                    for (int z = 0; z < cipher.length; z++){
                        cipher[z][j] = messageArr[messageArrayPointer++];
                    }
                }
            }
        }

        // Amend unencrypted parts to the message
        for (char[] chars : cipher) {
            for (char aChar : chars) {
                message.append(aChar);
            }
        }

        return message.toString();
    }
}
