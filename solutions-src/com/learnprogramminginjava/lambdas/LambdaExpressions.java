package com.learnprogramminginjava.lambdas;

public class LambdaExpressions {

    interface BodyNoArgs {
        String brief();
    }

    interface BodyWithSingleArg {
        String singleArg(String arg1);
    }

    interface BodyWithMultipleArguments {
        String multipleArgs(String str, Double d);
    }

    static BodyNoArgs bodyNoArg = () -> "No Body But With Parentheses!";                                    // [4]

    static BodyWithSingleArg bodySingleArg = h -> h + " No Parentheses!";       // [1]

    static BodyWithSingleArg bodySingleArg2 = (h) -> h + " With Parentheses!";  // [2]

    static BodyWithMultipleArguments multiArgs = (str, d) -> str + d;    // [3]

    static BodyNoArgs multipleLinesInBody = () -> {                                   // [5]
        System.out.println("multipleLinesInBody - Line 1");
        return "return from multipleLinesInBody() with curly braces";
        // return required now!
    };

    public static void main(String[] args) {
        System.out.println(bodyNoArg.brief());

        System.out.println(bodySingleArg.singleArg("Oh!"));
        System.out.println(bodySingleArg2.singleArg("Hi!"));
        System.out.println(multiArgs.multipleArgs("Pi! ", 3.14159));
        System.out.println(multipleLinesInBody.brief());

    }
}
