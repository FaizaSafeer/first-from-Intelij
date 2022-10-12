package class19;

public class Task1 {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
     Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
     Print users name, mobile number and address in userDetails method. Test your code.
     */

}
class userClass{
    String name;
    String mobileNumber;
    userClass(String name, String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;

    }
}
class userInfo extends userClass{
    String address;

    public userInfo(String name, String mobileNumber,String address) {
        super(name,mobileNumber);
        this.address = address;
    }
    void userDetail(){
        System.out.println("Name "+name+"Mobile No. "+mobileNumber+ " Address "+address );
    }
}
class test {
    public static void main(String[] args) {
         userInfo user1=new userInfo("Faiza", "03005169555", "WallsendNSW");
       user1.userDetail();
    }
}