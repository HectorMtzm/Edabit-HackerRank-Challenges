package com.hectormtzm.hackerrank.easy;

/*
https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
HM
 */

public class TwoDArrays {

    public static void main(String[] args) {
        int[][] arr = {
                {0,-4,-6,0,-7,-6},
                {-1,-2,-6,-8,-3,-1},
                {-8,-4,-2,-8,-8,-6},
                {-3,-1,-2,-5,-7,-4},
                {-3,-5,-3,-6,-6,-6},
                {-3,-6,0,-8,-6,-7}
        };
        System.out.println(hourglassSum(arr));
    }

    static int hourglassSum(int[][] arr) {
        // smallest number possible
        int maxSum = -63;

        for (int i = 1; i < arr.length-1; i++){
            for (int j = 1; j < arr.length-1; j++){
                int tempSum = arr[i][j];
                tempSum += arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];

                if (tempSum > maxSum)
                    maxSum=tempSum;
            }
        }

        return maxSum;
    }

}
