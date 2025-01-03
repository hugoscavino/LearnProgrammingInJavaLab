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

package com.learnprogramminginjava.basics.utils;

public class CanineUtils {

    static public final short DOG_YEAR_FACTOR = 7;

    /**
     * Convert a human's age into Dog Years using
     * the dog year ratio of 1:7.
     *
     * @param humanAge Human's age
     * @return Human's age in terms of a dog years.
     */
    static public double getDogYears(double humanAge){
            return humanAge / DOG_YEAR_FACTOR;
    }

    /** Convert a Dog's age into Human Years
     *
     * @param dogAge The Human's age
     * @return Multiply the dog's age by the relative life span of a dog
     */
    static public double getHumanYear(double dogAge){
        return dogAge * DOG_YEAR_FACTOR;
    }
}
