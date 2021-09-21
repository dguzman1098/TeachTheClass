package teach;

public class Junkyard {


    public static void main(String[] args) {

        Bike bicycle = new Bike(); // creating an instance of Bike (child class)
        bicycle.run();

        Car car = new Car(); // creating an instance of Car (child class)
        car.run();

        Junkyard junk = new Junkyard(); //creating an instance of this class,

        //The java “instanceof” operator is used to test whether the object is
        // an instance of the specified type (class or subclass).
        // It is also known as type comparison operator because it compares the instance with type. ...
        // If we apply this operator with any variable that has null value, it returns false

        System.out.println(bicycle instanceof Vehicle); //It will be true if the object is an instance of a subclass of the type
        //System.out.println(junk instanceof Vehicle); //instanceof operator cannot be used if there is no relationship between the object that is being compared and the type it is being compared with.




    }


}
