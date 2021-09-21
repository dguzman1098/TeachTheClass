package teach;

//child class
public class Car extends Vehicle {

    //not required to use '@Override' annotation, but it is
    //good practice to do so and to prevent errors.

    public void run(){
        System.out.println("engine is running");
    }
}
