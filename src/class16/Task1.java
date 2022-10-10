package class16;

public class Task1 {
    /*Create a method that will accept an array as parameters and will return a sum of all elements from that array.
     Method should be visibly only within same package and accessible by the creating an instance of the class.
     */
    int sum (int[] array){
    int sum=0;
    for (int j:array){
        sum +=j;}
    return sum;
    }

    public static void main(String[] args) {
        Task1 task = new Task1();
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(task.sum(arr));

    }
  }
