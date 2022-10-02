package class14;

public class Task3 {
   // Create a method that will print whether given String is palindrome or not.
    
    void palindrome (String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        if(sb.toString().equals(str)){
            System.out.println("The string is palindrome");
        }else{
            System.out.println("the string is not palindrome");
        }
        
    }

    public static void main(String[] args) {
        Task3 word=new Task3();
        word.palindrome("mom");
    }
    
    
    
}
