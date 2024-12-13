[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/2BQdyuhn)
# CS230X-lab2-F24
# Objects and Arrays

In this lab, you will work on structuring a class to represent an Animal object, and practice with array manipulations.

Goals:
- [ ] Practice with user-defined classes and objects in Java
- [ ] Manipulating arrays of primitive data types (int, double)
- [ ] Using java API and javadoc


## Task 1: Animal - User-Defined Classes

You will create a class to represent an Animal object. Start by creating a new Animal class in the starter project.

1. **Step 1: Start by defining your INSTANCE VARIABLES:**

Although there are many properties that one might choose to describe an animal, in this lab will using these:

- **type:** the type of animal (e.g. horse, frog, dog, etc)
- **name:** the name of the animal (e.g. Tonto, Froggy, Spot, etc)
- **weight:** the weight of the animal
- **foodType:** the type of food this animal eats
- **numberOfFeeds:** the number of feeds this animal has every day
- **quantityPerFeed:** the percentage of their body weight that the animal needs to eat at each feed

> Tip: When we declare a new instance variable, there are three main things to think of: its visibility modifier (public or private), its type (e.g., String, int, boolean), and its name (e.g., type, weight, foodType). 

2. **Step 2: Write two CONSTRUCTORS for your Animal Class:**
   
The job of a constructor is to initialize the values of each instance variable. For this step, you must write two constructors. A certain class might have more than one constructor, they must differ by the number and types of its parameters. 

In your Animal class, you must have one constructor that takes 6 parameters, one for each of the instance variables. For example, here are a couple sample invocations of your constructor:

```
/* These are invocations of your constructor */
Animal animal1 = new Animal("armadillo","Charlotte", 15.0, "grain", 4, 0.05);
Animal animal2 =  new Animal("hedgehog","Heidi", 1.0, "grass", 10, 0.2);
Animal animal3 =  new Animal("koala","Chichi", 20.0, "eucalyptus", 1, 0.05);
```

The other constructor only takes a name and type, and sets default values for all other instance variables. Notice that the second constructor can be written in a way that takes advantage of the first (already defined) constructor:

```
public Animal(String type, String name) {
    this(type, name, 0, "", 1, 0.05); // calls the constructor that takes 5 inputs
}
```

3. **STEP 3: Write a MAIN() method:**

Write the main() method. Its header (almost) always looks exactly the same: `public static void main (String [] args)`

In it, create a few Animal objects, by calling the Animal constructor. 

Compile and run your program. Nothing much should happen, but at least you can be sure that you do not have any errors so far!

4. **STEP 4: Write the all-important TOSTRING() method:**

> Tip: As good programming practice, we recommend that you always write a toString() method early on in the definition of a Java class. This allows you to see the current state of your object and is really useful when debugging.

Write the toString() method, in the Animal class, to produce something similar (doesn't have to be exact) to this:

Code in main()
```
System.out.println(animal1); // Note: toString() call is implicit
```

Text produced
```
Animal: Charlotte is a armadillo
Weight: 15.0 lbs
Eats: grain
```

Test your code by printing out the Animal objects you created in the main() method earlier. Does your code work as expected? Any mistakes pop up? No worries -- mistakes are the best opportunity to learn. Make sure to fix any potential mistakes that come up before moving on. 

5. **STEP 5: Write some "GETTER" and "SETTER" methods:**

A "getter" method simply accesses and returns the value of an instance variable. For your Animal class, these are possible getters:

```
getType()
getName()
getWeight()
getFoodType()
getNumberOfFeeds()
getQuantityPerFeed()
```

Write each of these getters. Test them in the main().

Parallel to a "getter" method, a "setter" method allows the user to change (or "set") the values of an instance variable.  Setter methods are always void. Each setter method should take a parameter with the value to assign to a particular instance variable. 

Some values should not be changed. In the case of our animal, we don't want to let anyone change the name or type of an animal. Write the setters corresponding to the instance variables that can be changed. Test the setters in the main().

6. **STEP 6: write some additional INSTANCE METHODS:**

```
public double amountEatenPerFeed(): amount in lbs of food eaten each feed by this animal
public double amountEatenPerDay(): amount in lbs of food eaten each day by this animal
public double frequencyOfFeeds(): the number of hours between feeds in a 24h day
```

Tip: As you start defining a new method, start by identifying its purpose. Remember, a method is trying to capture behavior for the object you're defining. So, should the method take any parameter? What should the method return? In the beginning, we will provide hints to help you in this decision-making process, but you will soon have to make these decisions by yourself. This power is one of the joys of programming (and with it, comes great responsibility, as we'll learn in the course).  

7. **STEP 7: update the TOSTRING() method:**

Now that you can get more information about an animal, update the `toString()` to also return information about the animal's feeding schedule. The `toString()` should look like this:

```
Animal: Charlotte is a armadillo
Weight: 15.0 lbs
Eats: grain
Schedule: 0.75 lbs every 6.0 hours
```

8. **STEP 8: Add some JAVADOC:**

Take a look at the following resource: [javadoc from Oracle](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html)
Using this resource, add some javadoc to your program in a header comment on each method. In CS230X, it will be enough to use the following tags:

@author<br>
@param<br>
@return<br>

In the BlueJ Editor window, from the drop down menu, in the upper right corner, you can choose "Documentation" to see the javadoc generated by your class file. 

NOTE: From now on, I will expect this type of javadoc in all the assignments you submit.

## Task 2: Fun with Arrays

In this task, you will practice manipulating the elements of arrays containing primitive data types such as int. 

Complete the methods in the starter code for FunWithArrays.java and invoke them appropriately from the `main()` to test each one of them on the given array with values `arrayWithValues` and the empty array `arrayEmpty`.

In the stater code, you are given a constructor and instance variable for the FunWithArrays class. You are also given a static method `printArray(int[] array)` that you can use to print any of the arrays produced by other methods in your program. A static method is called on the class rather than on an object. You should not modify the constructor, instance variable or `printArray(int[] array)` in this class. You will need to update all the methods with TODO comments and update the `main()`.

## SAVING YOUR WORK ON GITHUB
As we have discussed in class, it is important to work on labs and assignments regularly and save frequently. You should test your work incrementally, which will require you to save your file before compiling/running it. In addition to saving your work on your local machine, you should also frequently push your work to this Github repository. You can refer to Lab0 and the [Git and Github tutorial](https://github.com/CS230X-F24/github-starter-course) for a refresher on using these tools. 

## SUBMITTING TO GRADESCOPE
Turn in your work submitting files Animal.java and FunWithArrays.java to your Gradescope account for Lab2. You will receive full credit for this lab if you submit a reasonable attempt at completing the lab by the deadline. [Click here for Gradescope instructions.](https://docs.google.com/document/d/1zGAJrbdAhfPZVlyDP9N3MmdKXWvNo7rQqehKNM5Q0_M/edit) 

## AUTOGRADER
When you submit your lab to Gradecope, you will immediately see some feedback through the autograder. You are welcome to resubmit as many times as you wish until the deadline. The autograder will check for accuracy, style, and documentation. Make sure there are no remaining `TODO` comments in your submission code. Click here for 230X instructions on: [testing your code](https://docs.google.com/document/d/19cKOyolT8UtSfMNrVw8MGgVWS-lYgHpBs8g2Cf_8Vvc/edit#heading=h.rt39ohf1jp6s), [styling your code](https://docs.google.com/document/d/14uwj9HAjNKfFBm0ZjUpWR7jdqKSj13rudIEJaG74mPk/edit), and [documenting your code](https://docs.google.com/document/d/15uqs_NH8y2sAuLLpiZuSxlI0UsL6a8CHuWY_qcvF4B4/edit). 

## LAB SOLUTIONS
Lab solutions will be added to this repository after the lab deadline. 
