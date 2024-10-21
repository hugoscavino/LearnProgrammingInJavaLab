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
public class Assignment {
    public static void main(String[] args) {

        int x = 100;
        // What would expect to be printed for x?
        System.out.println(x);

        // What would expect to be printed for y?
        int y = x;
        System.out.println(y);

        // What happens to y if I change the value of x? 100 or 200?
        x = 200;
        System.out.println(y);
    }
}
