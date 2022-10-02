package class14;

public class Task2 {
   // Create a method that will take a number and prints whether the number is even or odd.

void evenOdd (int num){
    if (num%2==0){
        System.out.println(num+ " is even number");
    }else {
        System.out.println(num + " is odd number");
    }

}


    public static void main(String[] args) {
        Task2 iseven=new Task2();
        iseven.evenOdd(2);
    }

}
