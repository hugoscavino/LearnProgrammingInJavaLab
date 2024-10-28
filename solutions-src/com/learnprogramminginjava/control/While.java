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

import java.time.LocalDateTime;

import static java.lang.Thread.sleep;

public class While {
    public static void main(String[] args) throws InterruptedException {

        // value from 0 through 59
        int currentMinute = LocalDateTime.now().getMinute();

        final int initialMinute = currentMinute;
        // Will loop for at most 59 seconds
        while (initialMinute == currentMinute) {
            // update the currentMinute, the while at the end of the loop re-evaluates
            // condition
            currentMinute = LocalDateTime.now().getMinute();
            // sleep for a second so we do not clog the console
            sleep(1000);
            int currentSecond = LocalDateTime.now().getSecond();
            System.out.println(currentSecond);
        }
    }
}
