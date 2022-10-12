package repls;

public class repls139 {
    /*
    Return a string that is composed of each letter as long as the letter is later on in the alphabet
     */
    String alphabetical(String str){
        char max=str.charAt(0);
        String result =String.valueOf(str.charAt(0));
        for (int i=0;i<str.length(); i++){
            if (max<str.charAt(i)){
                result+=String.valueOf(str.charAt(i));
                max=str.charAt(i);
            }
        }




        return result;
    }
    public static void main(String[]arg){
        repls139 output=new repls139();
        System.out.println(output.alphabetical("hello"));
        System.out.println(output.alphabetical("software"));
        System.out.println(output.alphabetical("language"));
    }
}
