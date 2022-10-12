package repls;

public class repls142 {
}
class SyntaxTechnologies{
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;


    public SyntaxTechnologies() {
    }

    public SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }
    void displayMethod(){

        System.out.println(schoolName+batch+year+lastDayOfClass);
    }
}

class main {
    public static void main(String[]arg){
        SyntaxTechnologies input1=new SyntaxTechnologies();
        input1.displayMethod();
        SyntaxTechnologies input2=new SyntaxTechnologies("Syntax ",6,2020," 07/30/2020");;

        input2.displayMethod();
    }}