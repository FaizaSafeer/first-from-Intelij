package repls;

public class repls131 {
    static String thirdLetter(String s){
        String  thirdLetter="";
        for (int i=0;i<s.length(); i+=3){

            thirdLetter=thirdLetter+ s.charAt(i);
        }return thirdLetter;
    }


    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}
