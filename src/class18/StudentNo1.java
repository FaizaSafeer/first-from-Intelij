package class18;

public class StudentNo1 {
    /*Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables. Print name & address of given
     student using displayInfo method.
     */
    String name;
    String address;

    public StudentNo1(String name, String address) {
        this.name = name;
        this.address = address;
    }
    void displayInfo(){
        System.out.println("Name "+ name + " Adress:"+address);
    }

    public static void main(String[] args) {
        StudentNo1 st1=new StudentNo1("Faiza","3/11 MurninStreet Wallsend");
        st1.displayInfo();
    }
}
