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
public class Precedence {

    public static void main(String[] args) {

        int x = 100;
        int y = 200;
        int z = 300;

        // What would expect from adding the three values?
        // 600?
        System.out.println(x + y + z);

        // Now What?
        // Is it 602 or is the result or 502?
        System.out.println(x + y + 4/2 + z);

        // Now What?
        // Is it 602 or is the result or 502?
        System.out.println(x + (y + 4)/2 + z);

        //Why do we need to guess? Stop it! Use parentheses all the time!
    }
}
