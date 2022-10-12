package class19;

public class Task3 {
    /*
    Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A
     */
}
class classA{
    String name;
    String capital;
    String language;
    void generalInfo (String name,String capital,String language){
        System.out.println("Name"+ name+ " capital "+ capital + "language"+ language);
    }
}
class classB extends classA{
    int population;
    String largestCity;

     classB(int population, String largestCity) {
        this.population = population;
        this.largestCity = largestCity;
    }
}
class classC extends classB{
    String currency;
    int sinceILive;
    boolean isFriendly;

    classC(int population, String largestCity,boolean isFriendly, int sinceILive,String currency){
        super(population, largestCity);
this.isFriendly=isFriendly;
    this.sinceILive=sinceILive;
    this.currency=currency;
    }

}
class testclass{
    public static void main(String[] args) {
         classC input=new classC(2589073, "Sydney", true, 2017, "AUD");
        input.generalInfo("aus","canberra","english");
    }
}