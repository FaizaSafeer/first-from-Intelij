package class14;

public class Task6 {
    //Write a method to return whether given number is prime or not?
void prime(int num){
    if (num>1){
        for (int i =0; i<num; i++){
            if (num%2==0){
                System.out.println(num + "is not prime number");
                break;
            }else {
                System.out.println(num+ " is prime number");
                break;
            }
        }
    }

}

    public static void main(String[] args) {
    Task6 input=new Task6();
        input.prime(7);

    }
}
