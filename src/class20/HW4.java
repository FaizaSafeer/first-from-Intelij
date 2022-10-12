package class20;

public class HW4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with
    specific arguments and observe result.
     */
    private void info(String name){
        System.out.println("My name is "+name);
    }
    private void info(String name,int age){
        System.out.println("My name is "+ name +" and I am "+ age + " years old");
    }
    private void info(String name,String husbandName){
        System.out.println("My name is "+name+ " and my husband name is "+ husbandName);
    }

    public static void main(String[] args) {
        HW4 input1=new HW4();
       input1.info("faiza");
       input1.info("Faiza",16);
       input1.info("Faiza","Bilal");

    }
}
