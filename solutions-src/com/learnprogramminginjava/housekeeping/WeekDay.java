package com.learnprogramminginjava.housekeeping;

public enum WeekDay {
    Sun,
    Mon,
    Tue,
    Wed,
    Thu,
    Fri,
    Sat
}

class DisplayEnums{
    public static void main(String[] args) {
        WeekDay today = WeekDay.valueOf("Sun");

        // Process this day
        processWeekDay(today);

        System.out.println("---------------------------");

        // Process all the days
        processAllWeekDay();

        System.out.println("---------------------------");

        WeekDay weekDayAsEnum = getWeekDay("Sat");

        System.out.println("Today's Enum is : " + weekDayAsEnum);

    }

    static public void processWeekDay(WeekDay weekDay){
        System.out.println(weekDay);
    }

    static public void processAllWeekDay(){
        for (WeekDay weekDay : WeekDay.values()){ // .values() in the for loop
            System.out.print(weekDay);
            System.out.print(" : ");
            System.out.println(weekDay.ordinal()); // what is the ordinal in the declared enum
        }
    }

    static public WeekDay getWeekDay(String day){
        return WeekDay.valueOf(day);
    }
}
