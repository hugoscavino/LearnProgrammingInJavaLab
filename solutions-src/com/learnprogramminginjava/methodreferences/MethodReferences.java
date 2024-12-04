package com.learnprogramminginjava.methodreferences;

public class MethodReferences {
    static void sayHello(String s){
        System.out.println("Hello, user " + s);
    }

    static class Discussion{
        String about;

        Discussion(String about){
            this.about=about;
        }

        void assist(String msg){
            System.out.println(about + " " + msg);
        }
    }

    static class Assistant{
        static void assist(String msg){
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        Discuss discuss = new Discuss();
        // We are equating methods with the same
        // signatures to each other
        Callable c = discuss::amongstOurselves;
        c.call("Calling Call with Discuss method");
    }

}
