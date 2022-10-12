package class18;

public class Book {
    /*Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed */
String name;
String about;
int pages;
String mainCharacter;

    Book(String name, String about) {
        this.name = name;
        this.about = about;
         System.out.println("Books name is "+ name +" and it is about"+ about);
    }
   Book (int pages,String mainCharacter){

         this.pages=pages;
         this.mainCharacter=mainCharacter;
        System.out.println(name+ " has "+ pages +" pages and its main character is "+mainCharacter);
    }

    public static void main(String[] args) {
        new Book("Snow White","princess");

       new Book(345,"princess");

       new Book("Snow White","dfds");
    }
}
