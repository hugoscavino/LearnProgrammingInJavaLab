package com.learnprogramminginjava.anotherpackage;

import com.learnprogramminginjava.implementationhiding.AllAccessModifiers;

public class SomeOtherClass {
        AllAccessModifiers allAccessModifiers = new AllAccessModifiers();

        public SomeOtherClass() {
            allAccessModifiers.aPublicMethod();
            //allAccessModifiers.

        }
}
