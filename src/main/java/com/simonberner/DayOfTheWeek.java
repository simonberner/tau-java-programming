package com.simonberner;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DayOfTheWeek {

    private static List<String> weekDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
    private static Scanner input = new Scanner(System.in);


    public static void main(String args[]) {
        System.out.println("Enter then number [1-7] of your weekday: #");
        try {
            int yourWeekDay = input.nextInt() - 1;
            System.out.println("Your weekday is: " + weekDays.get(yourWeekDay));
        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            //System.err.println("Only valid weekdays number from 1-7 are allowed! " + e.toString());
            System.out.println("Only valid weekdays numbers from 1-7 are allowed! (Error message: " + e.toString() + ")");
        } finally {
            input.close();
        }


    }

}
