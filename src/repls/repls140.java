package repls;

public class repls140 {
    static String maxLength(String []arr){
        int size=arr.length;
        String maxLength=arr[0];
        for (int i=0;i<arr.length; i++){

            if(arr[i].length() >maxLength.length()){
                maxLength=arr[i];
            }}return maxLength;
    }



    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
}
