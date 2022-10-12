package repls;

public class repls130 {
    /*
    Complete the mystery method so that it takes in an integer array as a parameter,
    and then modifies each element based on whether it's even or odd.

If the number is even, divide it by 2. If it's odd, multiply it by 10.
     */
    void mystery(int[]a){
        for (int i=0;i>a.length;i++){
            if (a[i]%2==0){
                System.out.println(a[i]/2);
            }else {
                System.out.println(a[i]*10);
            }
        }
    }

    public static void main(String[] args) {
        repls130 ans=new repls130();
        int[]a ={1,2,3,4,5,6,7,8,9,10};
     ans.mystery(a);
    }
}
