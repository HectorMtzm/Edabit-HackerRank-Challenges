package com.hectormtzm.hackerrank.medium;

/*
https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
HM
 */

import java.util.Arrays;

public class NewYearChaos {
    public static void main(String[] args) {
        minimumBribes(new int[]{2,1,5,3,4});
    }

    static void minimumBribes(int[] q) {
        boolean chaotic = false;
        int[] correct = new int[q.length];
        int[] individualBribes = new int[q.length];

        for (int i = 1; i < q.length+1; i++)
            correct[i-1] = i;

        while (!Arrays.equals(q, correct)){
            for (int i = q.length; i > 1; i--){
                int temp = q[i-1];
                if (q[i-1] < correct[i-1] && q[i-1] < q[i-2]){
                    individualBribes[q[i-2]-1]++;
                    q[i-1] = q[i-2];
                    q[i-2] = temp;
                }
                else if(q[i-1] > correct[i-1] && q[i-1] > q[i]){
                    individualBribes[q[i-1]-1]++;
                    q[i-1] = q[i];
                    q[i] = temp;
                }
            }
        }

        for (int num : individualBribes){
            if (num > 2) {
                chaotic = true;
                break;
            }
        }

        System.out.println(chaotic ? "Too chaotic" : Arrays.stream(individualBribes).reduce( (a,b) -> a+=b).getAsInt());
    }

}
