package com.learnprogramminginjava.implementationhiding;
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

public class AllAccessModifiers {

    public void aPublicMethod(){
        System.out.println("Public Method");
    }
    protected void aProtectedMethod(){
        System.out.println("Protected Method");
    }
    void aDefaultMethod(){
        System.out.println("Default Method");
    }
    private void aPrivateMethod(){
        System.out.println("Private Method");
    }

    public static void main(String[] args) {
        AllAccessModifiers allAccessModifiers = new AllAccessModifiers();
        allAccessModifiers.aPublicMethod();
        allAccessModifiers.aProtectedMethod();
        allAccessModifiers.aDefaultMethod();
        allAccessModifiers.aPrivateMethod();
    }
}
