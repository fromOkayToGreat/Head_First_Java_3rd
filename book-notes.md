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



