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
public class RelationalOperators {
    public static void main(String[] args) {
        int a = 100;
        int b = 1000;

        int c = 100;
        int d = 1000;

        System.out.println("Less than : " + (a < b));
        System.out.println("Less than OR equal : " + (a <= c));

        System.out.println("Greater than : " + (d > c));
        System.out.println("Greater than OR equal : " + (d <= b));

        // Using equals() for Integer
        System.out.println("Less than : " + (Integer.valueOf(a) < Integer.valueOf(b)) );
        System.out.println("Greater than : " + (Integer.valueOf(d) > Integer.valueOf(c)));

        System.out.println("equals() : " + (Integer.valueOf(a).equals(Integer.valueOf(c))));
        System.out.println("a == c : " + (Integer.valueOf(a) == Integer.valueOf(c)));
        System.out.println("a == c : " + (Integer.valueOf(a) == Integer.valueOf(null)));

    }

    // Will not compile
    static void commonMistake(){
        int a = 100;
        int b = 1000;

        //if (a = b){
            System.out.println("a == b : " + (a == b));
       // }
    }
}
