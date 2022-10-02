package class14;

public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        //mostly used newer faster
        StringBuilder stringBuilder=new StringBuilder("Today is java class");
  //older one slow andd not used mostly
   StringBuffer stringBuffer=new StringBuffer ("Today is java class");
   // builder n buffer are same builder is new version

        //if we want to convert string to string builder we use below
     String str="Java is easy";
     StringBuilder StringBuilder=new StringBuilder(str);
        System.out.println("StringBuilder = " + StringBuilder);

       // IF we want to convert from a StringBuilder to A String we can use
       // the below syntax

      //  String newStr=stringBuilder1.toString();
    }
}
