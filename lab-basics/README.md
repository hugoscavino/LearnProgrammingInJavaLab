Copyright © 2024 LearnProgrammingInJava.com
   
Licensed under the MIT License (the "License"); you may not use this file except
in compliance with the License.
You may get a copy of the License at

     https://opensource.org/licenses/MIT

Unless required by applicable law or agreed to in writing, software distributed
under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

---

# Learn Programming in Java

## Lab Basics

The lab overview:

1) Creates two classes.
2) Add fields to the `Canine` class
3) Add methods to the `Canine` class
4) Import the `CanineUtil` class into Canine
5) Creates a `main` method in the `Canine` class and converts human age into dog years by invoking the `getDogYears` method

## Create the Canine Class and Package

1) Create a class using the intelliJ IDE.
2) Call the class Canine
3) In the `student-src` src directory, right mouse on the directory and create the pacakge called 
   1) `com.learnprogramminginjava.basics`
4) Then inside that package create a class called `Canine`
   1) Select the package and using the right-mouse command choose `New` then `Java Class`
   2) Name the new class `Canine`

## Create the CanineUtils Class and Package

1) Select the package you created earlier
2) Choose the `new` option from the right menu and choose package
3) The current package name should appear
4) Add the package name `utils` at the end of the package name
5) A package called `com.learnprogramminginjava.basics.utils` should exist now under the previous package

## Add Fields to the Canine class
1) Add the below fields to the Canine class with the corresponding types
2) Type in the fields in the class 
3) Select the class and start typing after `public class Canine {`
4) On a separate line create one of the following
5) By default, the fields have package scope. The fields should be declared as `private` instead

| Field        | Type      |
|--------------|-----------|
| age          | int       |
| isVaccinated | boolean   |
| name         | String    |


## Add static Fields to the CanineUtils class
1) Add the below field to the Canine class with the corresponding types
2) Type in the field in the class
3) Select the class and start typing after `public class CanineUtils {`
4) By default, the `DOG_YEAR_FACTOR` field has package scope. The fields should be declared as `public` so that all classes can read the value. The `final` keywords prevents other clients from changing the value 
5) make sure the field is set to `static` and also `final`, that is, once set the value cannot be changed again.

| Field           | Type    |  Default Value |
|-----------------|---------|---------------:|
| DOG_YEAR_FACTOR | double  |              7 |

## Add Method to the Canine class
1) Add the below method to the Canine class with the corresponding method name, arguments, and return type.
2) Add a comment to the method and describe in your words what it should do.
3) Do not implement it yet.
4) The compiler will show an error, proceed to the next step

| Method Name | Argument Type | Argument name | Return Type |
|-------------|---------------|---------------|-------------|
| getHumanAge | double        | dogAge        | double      |

## Add a static Method to the CanineUtils class
1) Add the below static method to the CanineUtils class with the corresponding method name, arguments, and return type.
2) Add a comment to the method and describe in your words what it should do.
3) Take the argument passed in to your method and multiply it by the static field `DOG_YEAR_FACTOR`
4) Return the result of dogAge multiplied by `DOG_YEAR_FACTOR` (aka 7)

| Method Name | Argument Type | Argument name | Return Type |
|-------------|---------------|---------------|-------------|
| getHumanAge | double        | dogAge        | double      |

## Implement the Method in the Canine class
1) In the `getHumanAge` method call the static method from the `CanineUtils` class you created in the previous step
2) Recall, to invoke the static method type the name of the class, then dot (`.`), then the name of the static method.
3) IntelliJ will display the method name as soon as you type the name of the class and the dot.
4) Immediately return the value in this method
5) In summary, the `Canine` class method `getHumanAge` will call the static method in the `CanineUtils` class. You will pass in the argument from your class to the static method and return the result.
6) See the slides if you get stuck.
