package class19;

public class Task5 {
    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class. Create 3 subclasses MathTeacher,
     ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes
     */
}
class teacher{
    String name;
    boolean isFriendly;
    String education;

    public teacher(String name, boolean isFriendly, String education) {
        this.name = name;
        this.isFriendly = isFriendly;
        this.education = education;
    }

    void printInfo(){
        System.out.println("Mam/Sir "+name+ "has done "+education+"and she/he is friendly"+isFriendly);
    }
}
class MathTeacher extends teacher{
    int experience;
    int salary;

    public MathTeacher(String name, boolean isFriendly, String education,int experience, int salary) {
        super(name, isFriendly, education);
        this.experience = experience;
        this.salary = salary;
    }
}
class ChemistryTeacher extends teacher{
    String schoolName;
    int height;

    public ChemistryTeacher(String name, boolean isFriendly, String education,String schoolName, int height) {
        super(name,isFriendly, education);
        this.schoolName = schoolName;
        this.height = height;
    }
}
class PianoTeacher extends teacher{
    String favintrument;
    int ownsIntruments;

    public PianoTeacher(String name, boolean isFriendly, String education,String favintrument, int ownsIntruments) {
        super(name, isFriendly, education);
        this.favintrument = favintrument;
        this.ownsIntruments = ownsIntruments;
    }
}
class testclass123{
    public static void main(String[] args) {
        PianoTeacher input=new PianoTeacher("Faiza",true, "Masters", "piano",5);
        input.printInfo();
        ChemistryTeacher input2=new ChemistryTeacher("Yasmeen", true, "Masters","Siddeeq public school",5);
        input2.printInfo();
    }
}