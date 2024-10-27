package com.learnprogramminginjava.control;

import java.util.Calendar;

public class IfElse {
    public static void main(String[] args) {

        int today = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        boolean isMonday = (today == Calendar.MONDAY);
        boolean isTheWeekend = (today == Calendar.SATURDAY) || (today == Calendar.SUNDAY);

        if (isMonday) {
            System.out.println("You have a case of the Mondaze :(");
        } else if (isTheWeekend) {
            System.out.println("Happy Weekend! :)");
        } else {
            System.out.println("You in a weekday :|");
        }
    }
}
