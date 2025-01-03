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
package com.learnprogramminginjava.basics;

import com.learnprogramminginjava.basics.utils.CanineUtils;

public class Canine {

    // age of the dog
    int age;

    // Owner's address
    Address home;

    // Has been seen by the vet
    boolean isVaccinated;

    // First and Last Name
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public Canine() {
        this.isVaccinated = false;
    }

    public Canine(String name, boolean isVaccinated, int age, Address home) {
        this.name = name;
        this.isVaccinated = isVaccinated;
        this.age = age;
        this.home = home;
    }

    /**
     * Given an Address called `from`, the function returns the number of miles
     * from the provided Address to the Canine's Address
     * @param from The provided Address to calculate the oneway distance
     * @return The number of miles, as a double, between the Canine's home and the `from`
     */
    public double getDistanceInMiles(Address from) {
        // calculate distance `from` the Canine's home address
        // Use external mapping API like Google Maps or the Phone's Mapping software
        // Implementation is not important for this example
        return 1.00;
    }

    /**
     * Get the dog age if they were a human
     * @param dogAge Age of the dog
     * @return Dog's age if they were a human
     */
    public double getHumanAge(double dogAge) {
        return CanineUtils.getHumanYear(dogAge);
    }

    public static void main(String[]args) {

        Canine dog = new Canine();
        dog.name = "Fido";
        dog.isVaccinated = false;
        dog.age = 5;

        // What will this print out?
        System.out.println(dog.age);
    }
}


