package class16;

public class Task2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
     Method should be available to all classes within your project and accessible by class name.
     */
public String input (String s){
    StringBuilder sb=new StringBuilder(s);
    return sb.reverse().toString();


   // for (int i=s.length()-1; i>=0 ;){
    //}

}

    public static void main(String[] args) {
        Task2 str=new Task2();
        System.out.println(str.input("hello"));
    }
}
