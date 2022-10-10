package class14;

public class Task4 {
    //Create a method that will say Hello in different language based on the country that will passed
    // when method is executed

    void countryname(String country ){
        switch (country) {
            case "Pakistan":
                System.out.println("AssamoAleikum");
                break;
            case "Germany":
                System.out.println("Hallo");
                break;
            case "Sweden":
                System.out.println("Halla");
                break;
            case "Turkey":
                System.out.println("marhababa");
                break;
            case "Spain":
                System.out.println("Hola");
                break;
            case "USA":
                System.out.println("Hey");
                break;
            default:
                System.out.println(" Dont know whhat they say as Hello");
                break;
        }

}

    public static void main(String[] args) {
        Task4 input=new Task4();
        input.countryname("Pakistan");
    }
}
