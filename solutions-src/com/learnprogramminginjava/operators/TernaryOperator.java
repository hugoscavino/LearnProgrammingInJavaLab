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
public class TernaryOperator {

    final static int ADULT_AGE = 18;

    static String canVote(int age){
        // Ternary is commonly on a one line return statement
        return (age >= ADULT_AGE) ? "Eligible to vote" : "Not eligible to vote";
    }

    public static void main(String[] args) {
        int age = 20;
        // The return values are String
        String votingAgeMessage = canVote(age);
        System.out.println(votingAgeMessage);
    }
}
