package com.learnprogramminginjava.operators;
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
public class LogicalOperators {
    public static void main(String[] args) {
        int age = 16;
        final int ADULT_AGE = 18;
        boolean hasParentPermission = true;

        if (age >= ADULT_AGE || hasParentPermission) {
            System.out.println("Can Attend Party if an adult OR has parent's permission.");
        }

        if (age >= ADULT_AGE && hasParentPermission) {
            System.out.println("Can Attend Party only if an adult AND has parent's permission.");
        } else {
            System.out.println("Can NOT Attend Party.");
        }

        if (!hasParentPermission) {
            // do something
        } else {
            System.out.println("Easier to read and say does not have permission " +
                    "versus hasParentPermission == false");
        }

    }
}
