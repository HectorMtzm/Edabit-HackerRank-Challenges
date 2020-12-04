package com.hectormtzm.edabit.expert;

/*
 https://edabit.com/challenge/D33ry6zNZzRyuQRPF
 Function that takes time t1 and time t2 and returns the numbers of hours passed between the two times.
 Time t1 will always be the starting time and t2, the ending time.
 Return the string "No time has passed." if t1 is equal to t2.
 HM
*/

public class HoursPassed {
    public static void main(String[] args) {
        System.out.println(hoursPassed("2:00 PM", "4:00 PM"));
        System.out.println(hoursPassed("1:00 AM", "3:00 PM"));
        System.out.println(hoursPassed("8:00 AM", "8:00 PM"));
        System.out.println(hoursPassed("12:00 AM", "10:00 PM"));
        System.out.println(hoursPassed("12:00 PM", "12:00 PM"));
    }

    public static String hoursPassed(String t1, String t2) {
        String[] first = t1.split("\\s|:");
        String[] second = t2.split("\\s|:");

        int firstHour = Integer.parseInt(first[0]);
        int secondHour = Integer.parseInt(second[0]);

        if (firstHour == secondHour) {
            if (!first[2].equals(second[2]))
                return "12 hours";
            return "No time has passed.";
        }
        if (first[2].equals(second[2]))
            return (secondHour - firstHour) + " hours";

        if (firstHour == 12 && first[2].equals("AM"))
            firstHour = 0;

        return Math.abs((secondHour + 12) - firstHour) + " hours";
    }
}
