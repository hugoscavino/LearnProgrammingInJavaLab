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
