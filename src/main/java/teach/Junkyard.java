package teach;

public class Junkyard {


    public static void main(String[] args) {

        // creating an instance of Bike (child class)
        Bike bicycle = new Bike();
        bicycle.run();

        // creating an instance of Car (child class)
        Car car = new Car();
        car.run();

        //creating an instance of Junkyard
        Junkyard junk = null;

        String word = new String(); //created a String object called word


        /**
        *               instanceof
        *
        *       The java “instanceof” operator is used to test whether the object is
        *       an instance of the specified type (class or subclass).
        *       It is also known as type comparison operator because it compares the instance with type. ...
        *       If we apply this operator with any variable that has null value, it returns false
        **/

        System.out.println(car instanceof Car); //It will be true if the object is an instance of a subclass of the type

        //instanceof operator cannot be used if there is no relationship between
        //the object that is being compared and the type it is being compared with.
        System.out.println(junk instanceof Junkyard); //if object is null it will return false
        //System.out.println(junk);

        System.out.println(word instanceof String); // word object type is String

        if (car instanceof Vehicle) {
            System.out.println("car is instance of String");
        } else
            System.out.println("car is NOT instance of String");
    }


}
