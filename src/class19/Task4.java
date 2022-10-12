package class19;

public class Task4 {
    /*
    Write program to inherit class A that has method printF which is static and call or reuse that method into class B
     */
    public static void main(String[] args) {
        firstA.printF();
    }
}
class firstA{
    static void printF(){
        System.out.println("Java is getting tough day by day");
    }

}
class firstB extends firstA{
    public static void main(String[] args) {
        firstB input=new firstB();
        input.printF();
    }

}