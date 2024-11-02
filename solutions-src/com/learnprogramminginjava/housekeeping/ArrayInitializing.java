package com.learnprogramminginjava.housekeeping;

public class ArrayInitializing {

    private static final String[] lastNames = {"Doe", "Smith", "Lee", "Mohamed", "Perez"};
    private static final String[] userNames = new String[lastNames.length];

    public static void main(String[] args) {

        for (int i = 0; i < lastNames.length; i++) {
            System.out.println("Lastname : " +  lastNames[i]);

            // lower case each last name and then assign the
            // username to that value
            userNames[i] = lastNames[i].toLowerCase();
        }

        System.out.println("                            ");
        System.out.println("----------------------------");
        System.out.println("                            ");

        for (int i = 0; i < lastNames.length; i++) {
            System.out.println("Username : " +  userNames[i]);
        }
    }
}
