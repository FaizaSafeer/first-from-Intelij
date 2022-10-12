package class20;

public class HW1 {
  /*  Create 1 class in which create a methods that will calculate the area (volume in case of box) of
            Rectangle
    Square
            Box

    Use separate class to test your code*/
}
class area{
   void calculateArea(int a){
        System.out.println("Area of Square is "+(a*a));
    }
    void calculateArea(int l, int w){
        System.out.println("Area of rectangle is "+(l*w));
    }
    void calculateArea(int l,int w,int h){
        System.out.println("Area of box is "+ (l*w*h));
    }



}


