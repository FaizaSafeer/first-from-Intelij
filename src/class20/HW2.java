package class20;

public class HW2 {
/*
Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
then the message "I love programming languages" should be printed. If some String is passed to it, then in place of
"programming languages" the value variable should be printed. Example, if we pass "Java", then "I love Java" should be printed.
 */

}
class Programming{
    String language;
    void programming(){
        System.out.println("I love programming language");
    }
    void programming(String language){
        System.out.println("I love "+language);
    }

    public static void main(String[] args) {
        Programming input=new Programming();
        input.programming();
        input.programming("java");
       // Programming input2=new Programming();
       // input2.programming("Java");
    }
}