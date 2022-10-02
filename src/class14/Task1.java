package class14;

public class Task1 {

    //Create a method that will take 2 parameters as a numbers and prints which number is larger.

    void greaternum(int x,int y){
        if (x>y){
            System.out.println("Larger value is " + x);
        }else {
            System.out.println("Larger value is " + y);
        }
    }

    public static void main(String[] args) {
        Task1 num=new Task1();
        num.greaternum(10,4);
    }
}
