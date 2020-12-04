package com.hectormtzm.edabit.expert;

/*
https://edabit.com/challenge/3FAMXz4wAYGqpCtDR
function that divides a phrase into word buckets, with each bucket containing n or fewer characters. Only include full words inside each bucket.
HM
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBuckets {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(bucketize("a b c d e", 1));

        for (String sentence : list)
            System.out.println(sentence);
    }

    public static String[] bucketize(String phrase, int limit) {
        String[] stringArr = phrase.split(" ");
        String[] result;
        ArrayList<String> resultList = new ArrayList<>();
        StringBuilder tempSentence = new StringBuilder();

        for (String word : stringArr){
            if (word.length() + tempSentence.length() <= limit){

                if(tempSentence.length() == 0 && word.length() + 1 > limit && limit != 1)
                    continue;

                tempSentence.append(word).append(" ");

                if (tempSentence.length() >= limit) {
                    resultList.add(tempSentence.toString());
                    tempSentence.setLength(0);
                }
            }
            else if (tempSentence.length() != 0){
                resultList.add(tempSentence.toString());
                tempSentence.setLength(0);
                tempSentence.append(word).append(" ");
            }
            else
                tempSentence.setLength(0);
        }

        if (tempSentence.length() != 0)
            resultList.add(tempSentence.toString());

        result = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++)
            result[i] = resultList.get(i).trim();

        return result;
    }
}
