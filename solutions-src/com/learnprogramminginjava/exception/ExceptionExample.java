package com.learnprogramminginjava.exception;

import java.sql.SQLException;

public class ExceptionExample {

    // Runtime Exception there is not a throws clause in the signature
    void divideByZero() {
        int result = 10 / 0;
    }

    // Checked Exception. Look the signature must declare the throws
    void processSomething() throws Exception{
        if(true) {
            throw new Exception("Something went wrong");
        }
    }

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException ae) {
            System.out.println("Cannot divide by zero: " + ae.getMessage());

        } catch (Exception e) {
            System.out.println("Something else bad happened: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }

        try {
            int result = 10 / 0; // This will throw an ArithmeticException
            if(true) {
                throw new SQLException("Something went wrong in DB");
            }
        } catch (ArithmeticException  | SQLException e){
            System.out.println(e.getMessage());
        }
  }

}
