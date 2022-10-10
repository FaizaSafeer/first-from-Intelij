package class14;

public class Task5 {
    //Create a method createEmail(). Based on values of users name, lastName and email type,
    // your method should return complete email Address. 
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
    
    String createEmail(String username,String lastname,String emailtype){
        return (username+lastname+"@"+emailtype).toLowerCase();
        
    }

    public static void main(String[] args) {
        Task5 email=new Task5();
        System.out.println(email.createEmail("faiza","safeer","gmail"));
    }
}
