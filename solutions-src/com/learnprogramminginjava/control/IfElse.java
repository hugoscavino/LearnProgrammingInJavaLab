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
