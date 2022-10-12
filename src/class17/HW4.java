package class17;

public class HW4 {
    /*
    Write a java class that have 4 constructors with 4 different access levels of constructors
    (private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
     2 - from outside the class; 3 - from different class inside different package  and observe result.
     */
String name;
int height;
int  weight;
String favCar;
int age;

    private HW4(String name1,String carFav,int yourAge) {
name=name1;
favCar=carFav;
age=yourAge;
    }
    public HW4(int height1, int weight1){
        height=height1;
        weight=weight1;
    }
    HW4 (String car){
        favCar=car;
    }
    protected HW4(String name1, int age1){
        name=name1;
        age=age1;
    }

    public static void main(String[] args) {
        new HW4("sadia","Bmw",22);
        new HW4(170,51);
        new HW4("Bmw");
        new HW4("Faiza",32);



    }
}

