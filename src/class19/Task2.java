package class19;

public class Task2 {
    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
     In circle class create a method to calculate the area of circle. Test your code
     */

}
class shape{
    double radius;
    shape (double radius){
        this.radius=radius;
    }
}
class circle extends shape{
    circle(double radius) {
       super( radius);
    }
  void  area(){
        double area1=Math.PI*radius*radius;
        System.out.println(area1);
 }
}
class testtask2 {
    public static void main(String[] args) {
        circle cir= new circle(10.5);
       cir.area();
    }
}