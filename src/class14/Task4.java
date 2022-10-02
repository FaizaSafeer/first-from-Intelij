package class14;

public class Task4 {
    //Create a method that will say Hello in different language based on the country that will passed
    // when method is executed

    void countryname(String country ){
        if (country.equals("Pakistan")){
            System.out.println("AssamoAleikum");
        }else if (country.equals("Germany")){
            System.out.println("Hallo");
        }else if (country.equals("Sweden")){
            System.out.println("Halla");
        }else if  (country.equals("Turkey")){
            System.out.println("marhababa");
        }else if  (country.equals("Spain")){
            System.out.println("Hola");
        }else if (country.equals("USA")){
            System.out.println("Hey");
        }else {
            System.out.println(" Dont know whhat they say as Hello");
        }

}

    public static void main(String[] args) {
        Task4 input=new Task4();
        input.countryname("Pakistan");
    }
}
