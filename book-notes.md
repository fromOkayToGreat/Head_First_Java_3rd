# Chapter 1: Breaking the Surface

The lure of **write once, run anywhere** is too strong to resist.

The way Java works:
- **Source** code is written and saved in a file with a .java extension.
- **Compiler** checks for errors, and if there are none, it converts the source code into a **bytecode** file with a .class extension.
- **JVM** loads the bytecode file into memory and converts it into machine language.


## A very bried history of Java

Java was initially released in January 23, 1996. It's now over 25 years old.  Java as language, platform, and community has evolved a lot since then.  There is no doubt that much of the code encountered in the wild is quite old.  Java is famous for its backward compatibility, so old code can run quite well on new JVMs.

## Code structure in Java

**Source file > Class > Method > Statement**

A source code file (.java extension) typically holds one class.  This class represents a single concept.  The class must go withing a pair of curly braces. A class has one or more methods. A method is a block of code that performs a specific task.  A method must go within a pair of curly braces. Within the curly braces of a method, instructions for how the method should work are written.  A method is invoked by calling it by its name.


```java
class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare() {
        System.out.println("bang bang ba-bang");
    }

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }
}
```

## Anatomy of a class

When the JVM starts running, it looks for the class given at the command line.  Then it starts looking for the main() method.  The main() method is the entry point for the program.  The main() method is where the JVM starts executing the program and there may only be one main() method in a program.

```java
    public static void main(String[] args) {
        // code goes here
}
```
> `public` means that the method can be called from anywhere.  `static` means that the method belongs to the class, not to a particular object.  `void` means that the method does not return a value.  `main()` is the name of the method.  `String[] args` is the parameter list.  The parameter list is the list of variables that are passed to the method.  The parameter list is optional.  The parameter list is a comma-separated list of variable names enclosed in parentheses.  The parameter list is the list of variables that are passed to the method.  The parameter list is optional.  The parameter list is a comma-separated list of variable names enclosed in parentheses.

## Syntax Fun
- `//` is a single-line comment.
- `/* */` is a multi-line comment.
- All statements must end in a semicolo `;`.
- Most white space doesn't matter.
- Variables are declared with a type and a name.
- Classes and methods must be defined within a pair of curly braces.

## Looping and looping and...

### `while` loop
```java
while (condition) {
    // code goes here
}
```
> The key to a loop is the *conditional test*, in Java a conditional test is an expression that is either `true` or `false`.  The loop will continue to execute as long as the conditional test is `true`.  The loop will stop when the conditional test is `false`.

**Simple boolean tests**
`<` less than

`>` greater than

`==` equal to

`!=` not equal to

`<=` less than or equal to

`>=` greater than or equal to


## Conditional branching

In Java, an `if` test is basically the same as a boolean test in a `while` loop-except that the code inside the `if` statement is executed only if the test is `true`.  The `else` condition is executed only if the `if` condition is `false`.

```java
if (test) {
    // code goes here
} else {
    // code goes here
}
```

## `System.out.println` vs `System.out.print`

`System.out.println` prints a line and moves the cursor to the next line.  `System.out.print` prints a line and leaves the cursor at the end of the line.

## Coding a "serious" business application

See `ch1/10-green-bottles/BottleSong.java`

# Chapter 2: A Trip to Objectville

### When designing a class, thin aobut hte objects that will be created from that class type.  Think about:

- things the object **knows** (instance variables)
- things the object **does** (methods)

### instance variables

Represent the state of the object.  They are declared inside the class, but outside of any method.  They are declared with a type and a name.  They are initialized to a default value.  The default value for a numeric variable is `0`.  The default value for a boolean variable is `false`.  The default value for a reference variable is `null`.

### methods

Represent the behavior of the object.  It's common for an object to have methods that read or write the values of the instance variables.

## What's the difference between a **class** and an **object**?

**A class is not an object, but it's used to construct them.**

A Class is a blueprint for an object.  It tells the virtual machine *how* to make an object of that partiular type.  Each object made from that class cna have its ow nbalue for the instance variables.  Each object can have its own behavior, defined by the methods.  The class is the blueprint, the object is the house.

## Making your first object

To create and use a an object, you need to do the following:
1. Create *two classes*.  One class for the type of object you want to use, and one class to test the new class.
2. The *tester class* must have a `main()` method and inside the `main()` method, you must create an object of the new type.

## The Dot Operator (`.`)

The dot operator (`.`) gives you access to an object's state and behavior (instace variables and methods).

```java
Cat myCat = new Cat(); // Make a new Cat object
myCat.name = "Beau Nugget"; // Set the name of the Cat object
myCat.meow(); // Make the Cat object meow
myCat.age = 3;  // Set the age of the Cat object
```

## Making and testing Movie objects

See example `ch2/MovieTestDrive.java`

## Quick! Get out of main!

A true OO application needs objects talking to other objects, as opposed to a static mai() methjod creating and testing objects.

### The two uses of main:

1. to **test** your real classs
2. to **launc/start** your Java application

A *real* Java application is nothing but objects talking to ther objects.  *Talking* in this case means objects calling methods on one another.

## Java takes out the Garbage

Each time an object is created in Java, it goes into an area of memory known as **The Heap**.  All objectsd-no matter when, where, or how they're created-live on the heap.  In Java, the heap is actually called the **Garbage Collected Heap**.  The Java Virtual Machine (JVM) has a built-in garbage collector that runs in the background.  The garbage collector looks for objects that are no longer being used and removes them from the heap.  The garbage collector is a very important part of the Java language.  It's what makes Java so easy to use.  You don't have to worry about memory management.  You don't have to worry about freeing up memory when you're done with an object.  You don't have to worry about memory leaks.  You don't have to worry about memory fragmentation.

## TAKEAWAYS

- Object-oriented programming lets you extend a program without having to touch previously tested, working code.
- All Java code is defined in a **class**.
- A class describes how to make an object of that class type.  It's a blueprint.
- An object can take care of itself; you don't have to know or care how the object does it.
- An object **knows** and **does** things.
- Things an objeect knows about itself are called **instance variables**.  They represent the state of an object.
- Things an object does are called **methods**.  They represent the behavior of an object.
- When you create a class, you may also want to create a separate test class that you'll use to create objects of your new class type.
- A class can **inherit** instance variables and methods from a more abstract **superclass**.
- At runtime, a Java program is nothing more than objects "talking" to other objects.

---

# Chapter 3: Know Your Variables

**Variables** can store two types of things: **primitive data types** and **references**.

## Declaring a variable

**Java cares about type**.  Variables come in two flavors: **primitive** and **references**.

Primitives hold fundamental values (simple bit patterns) including integers, booleans, floating-point numbers, and characters.  References hold references to objects.

When declaring a variable, you must specify the type of the variable.  The type of the variable determines the size of the variable and the range of values that can be stored in the variable.

### Primitive data types

| Type | Bit Depth | Value Range |
| --- | --- | --- |
| boolean | (JVM-dependent) | **true** or **false** |
| char | 16-bit | 0 to 65,535 |
| byte | 8-bit | -128 to 127 |
| short | 16-bit | -32,768 to 32,767 |
| int | 32-bit | -2,147,483,648 to 2,147,483,647 |
| long | 64-bit | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float | 32-bit | 1.4E-45 to 3.4028235E38 |
| double | 64-bit | 4.9E-324 to 1.7976931348623157E308 |

### Primivite data types example

```java
boolean happy = true;
char letter = 'a';
byte b = 127;
short s = 32767;
int i = 2147483647;
long l = 9223372036854775807L;
float f = 3.14f;
double d = 3456.789;
```
> Note: The `L` and `f` suffixes are required to tell the compiler that the literal is a long and a float, respectively.

## You really don't want to spill that

**Be sure the value can fit into the variable**.  The compiler won't complain if you try to store a value that's too big for the variable.  It will just truncate the value.  For example, if you try to store the value `2147483648` in an `int` variable, the compiler will let you do it, but the value will be truncated to `-2147483648`.  If you try to store the value `3.14` in a `float` variable, the compiler will let you do it, but the value will be truncated to `3.140000104904175`.  **A smaller value can always be stored in a larger variable, but a larger value can't always be stored in a smaller variable.**
A value can be assigned in several ways including:
- type a *literal* value after the assignment operator (`=`) in the declaration. (x = 12, isFun = true)
- assign the value of one variable to another (x = y)
- use an *expression* (x = 12 + 3, isGreaterThanTen = x > 10)

## Back away from that keyword

Reserved words are keywords that the compiler recognizes and uses to parse your code.  You can't use reserved words as variable names.  Here are some of the reserved words:

### You can name a class, method, or variable according to the following rules:
- The name must begin with a letter or an underscore (`_`). It can't begin with a number.
- The name can contain letters, numbers, and underscores.
- The name is case sensitive (`MyClass` is not the same as `myclass`).
- The name can't be a reserved word.

### This table is reserved for reserved words


| _ | catch | double | float | int | private | super | true |
| abstract | char | else | for | interface | protected | switch | try |
| assert | class | enum | goto | long | public | synchronized | void |
| boolean | const | extends | if | native | return | this | volatile |
| break | continue | false | implements | new | short | throw | while |
| byte | default | final | import | null | static | throws | |
| case | do | finally | instanceof | package | strictfp | transient | |

## No such things as Object varibles

- There is no such thing as an `Object` variable.  There are only variables that can hold references to objects.
- An object reference variable holds bits that represent the address of the object in memory.
- It doesn't hold the object itself, but it holds something like a pointer.  In Java, we don't really know what is inside a reference variable.  We do know that whatever it is, it represents one and only one object.  The JVM uses the reference variable to find the object in memory.
- Objects live in place only, and only one place: the heap.  The heap is a big pool of memory that the JVM uses to store objects.  The heap is managed by the JVM's garbage collector.  The garbage collector looks for objects that are no longer being used and removes them from the heap.


1. Declare a reference variable.
2. Create an object.
3. Assign the reference variable to the object.

## An array is like a tray of cups

Arrays are great when you just want a quick, ordered, efficient list of things. Arrays give you fast random access by letting you use an index positionto get to any element in the array.  Anything you would put in a variable can go in an array.  You can even put arrays in arrays.  Arrays are **homogeneous**.  That means that all the elements in an array must be of the same type.

An array is an **object** that holds a fixed number of values of a single type.  The number of values is determined when the array is created.  The type of the values is determined when the array is created.  The values are called **elements**.


## TAKEAWAYS

- Variables come in two flavors: primitive and reference.
- Variables must always be declared with a name and type.
- A primitive variable value is the bits representing the value.
- A reference variable value is the bits representing the address of the object in memory.
- A reference variable is like a remote control.  Using the doc operator (`.`) on a reference variable is like pressing a button on the remote control to access a method or instance variable in the object.
- A reference variable has a value of `null` when it is not pointing to an object..
- An array is always an object, even if the array is declared with a primitive type.





