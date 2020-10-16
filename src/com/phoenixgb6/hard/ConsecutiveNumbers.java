package com.phoenixgb6.hard;

/*
https://edabit.com/challenge/Md6usCHQ7Xsj2fQi3
function that determines whether elements in an array can be re-arranged to
form a consecutive list of numbers where each number appears exactly once.
HM
*/

public class ConsecutiveNumbers {

    static int[] numbers = {5, 1, 4, 3, 2};

    public static void main(String[] args) {
        System.out.println(cons());
    }

    static boolean cons(){

        if (numbers == null) return false;
        if (numbers.length < 2) return false;
        if (numbers.length == 2) return Math.abs(numbers[0] - numbers[1]) == 1;

        int minNum = findMin();
        int maxNum = findMax();
        int minAndMaxSum;
        int othersSum = 0;

        //length of the array minus the max and min.
        int length = numbers.length - 2;

        for (int n : numbers){
            othersSum += n;
        }

        minAndMaxSum = minNum + maxNum;
        othersSum = othersSum - minAndMaxSum;

        // if min+max * length-2 == the sum of the other numbers * 2 then return true
        return (minNum + maxNum) * length == othersSum << 1;
    }

    // Finds the largest number of the array
    static int findMax() {
        int maxNum = numbers[0];

        for (int n : numbers){
            if(n > maxNum)
                maxNum = n;
        }
        return maxNum;
    }

    // Finds the smallest number of the array
    static int findMin(){
        int minNum = numbers[0];

        for (int n : numbers){
            if(n < minNum)
                minNum = n;
        }
        return minNum;
    }
}
