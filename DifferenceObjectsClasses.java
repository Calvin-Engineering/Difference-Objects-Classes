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