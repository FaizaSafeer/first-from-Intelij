package class17;

public class HW1 {
    /*
    Write a java class that will have a constructor: one with parameters and second without any parameters.
     Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
    String name;
    String Lname;
    String favColor;
    String favCar;
    String hobby;
    int age;

    public HW1(){
        System.out.println("Hello");
    }


    public HW1(String name, String lname, String favColor, String favCar, String hobby, int age) {
        this.name = name;
        Lname = lname;
        this.favColor = favColor;
        this.favCar = favCar;
        this.hobby = hobby;
        this.age = age;
    }
}
