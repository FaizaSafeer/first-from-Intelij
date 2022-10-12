package class20;

public class HW3 {
    /*
    Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method
    with specific arguments and observe result.
     */
}
class multiply1{
    static  void multiply(int a , int b){
        System.out.println("The answer of mutiplying "+a+ "and "+b +"is "+ (a*b));
    }
    static void multiply(int a, int b, int c){
        System.out.println("The answer of mutiplying "+a+","+b+  "and "+c +"is "+ (a*b*c));
    }
    static void multiply(int a, int b, int c,int d){
        System.out.println("The answer of mutiplying "+a+","+b+","+c+  "and "+d +"is "+ (a*b*c*d));
    }

    public static void main(String[] args) {
        multiply(2,2);
        multiply(2,2,2);
        multiply(2,2,2,2);
    }

}