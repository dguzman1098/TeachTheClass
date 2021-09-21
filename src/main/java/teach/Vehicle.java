package teach;

//Overriding - https://www.javatpoint.com/method-overriding-in-java
//instanceof - https://www.educative.io/edpresso/what-is-the-instanceof-operator-used-for-in-java

/**
 * Override - What is it?
 *  a feature that allows a subclass or child class to provide a specific implementation of
 *  a method that is already provided by one of its super-classes or parent classes
 */

//parent class
public class Vehicle {

    //If subclass (child class) has the same method as declared in the parent class,
    // it is known as method overriding in Java.
    //a static method cannot be overwritten

    //methods
    public void run(){
        System.out.println("Vehicle is running");
    }


}
