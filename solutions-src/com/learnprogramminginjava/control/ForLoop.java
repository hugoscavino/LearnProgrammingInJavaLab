/************************************************************************************
 * Copyright © 2024 LearnProgrammingInJava.com
 * Licensed under the MIT License (the "License"); you may not use this file except
 * in compliance with the License. You may get a copy of the License at
 *     <a href="https://opensource.org/licenses/MIT">MIT License</a>
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 ************************************************************************************/
package com.learnprogramminginjava.control;

import java.util.Calendar;

public class ForLoop {
    public static void main(String[] args) {

        // Start at Sunday and loop through the days of the week
        // convert the integer to a day of the week
        for (int dayOfWeekInt = Calendar.SUNDAY; dayOfWeekInt <= Calendar.SATURDAY; dayOfWeekInt++){
            String dayOfWeekStr = toDayName(dayOfWeekInt);
            System.out.println("For Each Day of Week [Sunday first day of the week] : " + dayOfWeekStr);
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");

        int[] DaysOfWeekArray = {Calendar.SUNDAY, Calendar.MONDAY, Calendar.TUESDAY, Calendar.WEDNESDAY,
                Calendar.THURSDAY, Calendar.FRIDAY, Calendar.SATURDAY};

        for (int dayOfWeekInt : DaysOfWeekArray) {
            String dayOfWeekStr = toDayName(dayOfWeekInt);
            System.out.println("For Each Day of Week [Sunday first day of the week] : " + dayOfWeekStr);
        }

        // Questionable use of break
        for (int dayOfWeekInt : DaysOfWeekArray) {
            String dayOfWeekStr = toDayName(dayOfWeekInt);

            if (dayOfWeekStr.equals("Wednesday")) {
                break;
            }
            System.out.println("For Each Day of Week [Sunday first day of the week] : " + dayOfWeekStr);
        }
    }

    /**
     * Enhanced Switch
     * @param dayOfWeek int representation of the week
     * @return String representation of the week
     */
    static String toDayName(int dayOfWeek) {
        return switch (dayOfWeek) {
            case Calendar.SUNDAY -> "Sunday";
            case Calendar.MONDAY -> "Monday";
            case Calendar.TUESDAY -> "Tuesday";
            case Calendar.WEDNESDAY -> "Wednesday";
            case Calendar.THURSDAY -> "Thursday";
            case Calendar.FRIDAY -> "Friday";
            case Calendar.SATURDAY -> "Saturday";
            default -> "Unknown";
        };
    }

    /**
     * Legacy Switch
     * @param oneLetter one letter as a char
     * @return Boolean is a vowel or not
     */
    static boolean isVowel(char oneLetter) {
        return isVowel(String.valueOf(oneLetter));
    }

    /**
     * Legacy Switch
     * @param oneLetter one letter as a String
     * @return Boolean is a vowel or not
     */
    static boolean isVowel(String oneLetter) {
        boolean isVowel;
        switch (oneLetter) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                isVowel = true;
                break;  // caution forgetting this line
                        // is a wicked bug
            case "y":
                System.out.println("sometimes");
                isVowel = true;
                break;
            default:
                isVowel = false;
                break;
        };

        return isVowel;
    }
}
