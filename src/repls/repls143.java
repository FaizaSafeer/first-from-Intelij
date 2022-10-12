package repls;

public class repls143 {
}
class Car {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    public Car(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    public Car(String make, String model,int topSpeed, double price) {
        this(make,model,4,topSpeed,price);
    }
    public Car( int numberOfDoors, int topSpeed, double price){
        this("unknown", "unknown", numberOfDoors,topSpeed,price);
    }
    public Car(String make, String model, int numberOfDoors){
        this(make,model,numberOfDoors,90,0);
    }
    void display(){
        System.out.println(make+" "+ model+" "+numberOfDoors+" "+topSpeed+""+price);
    }
    }
class carTester{
    public static void main(String[] args) {


        Car input1 = new Car("Toyota", "Prius", 4, 120, 30000);
        input1.display();
        Car input2=new Car("Toyota","Prius",4,120,30000);
        input2.display();
        Car input3=new Car(4,120,30000);
        input3.display();
        Car input4=new Car("Toyota","prius", 4);
        input4.display();
    }
}
//}