package class14;

import java.util.Arrays;

public class stringrecap {
    public static void main(String[] args) {
        String str="djfjkdbvjr&%8438gbvs";
        // it takes to arguement (to values
        str=str.replaceAll("[^a-zA-Z]", "");
        System.out.println("str = " + str);
        String sentence="batch 14 is great.batch 12 is excellent?batch 14 is amazing";
        String[] split = sentence.split("[.?]");
        System.out.println("split = " + Arrays.toString(split));
       String str2="batch 14 is great.batch 14 is great";
        String s = str2.replaceFirst("great", "good");
        System.out.println("s = " + s);
    }
}
