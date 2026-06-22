# Difference Between Objects and Classes

## Overview

This Java project demonstrates the conceptual difference between a class and an object. It creates a `Car` class and then creates two separate `Car` objects from that class.

## Classes

A class is a blueprint or template used to describe a type of thing in a Java program. It defines the information that will be stored and the actions that can be performed. For example, the `Car` class in this project defines two fields, `color` and `year`, along with a method named `displayInformation()`.

The class itself is only a definition. It explains what a car object should contain and what it should be able to do.

## Objects

An object is a specific instance of a class that exists while the program is running. An object is created from a class by using the `new` keyword.

In this project, `carOne` and `carTwo` are objects created from the `Car` class. Although both objects use the same class, they contain different information. The first object represents a blue 2022 car, while the second represents a red 2024 car.

## Conceptual Differences

The main difference is that a class is the definition or blueprint, while an object is an actual instance created from that blueprint. A single class can be used to create many objects.

The class defines the fields and methods that are available. Each object receives its own copy of the instance data. Therefore, objects created from the same class can have different states while sharing the same types of behavior.

A real-world comparison would be a house blueprint and the houses built from it. The blueprint describes how the houses should be constructed, but it is not an actual house. Multiple houses can be built from the same blueprint, and each house can have its own address, paint color, and occupants.

## Java Example

```java
/*
 * Project: Difference-Objects-Classes
 *
 * This program demonstrates the difference between a class and an object.
 */

// A class is a blueprint that describes the data and behavior
// that its objects will have.
class Car {

    // These fields define the state that each Car object stores.
    private String color;
    private int year;

    // The constructor is used to create and initialize Car objects.
    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    // This method defines behavior that every Car object can perform.
    public void displayInformation() {
        System.out.println("This car is a " + year + " " + color + " car.");
    }
}

public class DifferenceObjectsClasses {

    public static void main(String[] args) {

        /*
         * carOne and carTwo are objects.
         * They are two separate instances created from the same Car class.
         * Each object has its own state, including its own color and year.
         */
        Car carOne = new Car("blue", 2022);
        Car carTwo = new Car("red", 2024);

        // Both objects use the behavior defined by the Car class.
        carOne.displayInformation();
        carTwo.displayInformation();
    }
}
```

## Program Output

```text
This car is a 2022 blue car.
This car is a 2024 red car.
```

The output demonstrates that both objects were created from the same class but contain their own individual values.

## Running the Program

Compile the program with:

```bash
javac -d out DifferenceObjectsClasses.java
```

Run the program with:

```bash
java -cp out DifferenceObjectsClasses
```
