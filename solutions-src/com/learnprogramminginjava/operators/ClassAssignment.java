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
class Order{
    int orderId;
}

public class ClassAssignment {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
        order1.orderId = 1001;
        order2.orderId = 2001;

        // Each class is assigned its own
        // orderId
        System.out.println(order1.orderId);
        System.out.println(order2.orderId);

        // Now we assign the reference of Order1
        // to be the same reference of Order2.
        // Both objects now point to the same
        // chunk of memory
        order1 = order2;

        // What do we expect the orderId to be for Order2?
        System.out.println(order1.orderId);
        System.out.println(order2.orderId);

        // What happened to order1.orderId?

        // what happens if we null out the order2 instance?
        order2 = null;

        // Now what?
        System.out.println(order1.orderId);

    }
}
