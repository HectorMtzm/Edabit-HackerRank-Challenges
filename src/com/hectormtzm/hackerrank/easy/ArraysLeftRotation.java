package com.hectormtzm.hackerrank.easy;

/*
https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
https://www.hackerrank.com/challenges/array-left-rotation/problem
HM
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysLeftRotation {

    public static void main(String[] args) {
        Arrays.stream(rotLeft(new int[]{1,2,3,4,5}, 4)).forEach(System.out::println);
        rotateLeft(4, Arrays.asList(1,2,3,4,5)).stream().forEach(System.out::println);
    }

    static int[] rotLeft(int[] arr, int d) {
        int temp;

        for (int i = 0; i < d; i++){
            temp = arr[0];

            for (int j = 0; j < arr.length-1; j++)
                arr[j] = arr[j+1];

            arr[arr.length-1] = temp;
        }

        return arr;
    }

    //This is for lists. rotates by the number 'd' instead of 1 by 1. More efficient.
    public static List<Integer> rotateLeft(int d, List<Integer> list) {
        int size = list.size();
        List<Integer> tempList = new ArrayList<>(d);

        for (int i = 0; i < d; i++)
            tempList.add(list.get(i));

        for (int i = 0; i < size-d; i++)
            list.set(i, list.get(i+d));

        for (int i = size-d, j = 0; j < tempList.size(); i++, j++)
            list.set(i, tempList.get(j));

        return list;
    }

}
