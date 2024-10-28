package com.learnprogramminginjava.implementationhiding;

public class SomeClassInSamePackage {
    AllAccessModifiers allAccessModifiers = new AllAccessModifiers();

    public SomeClassInSamePackage(){
        allAccessModifiers.aPublicMethod();
        //allAccessModifiers.
    }

}
